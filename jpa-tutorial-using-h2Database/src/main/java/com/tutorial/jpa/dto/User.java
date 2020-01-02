package com.tutorial.jpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "users")
@ToString
@Getter
@Setter
public class User {

	@Id
	@Column(name = "uid")
	@GeneratedValue
	private int id;

	@Column(name = "uname")
	private String name;

	@Column(name = "urole")
	private String role;

	public User() {
		super();
	}

	public User(String name, String role) {
		this.name = name;
		this.role = role;
	}

}
