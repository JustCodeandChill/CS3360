/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex3;
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args){
        String name1, name2, name3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        name1 = input.nextLine();
        System.out.println("Enter the second name: ");
        name2 = input.nextLine();
        System.out.println("Enter the third name: ");
        name3 = input.nextLine();
        int condition;
        condition = name1.compareTo(name2);
        
        if (condition < 0)
        {
            condition = name2.compareTo(name3);
            if (condition <0)   
                System.out.printf("%s %s %s", name1,name2,name3);
            else
                System.out.printf("%s %s %s", name1,name3,name2);
        }else if (condition > 0)
        {
            condition = name1.compareTo(name3);
            if (condition > 0)
                System.out.printf("%s %s %s", name2,name3,name1);
            else
                System.out.printf("%s %s %s", name2,name1,name3);
        }else
        {
            condition = name2.compareTo(name3);
            if (condition < 0)
                System.out.printf("%s %s %s", name1,name2,name3);
            else if (condition > 0)
                System.out.printf("%s %s %s", name3,name1,name2);
            else if (condition == 0)
                System.out.printf("%s %s %s", name1,name2,name3);
        }
   
        
    }
}
