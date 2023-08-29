import java.util.Scanner;
public class prime_checker {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
     System.out.println("Enter a number:");
     int n=input.nextInt();
     if(prime_checker(n))
     {
        System.out.println("Prime number");
     }
     else
     {
        System.out.println("Not a prime number");
     }
    }
     public static boolean prime_checker(int n)
    {   int i;
    
        if(n<=1)
        {
            return false;
        }
        for(i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }
}
