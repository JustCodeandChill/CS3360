/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkproject2;

/**
 *
 * @author tran le truc
 */
public class RetailItem {
    private String description;
    private int unitsOnHand;
    private double price;
    
    //Constructor
    RetailItem(){
        description = "";
        unitsOnHand = 0;
        price = 0;
    }
    
    RetailItem(String message, int initAmounts, double initPrice){
        description = message;
        unitsOnHand = initAmounts;
        price = initPrice;
    }
    
    //Accessors
    public String getDescription(){return description;}
    public int getAmountOfUnit(){return unitsOnHand;}
    public double getPrice(){return price;}
    
    //Mutators
    public void setDescription(String newDescription){description = newDescription;}
    public void setAmountOfUnit(int newAmount){unitsOnHand = newAmount;}
    public void setPrice(double newPrice){price = newPrice;}
}
