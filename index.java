import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the length:");
        int a=input.nextInt();
       int array[]=new int[a];
       System.out.println("Enter elements:");
       int sum=0;
       for(int i=0;i<5;i++)
       {
        array[i]=input.nextInt();
        sum+=array[i];
       }
     System.out.println("The sum of all elements:"+sum);
    }
}
