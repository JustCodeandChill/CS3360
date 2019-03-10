/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class comparisionProgram_inclass {
    public static void main(){
        //F to C pro
        double celcius_start,celcius_end, steps, farenheit = 0,celcius;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter starting number in celcius:");
        celcius_start = input.nextDouble();
        
        System.out.print("Enter ending number in celcius:");
        celcius_end = input.nextDouble();
        
        System.out.print("Enter number of steps:");
        steps = input.nextDouble();
        
        System.out.println("Celcius" + "\t" + "Farenheit");
        for (celcius = celcius_start; celcius <= celcius_end; celcius += steps){
            farenheit = (celcius + 32)/1.8;
            System.out.printf("%f \t %f ",celcius,farenheit);
        }
        
        System.out.println(celcius_end);
    }
}