public class Student {
  private int rating;
  private String name;
  static int count = 0;
  static int rating_all=0;

  public Student(String name) {

    this.name= name;
    count++;
  }

  public static double getAvgRating() {
    if (count >0) {return rating_all / (double)count;}
    else {return 0.0;}

  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return this.rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    rating_all += this.rating;
  }

  public boolean betterStudent(Student student) {
    return this.rating>student.rating;
  }

  public void changeRating(int rating) {
    rating_all -= this.rating;
    rating_all += rating;
    this.rating = rating;

  }

  public static void removeStudent(Student student) {
    rating_all -= student.rating;
    count --;

  }

  @Override
  public String toString() {
    return this.name +" "+ this.rating;
  }
}
