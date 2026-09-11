package model;

import java.util.List;

import Statergy.PaymentStatergy;

public abstract class Order {
	
	
	private static int nextOrderId = 0;

protected  int order_id;
protected  User user;
protected Reastournt reastournt;
protected 	List<Menu>menu;
protected PaymentStatergy paymentStatergy;
protected double total;
protected String scheduled;






public Order() {
	super();
	this.order_id = ++nextOrderId;
	this.user = null;
	this.reastournt = null;
	this.menu = menu;
	this.paymentStatergy = null;
    this.total = 0.0;
    this.scheduled = "";
}




public double getTotal() {
	return total;
}




public void setTotal(double total) {
	this.total = total;
}




public String getScheduled() {
	return scheduled;
}




public void setScheduled(String scheduled) {
	this.scheduled = scheduled;
}




public boolean processPayment() {
    if (paymentStatergy != null) {
    	paymentStatergy.Payment(total);
        return true;
    } else {
        System.out.println("Please choose a payment mode first");
        return false;
    }
}

public abstract String getType();

// Getters and Setters
public int getOrderId() {
    return order_id;
}


public int getOrder_id() {
	return order_id;
}
public void setOrder_id(int order_id) {
	this.order_id = order_id;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public Reastournt getReastournt() {
	return reastournt;
}
public void setReastournt(Reastournt reastournt) {
	this.reastournt = reastournt;
}
public List<Menu> getMenu() {
	
	return menu;
}
public void setMenu(List<Menu> menu) {
	this.menu = menu;
	
	 total = 0;
     for (Menu i : menu) {
         total += i.getPrice();
     }
}
public PaymentStatergy getPaymentStatergy() {
	return paymentStatergy;
}
public void setPaymentStatergy(PaymentStatergy paymentStatergy) {
	this.paymentStatergy = paymentStatergy;
}
	
}
