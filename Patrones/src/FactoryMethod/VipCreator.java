package FactoryMethod;

public class VipCreator extends CreditCardCreator{
	@Override
	public CreditCard createCard() {
		return new Vip();
	}
}
