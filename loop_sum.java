/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author isaac
 */
public class loop_sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
         int num = 10, sum = 0;

        for(int i = 1; i <= num; i++)
        {
            sum += i;
        }

        System.out.println("The sum of the first 10 numbers is " + sum);
    }
}
    
