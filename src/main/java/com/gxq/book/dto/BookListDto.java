package com.gxq.book.dto;

import java.io.Serializable;

import com.gxq.book.entity.BookInfo;
import com.gxq.book.entity.BookItem;
import com.gxq.book.enumeration.BookStatus;

public class BookListDto implements Serializable {

	private static final long serialVersionUID = -7557696018090776521L;
	private int bookId;
	private String ISBN;
	private String name;
	private String author;
	private String publisher;
	private String uid;
	private String type;
	private String status;
	private int bookInfoId;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBookInfoId() {
		return bookInfoId;
	}

	public void setBookInfoId(int bookInfoId) {
		this.bookInfoId = bookInfoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static BookListDto buildFrom(BookItem book) {
		if(book == null){
			return null;
		}
		BookListDto dto = new BookListDto();
		dto.setBookId(book.getId());
		dto.setUid(book.getUid());
		dto.setUid(book.getUid());
		BookStatus status = null;
		if((status = book.getStatus()) != null){
			dto.setStatus(status.toString());
		}
		BookInfo bookInfo = book.getBookInfo();
		if(bookInfo != null){
			dto.setName(bookInfo.getName());
			dto.setBookInfoId(bookInfo.getId());
			dto.setAuthor(bookInfo.getAuthor());
			dto.setISBN(bookInfo.getIsbn());
			dto.setPublisher(bookInfo.getPublisher());
		}
		return dto;
	}

}
