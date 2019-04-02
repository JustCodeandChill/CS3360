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
public class PC6dot1 {
    public static void main(String[] args){
        Employee susan = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        Employee[] employees = {susan,mark,joy};
        String name, department, position;
        int id;
        //Show employee report to screen
        System.out.println("Name\t\tID\tDepartment\tPosition");
        for (Employee employee: employees){
            name = employee.getName();
            id = employee.getID();
            department = employee.getDepartment();
            position = employee.getPosition();
            System.out.printf("%s\t%d\t%-15s\t%s\n",name,id,department,position);
        }
        //System.out.printf("%-s\t%-s\t%-s\t%-s\n","Name","ID Number","Department","Position");
        
    }
}
