/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author tran le truc
 */
public class comparisionProgram_inclass {
    public static void main(){
       /*  String num1s,num2s;
        int num1,num2;
       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number:");
        num1 = input.nextInt();
        System.out.print("Enter your second number:");
        num2 = input.nextInt();
        
        if ( num1 == num2)
            System.out.printf(" %d = %d", num1, num2);
        
        if ( num1 > num2)
            System.out.printf(" %d > %d", num1, num2);
        
        if (  num1 != num2)
            System.out.printf(" %d != %d\n", num1, num2);
        
        if (  num1 < num2)
            System.out.printf(" %d < %d", num1, num2);*/
       
        /*
        num1s = JOptionPane.showInputDialog("Enter your first number: ");
        num2s = JOptionPane.showInputDialog("Enter your second number: ");
        num1 = Integer.parseInt(num1s);
        num2 = Integer.parseInt(num2s);
        
        String message = null;
        if (num1 == num2)
            JOptionPane.showMessageDialog(null,String.format("%d = %d", num1,num2));
        else{
            if (num1 > num2){
                message = num1 + " > " + num2 + " and " + num1 + "!=" + num2;
            }else{
                message = num1 + " < " + num2 + " and " + num1 + "!=" + num2;
            }
            
        }        
        JOptionPane.showMessageDialog(null,message);
        System.exit(0);*/
        
        //F to C pro
        double celcius_start,celcius_end, steps   , farenheit = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number in celcius:");
        celcius_start = input.nextDouble();
        
        System.out.print("Enter ending number in celcius:");
        celcius_end = input.nextDouble();
        
        System.out.print("Enter number of steps:");
        steps = input.nextDouble();
        
        System.out.println("Celcius" + "\t" + "Farenheit");
        for (double celcius = celcius_start; celcius < celcius_end; celcius+= steps){
            farenheit = (celcius + 32)/1.8;
            System.out.println(celcius + "\t" + farenheit);
        }
    }
}