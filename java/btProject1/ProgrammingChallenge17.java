/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import javax.swing.JOptionPane;
/**
 *
 * @author tran le truc
 */
public class ProgrammingChallenge17 {
    public static void main(String[] args){
        final double cupSugarPerCookie = 1.5/48;
        final double cupButterPerCookie = 1/48;
        final double cupFlourPerCookie = 2.75/48;
        
        String amountCookiesInStr;
        int amountCookies;
        amountCookiesInStr = JOptionPane.showInputDialog("How many cookies do you want to make?");
        amountCookies = Integer.parseInt(amountCookiesInStr);
        
        double totalCupSugar , totalCupButter, totalCupFlour;
        totalCupSugar = cupSugarPerCookie * amountCookies;
        totalCupButter = cupButterPerCookie * amountCookies;
        totalCupFlour = cupFlourPerCookie * amountCookies;
        
        
        JOptionPane.showMessageDialog(null, "To make " + amountCookies + "(s)" + " .You will need:\n" +
                totalCupSugar + "cup(s) of sugar, " + totalCupButter + 
                "cup(s) of butter, " + totalCupFlour + " cup(s) of flour.");
        
        System.exit(0);
    }
}
