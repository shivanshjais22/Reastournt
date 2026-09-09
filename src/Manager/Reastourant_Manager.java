package Manager;

import java.util.ArrayList;
import java.util.List;

import model.Reastournt;

public class Reastourant_Manager {
private List<Reastournt> reastournt;

private static Reastourant_Manager instance = null;

  private Reastourant_Manager() {
	
	  // TODO Auto-generated constructor stub
}
  
  public static Reastourant_Manager getInstance() {
      if (instance == null) {
          instance = new Reastourant_Manager();
      }
      return instance;
  }
  
   void Add_Reastiurant(Reastournt r) {
	   reastournt.add(r);
   }
  
   void Remove_Reastiurant(Reastournt r) {
	   reastournt.remove(r);
   }
   
 
  List<Reastournt>SearchByloaction(String loc){
	  List<Reastournt>result=new ArrayList<>();
	  loc=loc.toLowerCase();
	  for(Reastournt i: reastournt) {
		  String r=i.getAddress();
		  r=r.toLowerCase();
		  if(r.equalsIgnoreCase(loc)) {
			  result.add(i);
		  }
	  }
	  
	  return result;
  }
   
   
  
}
