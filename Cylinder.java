import javax.swing.JOptionPane;

public class Cylinder {
    public static void main(String[] args) {
        String radiusInput = JOptionPane.showInputDialog("Enter the radius of the cylinder:");
        double radius = Double.parseDouble(radiusInput);

        String lengthInput = JOptionPane.showInputDialog("Enter the length of the cylinder:");
        double length = Double.parseDouble(lengthInput);

        double area = radius * radius * Math.PI;
        double volume = area * length;

        JOptionPane.showMessageDialog(null, "Area: " + area + "\nVolume: " + volume);
    }
}