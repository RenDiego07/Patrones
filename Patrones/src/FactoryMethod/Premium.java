/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author CltControl
 */
public class Premium implements CreditCard{
	private int number;
	private int creditLimit;
	private String expirationDate;
	
	public Premium() {
		// Constructor
	}

	@Override
	public boolean pay() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean validateExpirationDate() {
		// Logic of the method
		return false;
	}
	
    
}
