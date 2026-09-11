package model;

public class User {
private int id;
private String UserName;
private Cart cart;
private String Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public Cart getCart() {
	return cart;
}
public User(int id, String userName, String address) {
	super();
	this.id = id;
	UserName = userName;
	Address = address;
	cart=new Cart();
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
}
