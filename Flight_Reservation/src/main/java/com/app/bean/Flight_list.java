package com.app.bean;

public class Flight_list {
	private int id,price,capacity;
	private String flight_no,source,destination,time;
	public Flight_list(int id, int price, int capacity, String flight_no, String source, String destination,
			String time) {
		this.id = id;
		this.price = price;
		this.capacity = capacity;
		this.flight_no = flight_no;
		this.source = source;
		this.destination = destination;
		this.time = time;
	}
	
	public Flight_list() {}
	
	
//	@Override
//	public String toString() {
//		return "Flight_list [id=" + id + ", price=" + price + ", capacity=" + capacity + ", flight_no=" + flight_no
//				+ ", source=" + source + ", destination=" + destination + ", time=" + time + "]";
//	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getFlight_no() {
		return flight_no;
	}
	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
		
	
}
