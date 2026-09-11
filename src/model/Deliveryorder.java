package model;

public class Deliveryorder extends Order {

	
String  UserAddress;

	public Deliveryorder() {
	super();
	UserAddress = "";
}

	public String getUserAddress() {
	return UserAddress;
}

public void setUserAddress(String userAddress) {
	UserAddress = userAddress;
}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Delivery";
	}

}
