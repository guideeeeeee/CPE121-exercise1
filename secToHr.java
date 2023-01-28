import java.util.Scanner;
public class secToHr{
  public static void main(String[]args){
    int a,sec,min,hr;
    Scanner sn = new Scanner(System.in);
    System.out.print("Input number of Second :");
    a = sn.nextInt();
    sec = a%60;
    min = (a/60)%60;
    hr = (a/3600);
    System.out.println(a+"Seconds is "+hr+" hours "+min+" minutes "+sec+" seconds ");
  }
}