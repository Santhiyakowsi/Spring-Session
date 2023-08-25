package com.demo.Spring_Core;

public class order implements Ecommerce {
	
	private String payment;  //Property 
	private Customer customer; //injects the object of customer to the order object 
	
	public void detail() {
		System.out.println("order details");
	} 
	
	
	/*private int id;
	private String P_detail;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getP_detail() {
		return P_detail;
	}
	public void setP_detail(String p_detail) {
		P_detail = p_detail;
	}*/
	
	
	
	public String getPayment() {
		return payment;
	}
	public void setPayment(String payment) {
		this.payment = payment;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	//@Override
	public String toString() {
		return "order [customer=" + customer + "]";
	}
	public void PrintCustomer() {
		customer.detail();
		System.out.println(customer.getName());
		System.out.println(customer.getEmail());
		
	}
	
	
}
