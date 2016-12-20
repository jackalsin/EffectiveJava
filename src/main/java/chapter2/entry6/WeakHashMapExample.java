package chapter2.entry6;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/**
 * @author jacka
 * @version 1.0 on 12/18/2016.
 */
public class WeakHashMapExample {
  public static void main(String[] args) {
    String a = new String("a");
    String b = new String("b");
    Map<String, String> map = new HashMap<>();

    Map<String, String> weakMap = new WeakHashMap<>();
    map.put(a, "aaa");
    map.put(b, "bbb");

    weakMap.put(a, "aaa");
    weakMap.put(b, "bbb");

    map.remove(a);

    a = null;
    System.gc();
    System.out.println(weakMap);

  }
}
