package chapter3.entry17;

import java.util.Date;

/**
 * @author jacka
 * @version 1.0 on 12/22/2016.
 */
public class Sub extends Super{
  private final Date date;

  public Sub() {
    date = new Date();
  }

  @Override
  public void overrideMe() {
    System.out.println(date);
  }

  public static void main(String[] args) {
    Sub sub = new Sub();
    sub.overrideMe();
  }
}
