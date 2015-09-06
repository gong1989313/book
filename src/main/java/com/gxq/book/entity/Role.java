package com.gxq.book.entity;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Book entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "t_ctl_role", catalog = "book")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	// Fields
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "CODE")
	private String code;
	
	@Column(name = "NAME")
	private String name;
	
	  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	  @JoinTable(name = "t_ctl_user_role", joinColumns = {
	      @JoinColumn(name = "ROLEID")}, inverseJoinColumns = {
	      @JoinColumn(name = "USERID")})
	  private Set<User> users = new HashSet<User>();

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String code, String name) {
		this.name = name;
		this.code = code;
	}

	// Property accessors
	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", code=" + code + ", name=" + name + ", users=" + users + "]";
	}
	
	/*public void addUser(User user) {
        if (!this.users.contains(user)) {
            this.users.add(user);
            user.setRoles(new HashSet<Role>().add(this));
        }
    }
	
	public void removeUser(User user) {
        if(this.students.contains(student)){
            student.setTeacher(null);
            this.students.remove(student);
        }
    }*/
}
