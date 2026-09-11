package Main;
import Statergy.Paytm;
import model.*;

public class Main {
	public static void main(String [] args){
        TomatoApp tomato = new TomatoApp();
        User user = new User(101, "Aditya", "Delhi");
        System.out.println("User: " + user.getUserName() + " is active.");

        
        java.util.List<Reastournt> restaurantList = tomato.searchRestaurants("Delhi");

        if (restaurantList.isEmpty()) {
            System.out.println("No restaurants found!");
            return;
        }
        System.out.println("Found Restaurants:");
        for (Reastournt restaurant : restaurantList) {
            System.out.println(" - " + restaurant.getName());
        }

        tomato.selectRestaurant(user, restaurantList.get(0));
        System.out.println("Selected restaurant: " + restaurantList.get(0).getName());

        // User adds items to the cart
        tomato.addToCart(user, "P1");
        tomato.addToCart(user, "P2");

        tomato.printUserCart(user);

        // User checkout the cart
        Order order = tomato.checkoutNow(user, "Delivery", new Paytm("1234567890"));

        // User pays for the cart. If payment is successful, notification is sent.
        tomato.payForOrder(user, order);
	}

}
