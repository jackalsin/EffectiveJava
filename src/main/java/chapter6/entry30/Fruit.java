package chapter6.entry30;

/**
 * @author jacka
 * @version 1.0 on 12/24/2016.
 */
public class Fruit {
  public enum Apple { FUJI, PIPPIN, GRANNY_SMITH }
  public enum Orange { NAVEL, TEMPLE, BLOOD }

  void testIfParamCanBeNull(Apple appleLoc) {
    System.out.println(appleLoc);
  }
  public static void main(String[] args) {
    // still can be null;
    new Fruit().testIfParamCanBeNull(null);

  }
}
