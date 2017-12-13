//package database;
package com.webCyberProjectTsofen.pkj;

public class Event {
	private String id;
	private String hostID;
	private String location;
	private String status;
	private String name;
	private String client;
	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getHostID() {
		return hostID;
	}

	public void setHostID(String hostID) {
		this.hostID = hostID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Event(String id, String location, String status, String dateTime, String logText) {
		super();
		this.id = id;
		this.location = location;
		this.status = status;
		this.dateTime = dateTime;
		this.logText = logText;
	}


}