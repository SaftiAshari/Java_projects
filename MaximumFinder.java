import java.util.*;
import javax.swing.JOptionPane;

public class MaximumFinder {
    public static int Maximum(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first integer"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second integer"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("Enter third integer"));
        int max = Maximum(a, b, c);
        JOptionPane.showMessageDialog(null, "Maximum is " + max);
    }

}
