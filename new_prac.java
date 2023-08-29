import java.util.Scanner;
import java.util.ArrayList;
public class new_prac {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> a=new ArrayList<Integer>();
        System.out.println("Enter elements:");
        for(int i=0;i<3;i++)
        {
            a.add(input.nextInt());
        }
        System.out.println(a);
    }
}
