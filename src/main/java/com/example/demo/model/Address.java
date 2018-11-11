package com.example.demo.model;

public class Address {

	private String mainAddress;
	private double lat;
	private double lon;
	private long pincode;
	public Address()
	{
		
	}
	public Address(String mainAddress) {
		super();
		this.mainAddress = mainAddress;
		this.lat = 0;
		this.lon = 0;
		this.pincode = 560095;
	}
	
	public Address(String mainAddress, double lat, double lon, long pincode) {
		super();
		this.mainAddress = mainAddress;
		this.lat = lat;
		this.lon = lon;
		this.pincode = pincode;
	}
	public String getMainAddress() {
		return mainAddress;
	}
	public void setMainAddress(String mainAddress) {
		this.mainAddress = mainAddress;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(int lat) {
		this.lat = lat;
	}
	public double getLon() {
		return lon;
	}
	public void setLon(int lon) {
		this.lon = lon;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	
}
