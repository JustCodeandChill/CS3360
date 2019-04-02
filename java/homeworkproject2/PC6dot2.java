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
public class PC6dot2 {
    public static void main(String[] args){
        Car yaris = new Car(2019,"Toyota");
    
        System.out.println("The car is accelerating.");
        for (int i=0; i < 5; i++){
            yaris.accelerate();
            yaris.displaySpeed();
        }
        
        System.out.println("The car is braking.");
        for (int i=0; i < 5; i++){
            yaris.brake();
            yaris.displaySpeed();
        }
    }
}
