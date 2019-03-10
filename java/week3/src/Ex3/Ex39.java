package Ex3;
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args){
        System.out.println("Weight of Package \t\t\t\t Rate per 500 Miles Shipped");
        System.out.println("2 pounds or less \t\t\t\t\t $1.10");
        System.out.println("Over 2 pounds but not more than 6 pounds \t\t $2.20");
        System.out.println("Over 6 pounds but not more than 10 pounds \t\t $3.70");
        System.out.println("Over 10 pounds \t\t\t\t\t\t $3.80");
        
        Scanner input = new Scanner(System.in);
        double weight, shipping_charge=0;
        System.out.print("Enter the weight of the package in pound for shipping: ");
        weight = input.nextDouble();
        
        if (0 < weight && weight <= 2)
            shipping_charge = 1.10;
        else if (2 < weight && weight <= 6)
            shipping_charge = 2.20;
        else if (6 < weight && weight <= 10)
            shipping_charge = 3.70;
        if (10 < weight)
            shipping_charge = 3.80;
        
        System.out.printf("Your package is %.2f pound.\n",weight);
        System.out.printf("Shipping charge is $%.2f", shipping_charge);
        
    }
}
