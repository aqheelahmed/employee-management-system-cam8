package com.digitiumitservices.ems.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	private String country;
	private String state;
	private String city;
	private String hno;
	private String street;

}
