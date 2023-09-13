import java.util.*;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            a.add(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(a.get(i));
        }
    }
}
