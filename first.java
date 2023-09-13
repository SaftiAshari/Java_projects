import java.util.*;

class Triangle_area {
    int side1 = 3;
    int side2 = 4;
    int side3 = 5;

    public void area() {
        int s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.println("Area of triangle:" + area);
    }

}

public class first {
    public static void main(String[] args) {
        Triangle_area t = new Triangle_area();
        t.area();
    }
}
