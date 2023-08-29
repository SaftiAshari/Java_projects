import java.util.Scanner;
public class multiD_arra {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][]a=new int[3][3];
        System.out.println("Enter elements:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=input.nextInt();
            }
        }
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
