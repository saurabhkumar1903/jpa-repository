package com.jpa.onetoone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "address")
@NoArgsConstructor
@Getter
@Setter
public class Address {

	@Id
	@GeneratedValue
	private int aid;

	@Column
	private String streetname;

	@OneToOne
	private User user;

}
