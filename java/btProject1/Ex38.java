/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        //Menu
        System.out.println("Quantity \t Discount");
        System.out.println("10-19 \t\t 20%");
        System.out.println("20-49 \t\t 30%");
        System.out.println("50-99 \t\t 40%");
        System.out.println("100 or more \t 50%");
        
        Scanner input = new Scanner(System.in);
        double pricePerProduct = 99, totalMoney , discountRate=0;
        int quantity;
        
        //enter quantuty
        System.out.print("Enter the amount of product you want: ");
        quantity = input.nextInt();
        
        //check discount rate
        if (quantity >= 10 && quantity <= 19)
           discountRate = 0.2;
        else if(quantity >= 20 && quantity <= 49)
            discountRate = 0.3;
        else if(quantity >= 50 && quantity <= 99)
            discountRate = 0.4;
        else if(quantity >= 100)
            discountRate = 0.5;
        else
            discountRate = 0;
        //Calculate and output
        totalMoney = pricePerProduct * quantity * (1-discountRate);
        System.out.println("You ordered " + quantity + " products.\n" + 
                "You have "+ discountRate*100 + "% discount rate\n");
        System.out.printf("The bill is $%.2f",totalMoney);
    }
}
