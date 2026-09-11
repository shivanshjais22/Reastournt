package Service;

import java.util.List;

import model.Menu;
import model.Order;

public class NotificationService {
	  public static void notify(Order order) {
	        System.out.println("\nNotification: New " + order.getType() + " order placed!");
	        System.out.println("---------------------------------------------");
	        System.out.println("Order ID: " + order.getOrderId());
	        System.out.println("Customer: " + order.getUser().getUserName());
	        System.out.println("Restaurant: " + order.getReastournt().getName());
	        System.out.println("Items Ordered:");

	        List<Menu> items = order.getMenu();
	        for (Menu item : items) {
	            System.out.println("   - " + item.getName() + " (₹" + item.getPrice() + ")");
	        }

	        System.out.println("Total: ₹" + order.getTotal());
	        System.out.println("Scheduled For: " + order.getScheduled());
	        System.out.println("Payment: Done");
	        System.out.println("---------------------------------------------");
	    }
}
