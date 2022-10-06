/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author isaac
 */
import java.util.Scanner;
public class Circle_area_calculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter radius below:");
        int radius = in.nextInt();
        double PI=3.14159;
        if(radius>0){
            double area=(radius*radius)*PI;
            System.out.println("area");
            System.out.println(area);
         
            
        }
        else if(radius<0){
        System.out.println("negative input");
        
        
    }
}
}
