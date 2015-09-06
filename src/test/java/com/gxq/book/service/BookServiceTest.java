package com.gxq.book.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gxq.book.dto.BookListDto;
import com.gxq.book.utils.PageModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/*.xml" })
public class BookServiceTest {
	@Autowired(required = true)
	private BookService bookService;

	@Test
	public void testGetBookList() {
		PageModel<BookListDto> pm = bookService.getBookList(1, 10);
		List<BookListDto> books = pm.getList();
		Assert.assertTrue(pm.getPageNo() == 1);
		Assert.assertTrue(pm.getPageSize() == 10);
		Assert.assertFalse(books.isEmpty());
	}

	@Test
	public void testSaveBookList() {
		/*try {
			bookService.saveBook("test111", "test", "test", "test", 123, 11.0f, "test", "test");
			bookService.saveBook("test111", "test", "test", "test", 123, 11.0f, "test", "test");
			bookService.saveBook("test222", "test", "test", "test", 123, 11.0f, "test", "test");
			Assert.assertTrue(true);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}*/
	}

/*	@Test
	public void testUpdateBookList() {
		BookItem book = new BookItem();
		book.setStatus(BookStatus.STORAGE);
		book.setCreateDate(new Date());
		book.setUpdateDate(new Date());
		book.setUid(UUIDIdentifierGenerator.generate());
		bookDao.saveBook(book);
		System.out.println("ok");
	}*/
}
