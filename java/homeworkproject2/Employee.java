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
public class Employee {
    private String name; 
    private int idNumber;
    private String department;
    private String position;
    
    //Constructor for 1,2,4 arg(s)
    public Employee(){
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    
    public Employee(String initName,int id){
        name = initName;
        idNumber = id;
        department = "";
        position = "";
    }
    
    public Employee(String initName,int id, String initDepartment,String initPosition){
        name = initName;
        idNumber = id;
        department = initDepartment;
        position = initPosition;
    }
    
    //Accessors
    public String getName(){return name;}
    public String getDepartment(){return department;}
    public String getPosition(){return position;}
    public int getID(){return idNumber;}
    public void display(){
        System.out.printf("%s\t%d\t%s\t%s\n",this.getName(),this.getID(),this.getDepartment(),this.getPosition());
    } 
    //Mutators
    public void setName(String newName){name = newName;}
    public void setDepartment(String newDepartment){department = newDepartment;}
    public void setPosition(String newPosition){position = newPosition;}
    public void setIdNumber(int newIdNumber){idNumber = newIdNumber;}
}
