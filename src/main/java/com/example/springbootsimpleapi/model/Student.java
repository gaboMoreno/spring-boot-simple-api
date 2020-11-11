package com.example.springbootsimpleapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.springframework.data.domain.Persistable;

@Entity
@Table
public class Student  {

	@Id
	@Column
	private Integer id;

	@Column
	private String name;

	@Column
	private String lastName;

	@Column
	@NotBlank(message = "Address can not be empthy!")
	private String address;

	@Column
	@Pattern(regexp="^[0-9]{8}",message="Not a valid 8 digit number")
	private String phone;

	@Email
	private String email;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
//	@Transient
//	private boolean update;
//
//	public boolean isUpdate() {
//		return this.update;
//	}
//
//	public void setUpdate(boolean update) {
//		this.update = update;
//	}
//
//	@PrePersist
//	@PostLoad
//	void markUpdated() {
//		this.update = true;
//	}
//
//	@Override
//	public boolean isNew() {
//		 return !this.update;
//	}
}