package com.tutorial.jpa.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="booking")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

	@Id
	@Column(name = "bid")
	private int id;
	@Column(name = "bname")
	private String name;

}
