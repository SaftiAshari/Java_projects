import java.util.Scanner;

class Matrix{
    int [][]a=new int[3][3];
    int [][]b=new int[3][3];
    public Matrix(int[][] a,int[][] b)
    {
        this.a=a;
        this.b=b;
    }
    public int[][] add()
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
    public int[][] multiply()
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
   

}
class Vector{
    int[]a=new int[3];
    int[]b=new int[3];
    public Vector(int[] a,int[] b)
    {
        this.a=a;
        this.b=b;
    }
    public int[] add()
    {
        int[] c=new int[3];
        for(int i=0;i<3;i++)
        {
            c[i]=a[i]+b[i];
        }
        return c;
    }
    public int dot_product()
    {
        int sum=0;
        for(int i=0;i<3;i++)
        {
            sum+=a[i]*b[i];
        }
        return sum;
    }
    public int[] cross_product()
    {
        int[] c=new int[3];
        c[0]=a[1]*b[2]-a[2]*b[1];
        c[1]=a[2]*b[0]-a[0]*b[2];
        c[2]=a[0]*b[1]-a[1]*b[0];
        return c;
    }
}
public class Calculator_OOP {
    public static int[][]take_Matrix_input()
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
    public static void Matrix_print(int[][] a)
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
    public static int[]Vector_input()
    {
        Scanner input=new Scanner(System.in);
        int []a=new int[3];
        System.out.println("Enter elements:");
        for(int i=0;i<3;i++)
        {
            a[i]=input.nextInt();
        }
        return a;
    }
    public static void Vector_print(int[] a)
    {
        for(int i=0;i<3;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String choice;
        System.out.println("Enter your choice:");
        choice=input.nextLine();
        if(choice.equals("Matrix"))
        {
            int[][]a=new int[3][3];
            int[][]b=new int[3][3];
            a=take_Matrix_input();
            b=take_Matrix_input();
            Matrix m=new Matrix(a,b);
            int seceond_choice;
            System.out.println("Enter your choice: 0 for add, 1 for multiply");
            seceond_choice=input.nextInt();
            if(seceond_choice==0)
            {
                int[][]c=new int[3][3];
                c=m.add();
                System.out.println("Addition is:");
                Matrix_print(c);
            }
            else if(seceond_choice==1)
            {
                int[][]c=new int[3][3];
                c=m.multiply();
                System.out.println("Multiplication is:");
                Matrix_print(c);
            }
            else
            {
                System.out.println("Wrong choice");
            }
        }
        else if(choice.equals("Vector"))
        {
            int[]a=new int[3];
            int[]b=new int[3];
            a=Vector_input();
            b=Vector_input();
            Vector v=new Vector(a,b);
            int seceond_choice;
            System.out.println("Enter your choice: 0 for add, 1 for dot product, 2 for cross product");
            seceond_choice=input.nextInt();
            if(seceond_choice==0)
            {
                int[]c=new int[3];
                c=v.add();
                System.out.println("Addition is:");
                Vector_print(c);
            }
            else if(seceond_choice==1)
            {
                int sum=v.dot_product();
                System.out.println("Dot product is:");
                System.out.println(sum);

            }
            else if(seceond_choice==2)
            {
                int[]c=new int[3];
                System.out.println("Cross product is:");
                c=v.cross_product();
                Vector_print(c);
            }
            else
            {
                System.out.println("Wrong choice");
            }
            
        }
        else
        {
            System.out.println("Wrong choice");
        }
    }
}
