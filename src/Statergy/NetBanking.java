package Statergy;

public class NetBanking  implements PaymentStatergy{

	private String Bank_Account;
	
	
	public NetBanking(String bank_Account) {
		super();
		Bank_Account = bank_Account;
	}


	@Override
	public void Payment(Double price) {
		System.out.println(price +"Amount_Reducted from this Account"+ Bank_Account);
	}

}
