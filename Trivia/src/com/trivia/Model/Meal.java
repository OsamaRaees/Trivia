package com.trivia.Model;

public class Meal {
	private int MealID;
	private int VendorID; 
	private String MealName; 
	private String Discripation; 
	private int Price;
	private String Ingredients;
	private String Recipe ;
	private String MealStatus;
	
	public int getMealID() {
		return MealID;
	}
	public void setMealID(int mealID) {
		MealID = mealID;
	}
	public int getVendorID() {
		return VendorID;
	}
	public void setVendorID(int vendorID) {
		VendorID = vendorID;
	}
	public String getMealName() {
		return MealName;
	}
	public void setMealName(String mealName) {
		MealName = mealName;
	}
	public String getDiscripation() {
		return Discripation;
	}
	public void setDiscripation(String discripation) {
		Discripation = discripation;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getIngredients() {
		return Ingredients;
	}
	public void setIngredients(String ingredients) {
		Ingredients = ingredients;
	}
	public String getRecipe() {
		return Recipe;
	}
	public void setRecipe(String recipe) {
		Recipe = recipe;
	}
	public String getMealStatus() {
		return MealStatus;
	}
	public void setMealStatus(String mealStatus) {
		MealStatus = mealStatus;
	}
	
	
}
