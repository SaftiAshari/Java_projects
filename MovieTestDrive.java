
class Movie {
  String title;
  String gener;
  int time;
  public void Show()
  {
    System.out.println("Fucking "+title);
  }
 }
 public class MovieTestDrive {
 public static void main(String[] args) {
  Movie movie1=new Movie();
   movie1.time=2;
   movie1.title="Wolf of Wall street";
   movie1.gener="Finance";
   System.out.println("Title:"+movie1.title+" Time:"+movie1.time+" Gener:"+movie1.gener);
   movie1.Show();
   }
 }
