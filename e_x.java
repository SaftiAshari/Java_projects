import java.util.*;

public class e_x {
    public static int factorial(int n) {
        if (n < 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;
        double x = input.nextDouble();
        for (int i = 0; i < 20; i++) { // Change the loop condition here
            sum += Math.pow(x, i) / factorial(i);
        }
        System.out.println(sum);
    }
}
