package com.app.bean;

import java.sql.Date;

public class Count_seat {

	private int id,reamining_count;
	private String flight_no;
	private Date date;
	public Count_seat(int id, int reamining_count, String flight_no, Date date) {
		this.id = id;
		this.reamining_count = reamining_count;
		this.flight_no = flight_no;
		this.date = date;
	}
	public Count_seat() {}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getReamining_count() {
		return reamining_count;
	}
	public void setReamining_count(int reamining_count) {
		this.reamining_count = reamining_count;
	}
	public String getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
//	@Override
//	public String toString() {
//		return "Count_seat [id=" + id + ", reamining_count=" + reamining_count + ", flight_no=" + flight_no + ", date="
//				+ date + "]";
//	}
	
	
	
}
