package com.appjars.saturn.model;

import java.util.Date;

@SuppressWarnings("serial")
public class Person extends BaseEntity<Integer> {

	private String name;
	private String lastName;
	private Date birthDay;

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

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public Integer getId() {
		return id;
	}

}
