/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author tran le truc
 */
import java.util.Scanner;
public class PayRoll {
    
    public static void main(String[] args){
        String name;
        int hours;
        double payRate;
        double grossPay;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        name = input.nextLine();
        
        System.out.print("How many hours working in 1wk? ");
        hours = input.nextInt();
        
        System.out.print("How much money? ");
        payRate = input.nextDouble();
        
        grossPay = hours * payRate;
        System.out.println("Hello " + name);
        System.out.println("Total money is $" + grossPay);
        
    }
}
