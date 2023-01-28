import java.util.Scanner;
public class BMI{
  public static void main(String[]args){
    double wht,hht,bmi;
    Scanner sn = new Scanner(System.in);
    System.out.print("Enter weight in kg : ");
    wht=sn.nextInt();
    System.out.print("Enter height in cm : ");
    hht=sn.nextInt();
    bmi = wht /((hht*hht)/10000);
    System.out.println("BMI is  "+bmi);
  }
}