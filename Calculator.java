import java.security.DrbgParameters.Reseed;

public class Calculator {
   private int a;
   private int b;
   public Calculator(int num1,int num2)
   {
      this.a=num1;
      this.b=num2;
      System.out.println(a+b);
      
   }
   public static void main(String[] args) {
    Calculator calc=new Calculator(5,6);
   

   }
}
