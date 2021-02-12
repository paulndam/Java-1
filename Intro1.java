import javax.swing.JOptionPane;
import java.util.Scanner;

public class Intro1 {

    // syntax for declaring main method

    public static void main(String[] args) {

        int quantity = 3;
        double price = 32.90;
        float floatNum = 23.97e+12F;
        char character = 75;
        boolean valid = true;

        System.out.println("Quantity = " + quantity);
        System.out.println("price = " + price);
        System.out.println("floatNum = " + floatNum);
        System.out.println("character = " + character);
        System.out.println("valid = " + valid);

        // Dialogou part exercise

        String input = JOptionPane.showInputDialog("What car do you like");
        String message = "My friend heres likes a" + " " + input + "\n\n" + "please hit enter to exit";

        JOptionPane.showInputDialog(message);

        String msg = "order total is :-> $100 \n" + "discount is ---> $20.00 \n" + "incoice is ---> $80.00" ;
        JOptionPane.showMessageDialog(null, msg, "Invoice", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);

        

    }

    // To declare a method , you need to delcare it out of the main method

    




    

        
        

    
}