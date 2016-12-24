package chapter5.entry27;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jacka
 * @version 1.0 on 12/24/2016.
 */
public class GenericMethod<T> {

  // static method must specify the <T> before the return type.
  private static <T> Set<T> getSet() {
    return new HashSet<>();

  }

  public static void main(String[] args) {

    Set<Integer> aSet = getSet();
  }

}
