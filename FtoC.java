import java.util.Scanner;
public class FtoC{
  public static void main(String[]args){
    double F,C;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter a degree in Fahrenheit:");
    F = sn.nextDouble();
    C =(5*(F-32))/9;
    System.out.printf(" %.2f Fahrenheit is %.2f Celsius",F,C);
  }
}