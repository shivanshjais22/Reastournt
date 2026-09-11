package Factories;

import java.util.List;

import Statergy.PaymentStatergy;
import model.Cart;
import model.Menu;
import model.Order;
import model.Reastournt;
import model.User;

public interface OrderFactory {
Order creatorder(User user,Cart cart,Reastournt reastournt,List<Menu>menu,PaymentStatergy paymentstrategy,Double totalCost,String OrderType);
}
