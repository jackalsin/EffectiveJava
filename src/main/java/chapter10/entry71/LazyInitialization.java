package chapter10.entry71;

/**
 * @author jacka
 * @version 1.0 on 1/3/2017.
 */
public class LazyInitialization {

  private static class FieldHolder {
    static int i = 0;
    static final FieldType field = computeFieldValue();

  }

  private static FieldType computeFieldValue() {
    FieldHolder.i++;
    return null;
  }

  private static FieldType getField() {
    return FieldHolder.field;
  }

  public static void main(String[] args) {
    System.out.println(FieldHolder.i);
    getField();
    System.out.println(FieldHolder.i); // it will always return 1 and thread safe
    getField();
    System.out.println(FieldHolder.i); // it will always return 1 and thread safe
    getField();
    System.out.println(FieldHolder.i);
  }


}
