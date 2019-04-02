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
public class PC6dot4 {
    public static void main(String[] args){
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem item2 = new RetailItem("Designer Jean", 40, 34.95);
        RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
        
        RetailItem []items = {item1, item2, item3};
        System.out.println("Description\tUnits on Hand\tPrice");
        for (RetailItem item : items){
            System.out.printf("%-15s\t%6d\t%,13.2f\n",item.getDescription(),item.getAmountOfUnit(),item.getPrice());
        }
    }
}
