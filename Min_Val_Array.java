/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author isaac
 */
public class Min_Val_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int [] arr = new int [] {50, 27, 34, 49, 55};
        
       int max = arr[0];
       
       for (int i = 1; i < arr.length; i++){
          if(arr[i]<max)
           {
             max = arr[i];
             System.out.println("The minimum value within the array is " + max);
           }
          
       }
           
}
}

