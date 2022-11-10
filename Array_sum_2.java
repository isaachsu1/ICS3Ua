/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author isaac
 */
public class Array_sum_2 {

    public static void main(String[] args) {
    
        int [] arr = new int [] {1, 2, 3, 4, 5};  
        
       System.out.println(arr.length); 

        int sum = 0;  
         
        for (int i = 0; i < arr.length; i++) {  
            System.out.println(arr[i]);
           sum = sum + arr[i];  
        }  
    System.out.println("Sum of all the elements of an array: " + sum );  
    }
}

  
 /*  Evaluation of for loop
when i=0 ,  sum = sum + arr[0] = 0+1=1;
when i=1, sum = sum + arr[1] = 1+2= 3;
when i=2 , sum =sum + arr[2] = 3+ 3 =6;
when i=3 , sum = sum + arr[3] = 6+ 4= 10;
 when i=4 , sum = sum + arr[4] = 10+ 5= 15; 
*/
