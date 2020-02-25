
package com.ironManSocial.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

/*Basic User Class*/

@Entity//(name="USER")
public class User {

	/* Instance Variable declaration */
	
	private String firstName;
	private String lastName;
	
	@Id
	private String userName;

	private String userPassword;

	private int userAge;

	private String userEmail;

	private String gender;
	
	private Date dob;
	
	// Default constructor
	public User() {

	}

	/* User parameterized constructor Creation */

	public User(String firstName, String lastName, String userName, String userPassword, int userAge, String userEmail,
			String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.gender = gender;
	}

	/* Setters & Getters for instance variables */

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}