package model;

public class Menu {

	private	String Code_id;
	
	public String getCode_id() {
		return Code_id;
	}
	public void setCode_id(String code_id) {
		Code_id = code_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Menu(String Code_id, String name, double price) {
		super();
		this.Code_id =  Code_id;
		this.name = name;
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	private	String name;
	private	double price;  
}
