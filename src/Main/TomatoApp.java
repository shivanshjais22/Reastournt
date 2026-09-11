package Main;
import java.util.List;

import Factories.NowOderFactory;
import Factories.OrderFactory;
import Factories.ScheduledOrderFactory;
import Manager.OrderManager;
import Manager.Reastourant_Manager;
import Service.NotificationService;
import Statergy.PaymentStatergy;
import model.Cart;
import model.Menu;
import model.Order;
import model.Reastournt;
import model.User;

public class TomatoApp {
	
	public TomatoApp() {
        initializeRestaurants();
    }

	private void initializeRestaurants() {
		// TODO Auto-generated method stub
		   Reastournt restaurant1 = new Reastournt("Bikaner", "Delhi");
	        restaurant1.addmenu(new Menu("P1", "Chole Bhature", 120));
	        restaurant1.addmenu(new Menu("P2", "Samosa", 15));
	  
	        Reastournt restaurant2 = new Reastournt("Haldiram", "Kolkata");
	        restaurant2.addmenu(new Menu("P1", "Raj Kachori", 80));
	        restaurant2.addmenu(new Menu("P2", "Pav Bhaji", 100));
	        restaurant2.addmenu(new Menu("P3", "Dhokla", 50));
	    
	        
	        Reastournt restaurant3 = new Reastournt("Saravana Bhavan", "Chennai");
	        restaurant3.addmenu(new Menu("P1", "Masala Dosa", 90));
	        restaurant3.addmenu(new Menu("P2", "Idli Vada", 60));
	        restaurant3.addmenu(new Menu("P3", "Filter Coffee", 30));
  
	            Reastourant_Manager restaurantManager = Reastourant_Manager.getInstance();
	                   restaurantManager.Add_Reastiurant(restaurant1);
	                   restaurantManager.Add_Reastiurant(restaurant2);
	                   restaurantManager.Add_Reastiurant(restaurant3);
  
	                   
	}

	
	
	
	
	 public List<Reastournt> searchRestaurants(String location) {
	        return Reastourant_Manager.getInstance().SearchByloaction(location);
	    }

	    public void selectRestaurant(User user, Reastournt restaurant) {
	        Cart cart = user.getCart();
	        cart.setReastourant(restaurant);
	    }
	
	

	    public void addToCart(User user, String itemCode) {
	    	Reastournt restaurant = user.getCart().getReastourant();
	        if (restaurant == null) {
	            System.out.println("Please select a restaurant first.");
	            return;
	        }
	        for (Menu item : restaurant.getMenu()) {
	            if (item.getCode_id().equals(itemCode)) {
	                user.getCart().ADDMenu(item);
	                break;
	            }
	        }
	    }

	    public Order checkoutNow(User user, String orderType, PaymentStatergy paymentStrategy) {
	        return checkout(user, orderType, paymentStrategy, new NowOderFactory());
	    }

	    public Order checkoutScheduled(User user, String orderType, PaymentStatergy paymentStrategy, String scheduleTime) {
	        return checkout(user, orderType, paymentStrategy, new ScheduledOrderFactory(scheduleTime));
	    }

	    public Order checkout(User user, String orderType, PaymentStatergy paymentStrategy, OrderFactory orderFactory) {
	        if (user.getCart().Isempty()) return null;

	        Cart userCart = user.getCart();
	        Reastournt orderedRestaurant = userCart.getReastourant();
	        List<Menu> itemsOrdered = userCart.getMenu();
	        double totalCost = userCart.Totalprice();

	        Order order = orderFactory.creatorder(user, userCart, orderedRestaurant, itemsOrdered, paymentStrategy, totalCost, orderType);
	        OrderManager.getInstance().addOrder(order);
	        return order;
	    }

	    public void payForOrder(User user, Order order) {
	        boolean isPaymentSuccess = order.processPayment();

	        if (isPaymentSuccess) {
	            NotificationService.notify(order);
	            user.getCart();
	        }
	    }

	    public void printUserCart(User user) {
	        System.out.println("Items in cart:");
	        System.out.println("------------------------------------");
	        for (Menu item : user.getCart().getMenu()) {
	            System.out.println(item.getCode_id() + " : " + item.getName() + " : ₹" + item.getPrice());
	        }
	        System.out.println("------------------------------------");
	        System.out.println("Grand total : ₹" + user.getCart().Totalprice());
	    }
	
	
	
	
	
	
}
