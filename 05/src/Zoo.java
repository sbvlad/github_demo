import java.util.List;

public class Zoo{

  /**
   * Feeds different bird sections of the zoo.
   *
   * @param list list of birds of particular type
   */
  public static void feed(List list) {

    System.out.println("Feeding birds");
    for (Object bird: list) {
      System.out.println(bird);
    }
  }

  /**
   * Adds birds to a flying section of the zoo.
   *
   * @param list list of birds of particular type
   * @param bird new bird
   */
  public static void acceptBird(List <? super FlyingBird>list, FlyingBird bird) {

    System.out.println("Accepting bird to a section");
    list.add(bird);
    for (Object accepted_bird:list) {
      System.out.println(accepted_bird);
    }



  }

  /**
   * Adds bird to the general list.
   *
   * @param list    list of birds
   * @param newBird bird to add
   */
  public static void registerBird(List<Bird> list, Bird newBird) {
    list.add(newBird);
    System.out.println("Adding bird to the birds list");
    for (Object bird:list) {
      System.out.println(bird.toString());
    }
  }
}