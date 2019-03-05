/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

/**
 *
 * @author tran le truc
 */
import javax.swing.JOptionPane;
public class Week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Hay nhap ten ban: ");
        JOptionPane.showMessageDialog(null,"Xin chao " +  result + "!");
        
        System.exit(0);
        // TODO code application logic here
    }
    
}
