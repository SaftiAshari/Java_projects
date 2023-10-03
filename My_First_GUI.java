import javax.swing.JOptionPane;

public class My_First_GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name");
        String meesage = String.format("Welcome, %s, to Java Programming!", name);
        JOptionPane.showMessageDialog(null, meesage);
    }
}
