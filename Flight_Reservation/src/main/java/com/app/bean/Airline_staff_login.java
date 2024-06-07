package com.app.bean;

public class Airline_staff_login {
	
	private int id;
	private String username,eamil,password;
	
	public Airline_staff_login(int id, String username, String eamil, String password) {
		this.id = id;
		this.username = username;
		this.eamil = eamil;
		this.password = password;
	}
	
	public Airline_staff_login() {	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEamil() {
		return eamil;
	}

	public void setEamil(String eamil) {
		this.eamil = eamil;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

//	@Override
//	public String toString() {
//		return "Airline_staff_login [id=" + id + ", username=" + username + ", eamil=" + eamil + ", password="
//				+ password + "]";
//	}
		
	
}
