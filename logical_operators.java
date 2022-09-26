/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author isaac
 */
public class logical_operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a=10, b=7, c=9;
        // 
        System.out.println("a=10, b=7, c=9");
        System.out.println("(a>b)&&(a>b) is ");System.out.println((a>b)&&(a>b));
        System.out.println("(b>c)&&(a<c) is ");System.out.println((b>c)&&(a>c));
        System.out.println("(a>b)||(a>b) is ");System.out.println((a>b)||(a>b));
        System.out.println("(b>c)||(a<c) is ");System.out.println((b>c)||(a>c));
        System.out.println("!(a>b) is ");System.out.println(!(a>b));
        System.out.println("!(b>c) is ");System.out.println(!(b>c));
    }
}

