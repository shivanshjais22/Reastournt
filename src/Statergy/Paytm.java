package Statergy;



public class Paytm implements PaymentStatergy {
  
	private String Mobile;
	
	public Paytm(String mobile) {
		super();
		Mobile = mobile;
	}

	@Override
	public void Payment(Double price) {
		// TODO Auto-generated method stub
		System.out.println(Mobile+"pay reducted from this mobile number" + price);
	}

}
