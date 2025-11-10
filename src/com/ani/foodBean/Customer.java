package com.ani.foodBean;

public class Customer 
{
	private int order_ID;
	private String customer_name;
	private String food_item;
	private int quantity;
	private double price_per_item;
	private String phone_number;
	
	public Customer(int order_ID, String customer_name, String food_item, int quantity, double price_per_item,
			String phone_number) {
		super();
		this.order_ID = order_ID;
		this.customer_name = customer_name;
		this.food_item = food_item;
		this.quantity = quantity;
		this.price_per_item = price_per_item;
		this.phone_number = phone_number;
	}

	public int getOrder_ID() {
		return order_ID;
	}

	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getFood_item() {
		return food_item;
	}

	public void setFood_item(String food_item) {
		this.food_item = food_item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice_per_item() {
		return price_per_item;
	}

	public void setPrice_per_item(double price_per_item) {
		this.price_per_item = price_per_item;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	@Override
	public String toString() {
		return "Customer [order_ID=" + order_ID + ", customer_name=" + customer_name + ", food_item=" + food_item
				+ ", quantity=" + quantity + ", price_per_item=" + price_per_item + ", phone_number=" + phone_number
				+ "]";
	}
	
	
	
	
}
