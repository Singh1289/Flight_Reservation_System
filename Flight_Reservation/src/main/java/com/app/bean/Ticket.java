package com.app.bean;

import java.sql.Date;

public class Ticket {

	private int ticket_id,passenger_id,seats,total,active;
	private Date date;
	private String flight_no;
	
	public Ticket(int ticket_id, int passenger_id, int seats, int total, int active, Date date, String flight_no) {
		this.ticket_id = ticket_id;
		this.passenger_id = passenger_id;
		this.seats = seats;
		this.total = total;
		this.active = active;
		this.date = date;
		this.flight_no = flight_no;
	}

	public Ticket() {}

	public int getTicket_id() {
		return ticket_id;
	}

	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}

	public int getPassenger_id() {
		return passenger_id;
	}

	public void setPassenger_id(int passenger_id) {
		this.passenger_id = passenger_id;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getFlight_no() {
		return flight_no;
	}

	public void setFlight_no(String flight_no) {
		this.flight_no = flight_no;
	}

//	@Override
//	public String toString() {
//		return "Ticket [ticket_id=" + ticket_id + ", passenger_id=" + passenger_id + ", seats=" + seats + ", total="
//				+ total + ", active=" + active + ", date=" + date + ", flight_no=" + flight_no + "]";
//	}
		
	
	
}
