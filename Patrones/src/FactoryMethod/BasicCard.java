package FactoryMethod;

public class BasicCard implements CreditCard {
	private int number;
	private int creditLimit;
	private String expirationDate;
	
	public BasicCard() {
		// Constructor
	}
	@Override
	public boolean pay() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validateExpirationDate() {
		// TODO Auto-generated method stub
		return false;
	}

}
