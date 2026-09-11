package Factories;

import java.util.List;

import Statergy.PaymentStatergy;
import model.Cart;
import model.Deliveryorder;
import model.Menu;
import model.Order;
import model.PickupOrder;
import model.Reastournt;
import model.User;

public class NowOderFactory implements OrderFactory {

	@Override
	public Order creatorder(User user, Cart cart, Reastournt reastournt, List<Menu> menu,
			PaymentStatergy paymentstrategy, Double totalCost, String OrderType) {
		// TODO Auto-generated method stub
		   Order order = null;
		   
		   if (OrderType.equals("Delivery")) {
	            Deliveryorder deliveryOrder = new Deliveryorder();
	            deliveryOrder.setUserAddress(user.getAddress());
	            order = deliveryOrder;
	        } else {
	            PickupOrder pickupOrder = new PickupOrder();
	            pickupOrder.setRestaurantAddress(reastournt.getAddress());
	            order = pickupOrder;
	        }

	        order.setUser(user);
	        order.setReastournt(reastournt);
	        order.setMenu(menu);
	        order.setPaymentStatergy(paymentstrategy);
	     //   order.setScheduled(TimeUtils.getCurrentTime());
	        order.setTotal(totalCost);
	        return order;
	}



}
