package com.javadevjournal.profilemanagement.domain;

import javax.persistence.*;

@Entity
@Table(name = "employee_profile")
public class EmployeeProfile {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "address")
	private String address;
}
