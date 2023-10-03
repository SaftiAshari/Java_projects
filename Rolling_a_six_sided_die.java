
import java.util.*;

public class Rolling_a_six_sided_die {
    public static void main(String[] args) {
        Random randomnumbers = new Random();
        int face;
        for (int i = 1; i <= 20; i++) {
            face = 1 + randomnumbers.nextInt(6);
            System.out.printf("%d ", face);
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}
