import java.lang.Math;
class perimeter{
    int radius;
    String Shape;
    public perimeter(int radius,String Shape)
    {
        this.radius=radius;
        this.Shape=Shape;
    }
    public void get_perimeter()
    {
      
        System.out.println("The perimeter of "+this.Shape+":"+Math.PI*2*this.radius);
    }
   
}
class Area extends perimeter{
  public Area(int radius,String Shape)
  {
     super(radius, Shape);
  }
  public void get_area()
  {
    System.out.println("The Area of "+this.Shape+":"+Math.PI*Math.pow(this.radius, 2));
  }

}
public class Main {
    public static void main(String[] args) {
        Area shape1=new Area(5, "Circle");
        shape1.get_perimeter();
        shape1.get_area();
    }
}
