package com.gxq.book.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import com.gxq.book.enumeration.BookStatus;
import com.gxq.book.utils.UUIDIdentifierGenerator;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_bus_book_item", catalog = "book")
public class BookItem implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	// Fields
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "UID")
	private String uid;
	
	@Column(name = "CREATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;
	
	@Column(name = "UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;
	
	@Version
	@Column(name = "VERSION")
	private Integer version;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private BookStatus status;
	
	@ManyToOne
	@JoinColumn(name = "INFOID")
	@NotFound(action=NotFoundAction.IGNORE)
	private BookInfo bookInfo;
	
	
	@PrePersist
	public void onPrePersist() {
		uid = UUIDIdentifierGenerator.generate();
		Date now = new Date();
		createDate = now;
		updateDate = now;
	}

	@PreUpdate
	protected void onUpdate() {
		updateDate = new Date();
	}

	// Constructors
	/** default constructor */
	public BookItem() {
	}


	/** full constructor */
	public BookItem(Integer id, String uid, BookInfo bookInfo, BookStatus status, Date createDate,
			Date updateDate, Integer version) {
		super();
		this.id = id;
		this.uid = uid;
		this.bookInfo = bookInfo;
		this.status = status;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.version = version;
	}

	// Property accessors
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public BookInfo getBookInfo() {
		return bookInfo;
	}

	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	public BookStatus getStatus() {
		return status;
	}
	public void setStatus(BookStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "BookItem [id=" + id + ", uid=" + uid + ", createDate=" + createDate + ", updateDate=" + updateDate
				+ ", version=" + version + ",  status=" + status + ", bookInfo=" + bookInfo + "]";
	}
}