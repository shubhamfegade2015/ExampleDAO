package com.quinnox.springhotelmanagement.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userId")
	private int userId;
	
	@NotEmpty
	@Column(name="userName")
	private String userName;
	
	@NotEmpty
	@Column(name="emailId")
	private String emailId;
	
	@NotEmpty
	@Column(name="password")
	private String password ;
	
	@Column(name="phoneNumber")
	private long phoneNumber;
	
	@NotEmpty
	@Column(name="address")
	private String address;
	
	@NotEmpty
	@Column(name="gender")
	private String gender;
	

}

