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
public class Car {
    private int yearModel;
    private String make;
    private int speed;
    
    //Constructor
    public Car(int initYear, String initMake){
        yearModel = initYear;
        make = initMake;
        speed = 0;
    }
    
    //Accessors
    public int getYearModel(){return yearModel;}
    public String getMake(){return make;}
    public int getSpeed(){return speed;}
    public void displaySpeed(){
        System.out.println("The car's speed is: "+ speed);
    }
    //Mutators
    public void setYearModel(int newYear){yearModel = newYear;}
    public void setMake(String newMake){make = newMake;}
    public void setSpeed(int newSpeed){speed = newSpeed;}
    public void accelerate(){ speed += 5; }
    public void brake(){ speed -= 5; }
}
