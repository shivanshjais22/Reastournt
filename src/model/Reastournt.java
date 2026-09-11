package model;

import java.util.ArrayList;
import java.util.List;

public class Reastournt {
   
private	int id;
private	String name;
private	String Address;
private	List<Menu> menu ;
	public Reastournt(String name, String address) {
	super();
	this.name = name;
	Address = address;
	  this.menu = new ArrayList<>();
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public List<Menu> getMenu() {
		return menu;
	}
	public void setMenu(List<Menu> menu) {
		this.menu = menu;
	}
	
	public void addmenu(Menu menu) {
	    this.menu.add(menu);
	}
}
