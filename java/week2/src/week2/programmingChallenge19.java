/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;
import javax.swing.JOptionPane;
        
public class programmingChallenge19 {
    public static void main(String []args){
        
        //When Joe bought stocks
        double stock_purchased = 1000.0, stock_price = 32.87;
        double intermediate_fee_whenBuy,intermediate_fee_whenSold, money_for_buyStock, money_for_sellStock, profit;
        
        money_for_buyStock = stock_purchased * stock_price;
        intermediate_fee_whenBuy = 0.02 * money_for_buyStock;
        String message;
        message = "The amount of money Joe paid for stock is $" + money_for_buyStock + "\n"
            + "Joe had to pay $" + intermediate_fee_whenBuy + " for his broker after he bought those stocks.\n";    
        
        //When Joe sold stocks
        stock_purchased = 1000;
        stock_price = 33.92;
        money_for_sellStock = stock_purchased * stock_price;
        intermediate_fee_whenSold = 0.02 * money_for_sellStock;
        profit = money_for_sellStock - money_for_buyStock - intermediate_fee_whenSold - intermediate_fee_whenSold;
        
        if (profit >= 0){
            message += "The amount of money Joe sell stock is $" + money_for_sellStock + "\n"
                + "Joe had to pay $" + intermediate_fee_whenSold + " for his broker after he sold those stocks.\n"
                + "The profit of Joe's transaction is $" + String.format("%.1f", profit); 
        }else{
            message += "The amount of money Joe sell stock is $" + money_for_sellStock + "\n"
                + "Joe had to pay $" + intermediate_fee_whenSold + " for his broker after he sold those stocks.\n"
                + "Joe loses $" + String.format("%.1f", profit) + " in this transaction"; 
        }
        JOptionPane.showMessageDialog(null, message);
        System.exit(0);
    }
}
