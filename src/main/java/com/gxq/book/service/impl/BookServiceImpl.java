package com.gxq.book.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gxq.book.dao.AuditEventDao;
import com.gxq.book.dao.BookDao;
import com.gxq.book.dto.BookDetailDto;
import com.gxq.book.dto.BookListDto;
import com.gxq.book.entity.AuditEvent;
import com.gxq.book.entity.BookInfo;
import com.gxq.book.entity.BookItem;
import com.gxq.book.enumeration.AuditTypeEnum;
import com.gxq.book.enumeration.BookStatus;
import com.gxq.book.enumeration.StatusEnum;
import com.gxq.book.service.BookService;
import com.gxq.book.utils.PageModel;
import com.gxq.book.utils.UUIDIdentifierGenerator;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private AuditEventDao auditDao;

	@Override
	public PageModel<BookListDto> getBookList(int pageNo, int pageSize) {
		PageModel<BookListDto> pm = new PageModel<BookListDto>();
		pm.setPageSize(pageSize);
		pm.setPageNo(pageNo);
		List<BookItem> bookList = bookDao.getBookList((pageNo-1)*pageSize, pageSize);
		List<BookListDto> dtos = new ArrayList<BookListDto>();
		if(bookList != null && !bookList.isEmpty()){
			for(BookItem book : bookList){
				BookListDto dto =  BookListDto.buildFrom(book);
				dtos.add(dto);
			}
		}
		pm.setList(dtos);
		
		//get count
		int totalRecords = bookDao.getCount();
		pm.setTotalRecords(totalRecords);
		pm.setTotalPages(pm.getPages());
		AuditEvent auditEvent = new AuditEvent();
		auditEvent.setDateTime(new Date());
		auditEvent.setEvent("query Book List");
		auditEvent.setStatus(StatusEnum.SUCCESED);
		auditEvent.setType(AuditTypeEnum.QUERY);
		auditEvent.setUserName("test");
		auditEvent.setUserId(111);
		auditDao.save(auditEvent);
		return pm;
	}

	@Override
	public void saveBook(String isbn, String name, String author, String publisher, int type, float price, String version, String publishDate) 
	 throws Exception {
		boolean existFlag = false;
		BookInfo bookInfo = bookDao.findBookByISBN(isbn);
		if(bookInfo == null){
			bookInfo = bookDao.findBookByNameAuthorPublisher(name, author, publisher);
			if(bookInfo != null){
				existFlag = true;
			}
		}else{
			existFlag = true;
		}
		BookItem book = new BookItem();
		if(existFlag){
			book.setBookInfo(bookInfo);
		}else{
			bookInfo = new BookInfo();
			bookInfo.setAuthor(author);
			bookInfo.setBookVersion(version);
			bookInfo.setCreateDate(new Date());
			bookInfo.setIsbn(isbn);
			bookInfo.setName(name);
			bookInfo.setPrice(price);
			bookInfo.setPublisher(publisher);
			bookInfo.setPublishDate(publishDate);
			bookInfo.setUpdateDate(new Date());
			bookDao.saveBookInfo(bookInfo);
			book.setBookInfo(bookInfo);
		}
		book.setCreateDate(new Date());
		book.setStatus(BookStatus.STORAGE);
		book.setUpdateDate(new Date());
		book.setUid(UUIDIdentifierGenerator.generate());
		bookDao.saveBookItem(book);
		AuditEvent auditEvent = new AuditEvent();
		auditEvent.setDateTime(new Date());
		auditEvent.setEvent("save Book");
		auditEvent.setStatus(StatusEnum.SUCCESED);
		auditEvent.setType(AuditTypeEnum.ADD);
		auditEvent.setUserId(111);
		auditEvent.setUserName("test");
		auditDao.save(auditEvent);
	}

	@Override
	public void deleteBook(int bookId) {
		BookItem bookItem = bookDao.getBookById(bookId);
		if(bookItem != null){
			bookItem.setBookInfo(null);
			bookDao.saveBookItem(bookItem);
			bookDao.deleteBook(bookId);
		}
		AuditEvent auditEvent = new AuditEvent();
		auditEvent.setDateTime(new Date());
		auditEvent.setEvent("delete Book");
		auditEvent.setStatus(StatusEnum.SUCCESED);
		auditEvent.setType(AuditTypeEnum.DELETE);
		auditEvent.setUserId(111);
		auditEvent.setUserName("test");
		auditDao.save(auditEvent);
	}

	@Override
	public BookDetailDto getBookDetailById(Integer bookId) {
		BookItem bookItem = bookDao.getBookById(bookId);
		return BookDetailDto.buildFrom(bookItem);
	}

	@Override
	public void updateBook(int bookId, String isbn, String name, String author, String publisher, int type, float price,
			String version, String publishDate) throws Exception {
		BookItem bookItem = bookDao.getBookById(bookId);
		if(bookItem != null){
			BookInfo bookInfo = bookItem.getBookInfo();
			bookInfo.setAuthor(author);
			bookInfo.setBookVersion(version);
			bookInfo.setIsbn(isbn);
			bookInfo.setName(name);
			bookInfo.setPrice(price);
			bookInfo.setPublishDate(publishDate);
			bookInfo.setPublisher(publisher);
			bookInfo.setUpdateDate(new Date());
			bookItem.setBookInfo(bookInfo);
			bookItem.setUpdateDate(new Date());
			bookDao.updateBook(bookItem);
		}
		AuditEvent auditEvent = new AuditEvent();
		auditEvent.setDateTime(new Date());
		auditEvent.setEvent("update Book");
		auditEvent.setUserId(111);
		auditEvent.setStatus(StatusEnum.SUCCESED);
		auditEvent.setType(AuditTypeEnum.MODIFY);
		auditEvent.setUserName("test");
		auditDao.save(auditEvent);
	}

}
