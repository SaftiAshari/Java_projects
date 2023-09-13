import java.util.*;

class Movie {
  String title;
  String genre;
  int rating;

  public Movie(String title, String genre, int rating) {
    this.title = title;
    this.genre = genre;
    this.rating = rating;
  }

  public void show() {
    System.out.println("Title:" + this.title + "Genre:" + this.genre + "Rating:" + this.rating);
  }
}

public class MovieTestDrive {
  public static void main(String[] args) {
    ArrayList<Movie> a = new ArrayList<Movie>();
    Movie movie1 = new Movie("Avengers", "Action", 5);
    a.add(movie1);
    Movie movie2 = new Movie("Avengers:Endgame", "Action", 5);
    a.add(movie2);
    Movie movie3 = new Movie("Avengers:Infinity War", "Action", 5);
    a.add(movie3);
    Movie movie4 = new Movie("Avengers:Age of Ultron", "Action", 5);
    a.add(movie4);
    Movie movie5 = new Movie("Avengers:Age of Ultron", "Action", 5);
    a.add(movie5);
    for (int i = 0; i < 5; i++) {
      a.get(i).show();
    }

  }
}