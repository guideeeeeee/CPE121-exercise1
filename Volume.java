import javax.swing.JOptionPane;
public class Volume{
  public static void main(String[]args){
    Double area,volume;
    String radius = JOptionPane.showInputDialog(null,"Enter the radius of a cylinder");
    Double r = Double.parseDouble(radius);
    String length = JOptionPane.showInputDialog(null,"Enter the length of a cylinder");
    Double l = Double.parseDouble(length);
    area = r*r*Math.PI;
    volume = area *l;
    JOptionPane.showMessageDialog(null,"The area is "+area);
    JOptionPane.showMessageDialog(null,"The volume of the cylinder is  "+volume);
  }
}