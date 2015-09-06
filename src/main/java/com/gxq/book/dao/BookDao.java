package com.gxq.book.dao;

import java.util.List;

import com.gxq.book.entity.BookInfo;
import com.gxq.book.entity.BookItem;


public interface BookDao {

	public List<BookItem> getBookList(int pageNo, int pageSize);
	
	public BookInfo findBookByISBN(String isbn);
	
	public BookInfo findBookByNameAuthorPublisher(String name, String author, String publisher);
	
	public void saveBookItem(BookItem book);
	
	public void saveBookInfo(BookInfo book);
	
	public void deleteBook(Integer id);
	
	public void updateBook(BookItem book);
	
	public BookItem getBookById(Integer id);
	
	public int getCount();
}
