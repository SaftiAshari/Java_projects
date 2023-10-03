import java.util.*;

class Calculate_Average {
    int a;
    int b;
    int c;

    public Calculate_Average(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    // a get method to get the value of a

    public void show() {
        System.out.println("The average:" + (this.a + this.b + this.c) / 3);
    }
}

public class prac_2 {
    public static void main(String[] args) {
        ArrayList<Calculate_Average> a = new ArrayList<Calculate_Average>();
        Calculate_Average c1 = new Calculate_Average(1, 2, 3);
        a.add(c1);
        Calculate_Average c2 = new Calculate_Average(4, 5, 6);
        a.add(c2);
        Calculate_Average c3 = new Calculate_Average(7, 8, 9);
        a.add(c3);
        Calculate_Average c4 = new Calculate_Average(10, 11, 12);
        a.add(c4);
        Calculate_Average c5 = new Calculate_Average(13, 14, 15);
        a.add(c5);
        for (int i = 0; i < 5; i++) {
            a.get(i).show();
        }
    }
}
