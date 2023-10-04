import javax.swing.JOptionPane;

interface Myfunction {
    double operate(double a, double b, double c);
}

public class MaximumFinder {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter first floating-point value:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter second floating-point value:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter third floating-point value:"));
        Myfunction max = (x, y, z) -> Math.max(x, Math.max(y, z));
        double z = max.operate(a, b, c);
        String message = String.format("Maximum of %f, %f and %f is %f", a, b, c, z);
        JOptionPane.showMessageDialog(null, message);
    }

}
