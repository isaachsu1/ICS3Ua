import java.util.Scanner;
import static java.lang.Math.*;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
  System.out.println("enter two numbers below:");
    int x = in.nextInt();
    int y = in.nextInt();

   
    double p= pow(x,y);
    System.out.println(p);

 
    double m= max(x,y);
    System.out.println(m);
  

   
    double s=sqrt(x);
    System.out.println(s);

    double l=log(x);
    System.out.println(l);
  }
}
