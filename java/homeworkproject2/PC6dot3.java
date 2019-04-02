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
public class PC6dot3 {
    public static void main(String[] args){
        //This class has 2 constructors: No-arg constructor and 3-argument constructor
        PersonalInfo member1 = new PersonalInfo("Larry Thompson", "Number 6, Brooklyn Street",19,"019867421");
        PersonalInfo member2 = new PersonalInfo("Moe McFlurry", "Number 72, Mesmerize Town",25,"051837497");
        PersonalInfo member3 = new PersonalInfo();
        System.out.printf("Member's name %s.\nAddress: %s.\nAge: %d. Tel: %s.\n\n", member3.getName(),member3.getAddress(), member3.getAge(), member3.getPhoneNumber());
        
        //Mutators method 
        member3.setName("Curly Braveman");
        member3.setAddress("Number 14, Haddepth Village");
        member3.setAge(25);
        member3.setPhoneNumber("016861451");
        
        //Accessors method
        System.out.printf("Member's name %s.\nAddress: %s.\nAge: %d. Tel: %s.\n\n", member1.getName(),member1.getAddress(), member1.getAge(), member1.getPhoneNumber());
        System.out.printf("Member's name %s.\nAddress: %s.\nAge: %d. Tel: %s.\n\n", member2.getName(),member2.getAddress(), member2.getAge(), member2.getPhoneNumber());
        System.out.printf("Member's name %s.\nAddress: %s.\nAge: %d. Tel: %s.\n\n", member3.getName(),member3.getAddress(), member3.getAge(), member3.getPhoneNumber());    
    }
    
}
