package com.gxq.book.service;

import com.gxq.book.dto.BookDetailDto;
import com.gxq.book.dto.BookListDto;
import com.gxq.book.utils.PageModel;

public interface BookService {
	public PageModel<BookListDto> getBookList(int pageNo, int pageSize);

	public void saveBook(String isbn, String name, String author, String publisher, int type, float price, String version, String publishDate) throws Exception;
	
	public void updateBook(int bookId, String isbn, String name, String author, String publisher, int type, float price, String version, String publishDate) throws Exception;
	
	public void deleteBook(int bookId);
	
	public BookDetailDto getBookDetailById(Integer bookId);
}
