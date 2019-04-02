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
public class PersonalInfo {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;
    
    //Constructor
    public PersonalInfo(){
        name = "";
        address = "";
        age = 0;
        phoneNumber = "";
    }
    
    public PersonalInfo(String initName, String initAddress, int initAge, String initPhoneNum){
        name = initName;
        address = initAddress;
        age = initAge;
        phoneNumber = initPhoneNum;
    }
    
    //Accessors
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhoneNumber(){return phoneNumber;}
    public int getAge(){return age;}
    
    //Mutators
    public void setName(String newName){name = newName;}
    public void setAddress(String newAddress){address = newAddress;}
    public void setAge(int newAge){age = newAge;}
    public void setPhoneNumber(String newPhoneNumber){phoneNumber = newPhoneNumber;}
    
}
