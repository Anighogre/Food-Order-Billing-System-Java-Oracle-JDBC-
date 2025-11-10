package com.ani.service;

import com.ani.foodBean.Customer;

public interface FoodCustomer 
{
	public int addCustomer(Customer ref);
	public boolean isFirstCustomer(Customer ref);
	public void printBill(Customer ref, boolean isFirstTime);
}
