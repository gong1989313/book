package com.gxq.book.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/*.xml" })
public class BookDaoTest {
	@Autowired(required = true)
	private BookDao bookDao;

	@Test
	public void testGetBookList() {
		/*List<BookItem> books = bookDao.getBookList();
		System.out.println(books.toString());*/
	}
	
	@Test
	public void testGetCount() {
		int number = bookDao.getCount();
		System.out.println("----------------------------"+number+"-------------------------");
	}

	@Test
	public void testSaveBookList() {
		//System.out.println(bookDao.getBookList());
	}

	@Test
	public void testUpdateBookList() {
		/*BookItem book = new BookItem();
		book.setStatus(BookStatus.STORAGE);
		book.setCreateDate(new Date());
		book.setUpdateDate(new Date());
		book.setUid(UUIDIdentifierGenerator.generate());
		bookDao.saveBook(book);
		System.out.println("ok");*/
	}
}
