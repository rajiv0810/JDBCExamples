package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student {

	@Id
	@Column(name = "STUDENTID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentID;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "EMAIL")
	private String emailID;

	@Column(name = "CITY")
	private String city;

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student(String lastName, String firstName, String emailID, String city) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.emailID = emailID;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", lastName=" + lastName + ", firstName=" + firstName + ", emailID="
				+ emailID + ", city=" + city + "]";
	}
	
	

}
