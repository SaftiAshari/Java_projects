import java.util.Scanner;
public class Practice {
    //  define a function to add 2 matrices
    public static int[][] add(int[][] a,int[][] b)
    {
        int[][] c=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
    // define a function to take input from user to fill a 2D array
    public static int[][] input()
    {
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
        return a;
    }
    public static int[][] multiply(int[][]a,int[][]b)
    {
        int [][]c=new int[3][3];
          for(int i=0;i<3;i++)
          {
               for(int j=0;j<3;j++)
               {
                 for(int k=0;k<3;k++)
                 {
                      c[i][j]+=a[i][k]*b[k][j];
                 }
               }
          }
         return c;
    }
    // define a function to print a 2D array
    public static void print(int[][] a)
    {
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
       
       int [][]a=new int[3][3];
       int [][]b=new int[3][3];
       int [][]c=new int[3][3];
       int [][]d=new int[3][3];
         a=input();
         b=input();
         c=add(a,b);
         System.out.println("Sum of 2 matrices:");
         print(c);
         System.out.println("Multiplication of 2 matrices:");
         d=multiply(a,b);
        print(d);
        
    }
}

    


