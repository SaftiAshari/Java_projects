import java.util.*;

public class RollDie {
    public static void main(String[] args) {
        ArrayList<Integer> frequency = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            frequency.add(0);
        }

        Random randomNumbers = new Random();
        int face;
        for (int i = 1; i <= 6000; i++) {
            face = 1 + randomNumbers.nextInt(6);
            frequency.set(face - 1, frequency.get(face - 1) + 1);
        }
        System.out.printf("Name\tFrequency\n");
        for (int j = 1; j <= 6; j++) {
            System.out.printf("%d\t%d\n", j, frequency.get(j - 1));
        }
    }
}
