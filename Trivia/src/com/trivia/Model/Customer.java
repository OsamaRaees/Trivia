package com.trivia.Model;

import java.util.Date;

public class Customer {

	private int Id;
	private String Password;
	private String FirstName;
	private String LastName;
	private String Gender;
	private int Contact;
	private Date DOB;
	private String Address;
	private String AreaResidence;
	private String City;
	private int PostalCode;
	private String Country;
	private String Profession;
	private String Status;

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getContact() {
		return Contact;
	}
	public void setContact(int contact) {
		Contact = contact;
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getAreaResidence() {
		return AreaResidence;
	}
	public void setAreaResidence(String areaResidence) {
		AreaResidence = areaResidence;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(int postalCode) {
		PostalCode = postalCode;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
}
