package com.app.bean;

public class Flight_passanger {
	
	private int id;
	private String name,username,password,email,gender,country;
	public Flight_passanger(int id, String name, String username, String password, String email, String gender,
			String country) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.country = country;
	}
	public Flight_passanger() {	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
//	
//	@Override
//	public String toString() {
//		return "Flight_passanger [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
//				+ ", email=" + email + ", gender=" + gender + ", country=" + country + "]";
//	}
//	
	
	
	
}
