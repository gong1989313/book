package com.gxq.book.bak;

import org.apache.commons.lang3.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ExceptionMapping;
import org.apache.struts2.convention.annotation.ExceptionMappings;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;

import com.gxq.book.dto.BookListDto;
import com.gxq.book.service.BookService;
import com.gxq.book.utils.PageModel;
import com.opensymphony.xwork2.ActionSupport;

@ParentPackage(value = "json-default")
@Namespace("/book")
@ExceptionMappings({ @ExceptionMapping(exception = "java.lange.RuntimeException", result = "error") })
public class BookAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Autowired
	private BookService bookService;
	
	//使用josn返回List对象  
	private PageModel<BookListDto> bookListDtos;     

	@Action(value = "bookView", results = { @Result(name = "success", type="json") })
	public String bookView() {
		String pageNo = ServletActionContext.getRequest().getParameter("pageNo");
		String pageSize = ServletActionContext.getRequest().getParameter("pageSize");
		if(pageNo != null && pageSize != null){
			bookListDtos = bookService.getBookList(Integer.parseInt(pageNo), Integer.parseInt(pageSize));
		}
		return SUCCESS;
	}
	
	@Action(value = "bookAdd", results = { @Result(name = "success", type="json") })
	public String addBook() {
		String isbn = ServletActionContext.getRequest().getParameter("isbn");
		String name = ServletActionContext.getRequest().getParameter("name");
		String author = ServletActionContext.getRequest().getParameter("author");
		String publisher = ServletActionContext.getRequest().getParameter("publisher");
		String type = ServletActionContext.getRequest().getParameter("type");
		String price = ServletActionContext.getRequest().getParameter("price");
		String version = ServletActionContext.getRequest().getParameter("version");
		String publishDate = ServletActionContext.getRequest().getParameter("publishDate");
		int typeInt = -1;
		if(!StringUtils.isBlank(type) && StringUtils.isNumeric(type)){
			typeInt = Integer.parseInt(type);
		}
		float priceFloat = 0.0f;
		if(!StringUtils.isBlank(price)){
			priceFloat =  Float.parseFloat(price);
		}
		try {
			bookService.saveBook(isbn, name, author, publisher, typeInt, priceFloat, version, publishDate);
		} catch (Exception e) {
			e.printStackTrace();
		}
		bookListDtos = bookService.getBookList(1, 10);
		return SUCCESS;
	}
	
	@Action(value = "bookUpdate", results = { @Result(name = "success", type="json") })
	public String updateBook() {
		String bookId = ServletActionContext.getRequest().getParameter("bookId");
		if(!StringUtils.isBlank(bookId) && StringUtils.isNumeric(bookId)){
			String isbn = ServletActionContext.getRequest().getParameter("isbn");
			String name = ServletActionContext.getRequest().getParameter("name");
			String author = ServletActionContext.getRequest().getParameter("author");
			String publisher = ServletActionContext.getRequest().getParameter("publisher");
			String type = ServletActionContext.getRequest().getParameter("type");
			String price = ServletActionContext.getRequest().getParameter("price");
			String version = ServletActionContext.getRequest().getParameter("version");
			String publishDate = ServletActionContext.getRequest().getParameter("publishDate");
			int typeInt = -1;
			if(!StringUtils.isBlank(type) && StringUtils.isNumeric(type)){
				typeInt = Integer.parseInt(type);
			}
			float priceFloat = 0.0f;
			if(!StringUtils.isBlank(price)){
				priceFloat =  Float.parseFloat(price);
			}
			try {
				int bookIdInt = Integer.parseInt(bookId);
				bookService.updateBook(bookIdInt, isbn, name, author, publisher, typeInt, priceFloat, version, publishDate);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		bookListDtos = bookService.getBookList(1, 10);
		return SUCCESS;
	}
	
	@Action(value = "deleteBook", results = { @Result(name = "success", type="json") })
	public String deleteBook() {
		String bookId = ServletActionContext.getRequest().getParameter("bookId");
		if(!StringUtils.isBlank(bookId) && StringUtils.isNumeric(bookId)){
			try {
				bookService.deleteBook(Integer.parseInt(bookId));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		bookListDtos = bookService.getBookList(1, 10);
		return SUCCESS;
	}

	public void setBookService(BookService bookService) {
		this.bookService = bookService;
	}

	public PageModel<BookListDto> getBookListDtos() {
		return bookListDtos;
	}

	public void setBookListDtos(PageModel<BookListDto> bookListDtos) {
		this.bookListDtos = bookListDtos;
	}
}
