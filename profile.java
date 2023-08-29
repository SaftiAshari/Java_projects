import java.util.*;
class Database {
   String name;
    int id;
    String address;
    public Database(String name,int id,String address)
    {
        this.name=name;
        this.id=id;
        this.address=address;
    }
    public void show()
    {
        System.out.println("Name:"+this.name);
        System.out.println("Id:"+this.id);
        System.out.println("Address:"+this.address);
    }
}
public class profile {
    public static void main(String[] args) {
        ArrayList<Database> a=new ArrayList<Database>();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n=input.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter name:");
            String name=input.next();
            System.out.println("Enter id:");
            int id=input.nextInt();
            System.out.println("Enter address:");
            String address=input.next();
            Database student=new Database(name,id,address);
            a.add(student);
        }
        for(int i=0;i<n;i++)
        {
            a.get(i).show();
        }
    }
}
