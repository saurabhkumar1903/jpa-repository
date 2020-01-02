package com.jpa.manytomany.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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

	@ManyToMany(mappedBy="laptops")
	private List<Student> students;

}
