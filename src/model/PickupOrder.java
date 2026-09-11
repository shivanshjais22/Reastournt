package model;

public class PickupOrder extends Order{
	
	private String restaurantAddress;

    public PickupOrder() {
        restaurantAddress = "";
    }

    

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Pickup";
	}
	
	 public void setRestaurantAddress(String addr) {
	        restaurantAddress = addr;
	    }

	    public String getRestaurantAddress() {
	        return restaurantAddress;
	    }

}
