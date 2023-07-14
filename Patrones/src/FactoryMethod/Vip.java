/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author CltControl
 */
public class Vip implements CreditCard {
	private int number;
	private int creditLimit;
	private String expirationDate;
	
	public Vip() {
		//Constructor
	}
	
    @Override
    public boolean pay() {
    	// payment with VIP card
    	return false;
    }

	@Override
	public boolean validateExpirationDate() {
		// TODO Auto-generated method stub
		return false;
	}
    
}
