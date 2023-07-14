/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author CltControl
 */
public class Client {
    private double income;
    private String name;

    public Client(double income, String name) {
        this.income = income;
        this.name = name;
    }
    
    public double getIncome() {
    	return this.income;
    }
    
}
