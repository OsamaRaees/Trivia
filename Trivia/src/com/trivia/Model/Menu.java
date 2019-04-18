package com.trivia.Model;

import java.util.Date;

public class Menu {

	private int MenuID ;
	private int VendorID; 
	private String ManuName; 
	private Date CreationDate; 
	private String MenuStatus;
	
	public int getMenuID() {
		return MenuID;
	}
	public void setMenuID(int menuID) {
		MenuID = menuID;
	}
	public int getVendorID() {
		return VendorID;
	}
	public void setVendorID(int vendorID) {
		VendorID = vendorID;
	}
	public String getManuName() {
		return ManuName;
	}
	public void setManuName(String manuName) {
		ManuName = manuName;
	}
	public Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	public String getMenuStatus() {
		return MenuStatus;
	}
	public void setMenuStatus(String menuStatus) {
		MenuStatus = menuStatus;
	}
	
	
}
