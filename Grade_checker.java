/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author isaac
 */
import java.util.Scanner;
public class Grade_checker {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter grade below:");
        int grade = in.nextInt();
        
        
        if(grade>=80){
            System.out.println("equal to or more than 80%");}
        
        else if(grade>=60){
        System.out.println(" equal to or more than 60%");}
        
        else if(grade>=40){
        System.out.println("Average");}
        
        else if(grade<=40){
        System.out.println("failed");}
    }
       
    }

