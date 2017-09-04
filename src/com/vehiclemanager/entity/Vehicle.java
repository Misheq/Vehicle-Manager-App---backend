package com.vehiclemanager.entity;

import java.awt.image.BufferedImage;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	long id;

	String vehicleType;
	String brand;
	String model;
	String registrationNumber;
	String company;
	Person assignedPerson;
	Date dateOfLastCheck;
	Date ofNextCheck;
	Date dateOfAquirement;
	Date registrationDate;
	Date registrationExpirationDate;
	int totalDistance;
	int height;
	int width;
	int length;
	int weight;
	List<BufferedImage> pictures;

	public Vehicle() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public Person getAssignedPerson() {
		return assignedPerson;
	}

	public void setAssignedPerson(Person assignedPerson) {
		this.assignedPerson = assignedPerson;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Date getDateOfLastCheck() {
		return dateOfLastCheck;
	}

	public void setDateOfLastCheck(Date dateOfLastCheck) {
		this.dateOfLastCheck = dateOfLastCheck;
	}

	public Date getOfNextCheck() {
		return ofNextCheck;
	}

	public void setOfNextCheck(Date ofNextCheck) {
		this.ofNextCheck = ofNextCheck;
	}

	public Date getDateOfAquirement() {
		return dateOfAquirement;
	}

	public void setDateOfAquirement(Date dateOfAquirement) {
		this.dateOfAquirement = dateOfAquirement;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Date getRegistrationExpirationDate() {
		return registrationExpirationDate;
	}

	public void setRegistrationExpirationDate(Date registrationExpirationDate) {
		this.registrationExpirationDate = registrationExpirationDate;
	}

	public int getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public List<BufferedImage> getPictures() {
		return pictures;
	}

	public void setPictures(List<BufferedImage> pictures) {
		this.pictures = pictures;
	}
}
