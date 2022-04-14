package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerId;

	@Column(name = "name")
	private String name;

	@Column(name = "vehicleNumber")
	private String vehicleNumber;

	@Column(name = "tokenNumber")
	private int tokenNumber;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "positionNumber")
	private int positionNumber;

	@Column(name = "parkingDuration")
	private int parkingDuration;

	@Column(name = "paymentMethod")
	private String paymentMethod;

	public Customer() {
		super();
	}

	public Customer(int customerId, String name, String vehicleNumber, int tokenNumber, String phoneNumber,
			int positionNumber, int parkingDuration, String paymentMethod) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.vehicleNumber = vehicleNumber;
		this.tokenNumber = tokenNumber;
		this.phoneNumber = phoneNumber;
		this.positionNumber = positionNumber;
		this.parkingDuration = parkingDuration;
		this.paymentMethod = paymentMethod;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public int getTokenNumber() {
		return tokenNumber;
	}

	public void setTokenNumber(int tokenNumber) {
		this.tokenNumber = tokenNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPositionNumber() {
		return positionNumber;
	}

	public void setPositionNumber(int positionNumber) {
		this.positionNumber = positionNumber;
	}

	public int getParkingDuration() {
		return parkingDuration;
	}

	public void setParkingDuration(int parkingDuration) {
		this.parkingDuration = parkingDuration;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", vehicleNumber=" + vehicleNumber
				+ ", tokenNumber=" + tokenNumber + ", phoneNumber=" + phoneNumber + ", positionNumber=" + positionNumber
				+ ", parkingDuration=" + parkingDuration + ", paymentMethod=" + paymentMethod + "]";
	}

}