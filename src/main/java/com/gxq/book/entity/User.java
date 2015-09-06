package com.gxq.book.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.gxq.book.enumeration.AccountStatus;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_ctl_user", catalog = "book")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	// Fields
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "USERNAME")
	private String userName;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING)
	private AccountStatus status;
	
	@Column(name = "CREATE_DATE")
	private Date createDate;
	
	@Column(name = "UPDATE_DATE")
	private Date updateDate;
	
	@Column(name = "VERSION")
	@Version
	private Integer version;
	
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "users" ,fetch=FetchType.LAZY)
	private Set<Role> roles = new HashSet<Role>(); 
	
	// Constructors
	/** default constructor */
	public User() {
	}
	
	public User(Integer id, String userName, String password, String name,
			String email, String address, AccountStatus status, Date createDate,
			Date updateDate, Integer version) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.address = address;
		this.status = status;
		this.createDate = createDate;
		this.updateDate = updateDate;
		this.version = version;
	}

	// Property accessors
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	public AccountStatus getStatus() {
		return status;
	}


	public void setStatus(AccountStatus status) {
		this.status = status;
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

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", name=" + name + ", email="
				+ email + ", address=" + address + ", status=" + status + ", createDate=" + createDate + ", updateDate="
				+ updateDate + ", version=" + version + "]";
	}
	
}
