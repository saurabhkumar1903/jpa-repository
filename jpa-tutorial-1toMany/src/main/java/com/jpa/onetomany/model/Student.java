package com.jpa.onetomany.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="student")
@Getter
@Setter
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue
	private int sid;
	@Column
	private String sname;
	
	@OneToMany(mappedBy="student")
	private List<Laptop> laptops;
	
	
	

}
