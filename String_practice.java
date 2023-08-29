public class String_practice {
    public static void main(String[] args) {
      
        int checker=palindrome_checker("safti");
     
      if(checker==0)
      {
        System.out.println("The word is palindrome");
      }
      else
      {
         System.out.println("The word is not palindrome");
      }
}
 public static int palindrome_checker(String name1)
{       int check=0;
        int j,i;
 for(i=0,j=name1.length()-1;i<name1.length();i++,j--)
      {
       if(name1.charAt(i)!=name1.charAt(j))
       {
        check=1;
        break;
       }
       else
       {
        check=0;
       }
      }
      return check;
}
    
}

