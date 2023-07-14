package FactoryMethod;

public class PremiumCreator extends CreditCardCreator{
	@Override
	public CreditCard createCard() {
		return new Premium();
	}
}
