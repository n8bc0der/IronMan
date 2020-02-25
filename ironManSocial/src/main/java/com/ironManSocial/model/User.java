/*			Basic User Class								*/

package com.ironManSocial.model;

public class User {


/*			Instance Variable declaration					*/
	
	private String firstName;
	private String lastName;
	private String userName;
	
	private String userPassword;
	
	private int userAge;
	
	private String userEmail;
	
	private String Gender;


/*			User Parameterized Constructor Creation			*/	
	
	User(String firstName, String lastName, String userName, String userPassword, int userAge, String userEmail, String Gender){
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.userPassword =userPassword;
		this.userAge = userAge;
		this.userEmail = userEmail;
		this.Gender = Gender;
	}
	

/*			Setters & Getters for instance variable		*/
	
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
	
	public String getGender() {
		return Gender;
	}
	
	public void setGender(String Gender) {
		this.Gender = Gender;
	}
}