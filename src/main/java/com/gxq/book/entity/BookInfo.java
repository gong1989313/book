package com.gxq.book.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_bus_bookinfo", catalog = "book")
public class BookInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Fields
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "ISBN")
	private String isbn;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "AUTHOR")
	private String author;
	
	@Column(name = "PUBLISHER")
	private String publisher;
	
	@Column(name = "CLASSID")
	private Integer classId;
	
	@Column(name = "PRICE")
	private float price;
	
	@Column(name = "BOOK_VERSION")
	private String bookVersion;
	
	@Column(name = "PUBLISH_DATE")
	private String publishDate;
	
	@Column(name = "CREATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name = "UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	
	@OneToMany(mappedBy="bookInfo", fetch = FetchType.EAGER)
	private Set<BookItem> books = new HashSet<BookItem>();
	
	public BookInfo() {
	}
	
	public BookInfo(Integer id, String isbn, String name, String publisher,
			Integer classId, Date createDate, Date updateDate) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.name = name;
		this.publisher = publisher;
		this.classId = classId;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	
	// Property accessors
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public Integer getClassId() {
		return classId;
	}
	public void setClassId(Integer classId) {
		this.classId = classId;
	}
	
	public Set<BookItem> getBooks() {
		return books;
	}

	public void setBooks(Set<BookItem> books) {
		this.books = books;
	}
	
	public void addBook(BookItem bookItem){   
		bookItem.setBookInfo(this);
        this.books.add(bookItem);   
    }

	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getBookVersion() {
		return bookVersion;
	}

	public void setBookVersion(String bookVersion) {
		this.bookVersion = bookVersion;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "BookInfo [id=" + id + ", isbn=" + isbn + ", name=" + name + ", publisher=" + publisher + ", classId="
				+ classId + ", createDate=" + createDate + ", updateDate=" + updateDate + "]";
	}

}
