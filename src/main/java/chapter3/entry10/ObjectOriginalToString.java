package chapter3.entry10;

/**
 * In entry 9, it says
 * the unsigned hexadecimal representation of the hash code,
 *
 * @author jacka
 * @version 1.0 on 12/18/2016.
 */
public class ObjectOriginalToString {

  private String name;

  private static int i = 0;


  public static void main(String[] args) {

    ObjectOriginalToString obj = new ObjectOriginalToString();
    System.out.println(obj);
    System.out.println(Integer.toHexString(obj.hashCode()));
    new Object();
  }
}
