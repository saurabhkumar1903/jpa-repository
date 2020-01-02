package com.jpa.onetomany.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "laptop")
@Getter
@Setter
@NoArgsConstructor
public class Laptop {
	@Id
	@GeneratedValue
	private int lid;
	@Column
	private String lname;

	@ManyToOne
	private Student student;

}
