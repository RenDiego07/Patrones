package FactoryMethod;

public class BasicCreator extends CreditCardCreator{
	@Override
	public CreditCard createCard() {
		return new BasicCard();
	}
}
