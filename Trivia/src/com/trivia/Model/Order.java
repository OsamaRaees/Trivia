package com.trivia.Model;

import java.util.Date;

public class Order {

	private int OrderID ;
	private int CustomerID; 
	private int TotalOrderAmount; 
	private Date OrderDate ;
	private Date DeliverDate ;
	private String DeliverStatus; 
	private String OrderStatus;
	
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public int getTotalOrderAmount() {
		return TotalOrderAmount;
	}
	public void setTotalOrderAmount(int totalOrderAmount) {
		TotalOrderAmount = totalOrderAmount;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}
	public Date getDeliverDate() {
		return DeliverDate;
	}
	public void setDeliverDate(Date deliverDate) {
		DeliverDate = deliverDate;
	}
	public String getDeliverStatus() {
		return DeliverStatus;
	}
	public void setDeliverStatus(String deliverStatus) {
		DeliverStatus = deliverStatus;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	
	
}
