package com.trivia.Model;

public class OrderItems {

	private int OderItemsID;
	private int OrderID ;
	private int CafeID ;
	private int MealID ;
	private int Price;
	
	public int getOderItemsID() {
		return OderItemsID;
	}
	public void setOderItemsID(int oderItemsID) {
		OderItemsID = oderItemsID;
	}
	public int getOrderID() {
		return OrderID;
	}
	public void setOrderID(int orderID) {
		OrderID = orderID;
	}
	public int getCafeID() {
		return CafeID;
	}
	public void setCafeID(int cafeID) {
		CafeID = cafeID;
	}
	public int getMealID() {
		return MealID;
	}
	public void setMealID(int mealID) {
		MealID = mealID;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
}
