package com.gxq.book.dao.impl;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.gxq.book.dao.BookDao;
import com.gxq.book.entity.BookInfo;
import com.gxq.book.entity.BookItem;

@Repository
public class BookDaoImpl  implements BookDao {
	
	private HibernateTemplate hibernateTemplate;
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Autowired
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public List<BookItem> getBookList(int pageNo, int pageSize) {
		@SuppressWarnings("unchecked")
		List<BookItem> bookItems = (List<BookItem>)getHibernateTemplate().executeFind(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From BookItem order by createDate desc");
				query.setFirstResult(pageNo);
				query.setMaxResults(pageSize);
				return query.list();
			}
		});
		return bookItems;
	}
	
	public BookInfo findBookByISBN(String isbn) {
		BookInfo BookInfo = (BookInfo)getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From BookInfo b Where b.isbn =:isbn ");
				query.setParameter("isbn", isbn);
				return query.uniqueResult();
			}
		});
		return BookInfo;
	}
	
	@Override
	public BookInfo findBookByNameAuthorPublisher(String name, String author, String publisher) {
		BookInfo BookInfo = (BookInfo)getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				Query query = session.createQuery("From BookInfo b Where b.isbn =:isbn AND b.name =:name AND b.publisher =:publisher");
				query.setParameter("isbn", name);
				query.setParameter("name", author);
				query.setParameter("publisher", publisher);
				return query.uniqueResult();
			}
		});
		return BookInfo;
	}
	
	public int getCount() {
		BigInteger result = (BigInteger) getHibernateTemplate().execute(new HibernateCallback() {
			@Override
			public Object doInHibernate(Session session) throws HibernateException, SQLException {
				SQLQuery query = session.createSQLQuery("select count(1) From t_bus_book_item"); 
				return query.uniqueResult();
			}
		});
		return result.intValue();
	}
	

	public void saveBookItem(BookItem book) {
		getHibernateTemplate().save(book);
	}
	
	public void saveBookInfo(BookInfo book) {
		getHibernateTemplate().save(book);
	}

	public void deleteBook(Integer id) {
		getHibernateTemplate().delete(getBookById(id));
		
	}

	public void updateBook(BookItem book) {
		getHibernateTemplate().update(book);
	}

	public BookItem getBookById(Integer id) {
		BookItem book = (BookItem)getHibernateTemplate().get(BookItem.class, id);
		return book;
	}
}
