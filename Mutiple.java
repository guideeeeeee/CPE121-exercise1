import java.util.Scanner;
public class Mutiple{
  public static void main(String[]args){
    int a,b,c,d,answer;
    Scanner sn = new Scanner(System.in);
    System.out.print("Input 000 to 999 :");
    a = sn.nextInt();
    b = a%10;
    c = (a/10)%10;
    d = (a/100);
    answer = d*c*b;
    System.out.println("Result = "+answer);
  }
}