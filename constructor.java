class Data_Base{
        int id;
        String name;
        String Address;
        public Data_Base(String name,int id,String Address)
        {
            this.name=name;
            this.id=id;
            this.Address=Address;
        }
        public void Show()
        {
            System.out.println("Name:"+this.name);
             System.out.println("Id:"+this.id);
             System.out.println("Address:"+this.Address);
        }
    }
public class constructor {
    
    public static void main(String[] args) {
        Data_Base student=new Data_Base("Safti", 1905107, "Dhaka");
        student.Show();
    }
}








