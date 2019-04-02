/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworkproject2;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author tran le truc
 */
public class PC4dot19 {
    public static void main(String[] args){
            Random rand = new Random();
            final int playTimes = 5;
            int rightGuess = 0, guess = 0;
            int randomGeneratedNumber;
            String color = "";
            Scanner input = new Scanner(System.in);
            
            //Gameplay
            System.out.println("Welcome to ESP21 Game. You have to guess a random number between 0 to 5 in " + playTimes + " rounds.");
            System.out.println("Red, Green, Blue, Orange, Yellow - 0,1,2,3,4,5");
            for (int time = 0; time < playTimes; time++)
            {
                //user select color
                randomGeneratedNumber = rand.nextInt(5);
                System.out.print("\nRound " + (time+1)+ ". Enter your guess number: ");
                guess = input.nextInt();
                if (guess == randomGeneratedNumber)
                {
                    System.out.println("You won this round.");
                    rightGuess++;
                } 
                //Show the secret color
                
                switch (randomGeneratedNumber)
                {
                    case 0:
                        color = "Red";
                        break;
                    case 1:
                        color = "Green";
                        break;
                    case 2:
                        color = "Blue";  
                        break;
                    case 3:
                        color = "Orange";
                        break;
                    case 4:
                        color = "Yellow";
                        break;
                    default:
                        color = "Invalid";
                        break;
                }
                System.out.println("The secret color is "+ color + " or " + randomGeneratedNumber);
            }
            //Output
            System.out.println("After " + playTimes + " rounds. You guessed correctly " + rightGuess + " times. Game over");
    }
   
}
