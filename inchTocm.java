import java.util.Scanner;
public class inchTocm{
  public static void main(String[]args){
    int a;
    double b;
    Scanner sn = new Scanner(System.in);
    System.out.print("input INCH:");
    a = sn.nextInt();
    b = (double) a/0.3937;
    System.out.println("Result in CM :"+b);
  }
}