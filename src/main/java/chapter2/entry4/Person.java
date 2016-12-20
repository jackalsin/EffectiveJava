package chapter2.entry4;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * @author jacka
 * @version 1.0 on 12/17/2016.
 */
public class Person {
  private final Date birthDate;

  private static final Date BOOM_START;
  private static final Date BOOM_END;

  static {
    Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0 ,0);
    BOOM_START = gmtCal.getTime();
    gmtCal.set(1965, Calendar.JANUARY, 1, 0,0,0);
    BOOM_END = gmtCal.getTime();
    System.out.println("static field is called.");
  }

  public Person(Date birthDate) {
    this.birthDate = birthDate;
  }

  public boolean isBabyBoomer() {
    return birthDate.compareTo(BOOM_START) >= 0
        && birthDate.compareTo(BOOM_END) < 0;
  }

  public void callUnrelatedMethods() {
    System.out.println("This is unrelated method");
  }

  public static void main(String[] args) {
    // when call an unrelated method, the static field won't be initialized.
    Person john = new Person(new Date(1991, 7, 15));
    john.callUnrelatedMethods();

    Person peter = new Person(new Date(1933, 3, 2));
    System.out.println(peter.isBabyBoomer());

  }
}