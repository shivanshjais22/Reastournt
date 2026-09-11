package model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
private  Reastournt reastourant;
private  List<Menu>menu;
public Cart(List<Menu> menu) {
	super();
	reastourant=null;
	this.menu = new ArrayList<>();
}


  public void ADDMenu(Menu Menu) {
	  menu.add(Menu);
  }

  public void RemoveMenu(Menu Menu) {
	  if(reastourant==null) {
		  System.out.println("PLZ SELECT Reastourant");
		  return;
	  }
	  menu.remove(Menu);
  }

  public Reastournt getReastourant() {
	return reastourant;
}


public Cart() {
	super();
}


public void setReastourant(Reastournt reastourant) {
	this.reastourant = reastourant;
}


public void setMenu(List<Menu> menu) {
	this.menu = menu;
}


double Totalprice() {
	  double total=0;
	  for(Menu m:menu) {
		  total+=m.getPrice();
	  }
	  return total;
  }
  
  Boolean Isempty() {
	  if(menu.isEmpty() || reastourant==null) return false;
	  return true;
  }
}
