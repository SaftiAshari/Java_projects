class Books{
    String title;
    String Author;
    public Books(String title,String Author)
    {
        this.title=title;
        this.Author=Author;
    }
    public void show()
    {
        System.out.println("Author:"+this.Author);
         System.out.println("Title:"+this.title);
    }
}
public class Books_Test_drive {
    public static void main(String[] args) {
     Books book1=new Books("Harry Potter", "Jk Rowling");
     Books book2=new Books("AR Rsahikul Makhtum", "Safiur Rahman Mubarakpuri");
     book1.show();
     book2.show();
    
    }
}
