/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author isaac
 */
import java.util.Scanner;

public class Scannerclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
    
    Scanner in = new Scanner(System.in);

    System.out.println("Enter your name: ");
    System.out.println("Isaac");
    // takes input from the keyboard
    String name = in.nextLine();
    //System.out.println("hello");
            

    // prints the name
    System.out.println("My name is " + name);

    // closes the scanner
   // Scanner.close();
  
        
        
    }
}
    

