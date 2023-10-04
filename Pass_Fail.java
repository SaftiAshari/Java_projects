import javax.swing.JOptionPane;

public class Pass_Fail {
    public static void main(String[] args) {
        int pass = 0;
        int fail = 0;
        int studentCounter = 1;
        int result;
        while (studentCounter <= 10) {
            result = Integer.parseInt(JOptionPane.showInputDialog("Enter result (1 = pass, 2 = fail)"));
            if (result == 1) {
                pass = pass + 1;
            } else {
                fail = fail + 1;
            }
            studentCounter = studentCounter + 1;
        }
        String output = String.format("Passed: %d\nFailed: %d", pass, fail);
        JOptionPane.showMessageDialog(null, output);
        if (pass > 8) {
            JOptionPane.showMessageDialog(null, "Bonus to instructor!");
        }
    }
}
