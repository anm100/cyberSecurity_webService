package com.webCyberProjectTsofen.pkj;

public class Event {
	private String id;
	private String location;
	private String ststus;
	private String dateTime;
	private String logText;
	
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getStstus() {
		return ststus;
	}

	public void setStstus(String ststus) {
		this.ststus = ststus;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getLogText() {
		return logText;
	}

	public void setLogText(String logText) {
		this.logText = logText;
	}

	public Event(String id, String location, String ststus, String dateTime, String logText) {
		super();
		this.id = id;
		this.location = location;
		this.ststus = ststus;
		this.dateTime = dateTime;
		this.logText = logText;
	}


}
