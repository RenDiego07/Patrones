/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author CltControl
 */
public class CreditCardClients {
    public CreditCard assingCreditCard(Client c){
    	CreditCard creditCard = null;
       if(c != null){
          double income =  c.getIncome(); 
          CreditCardCreator creator;
          if(income >= 5000) {
        	  creator = new PremiumCreator();
          }else if(income >= 2000 && income < 5000) {
        	  creator = new VipCreator();
          }else {
        	  creator = new BasicCreator();
          }
          creditCard = creator.createCard();
       }
       return creditCard;
    }
}
