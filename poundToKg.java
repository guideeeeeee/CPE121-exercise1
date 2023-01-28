import javax.swing.JOptionPane;
public class poundToKg{
  public static void main(String[]args){
    Double k;
    String pound = JOptionPane.showInputDialog("Enter a number in pound");
    Double p = Double.parseDouble(pound);
    k = p/0.454;
    String k3 = String.format("%.3f", k);
    JOptionPane.showMessageDialog(null,"It is "+k3+" Kilograms");
  }
}