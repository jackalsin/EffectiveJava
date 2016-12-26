package chapter6.entry30.payroll;

/**
 * <p>This is a bad example for enum implementation. It looks concise and working perfect well,
 * but has a potential dangerous, which is that if someone who maintains it forgets to add to
 * switch after add another enum value after adding. It compiles and generates the wrong result</p>
 *
 * @author jacka
 * @version 1.0 on 12/25/2016.
 */
public enum BadPayRoll {
  MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
  private static final int HOURS_PER_SHIFT = 8;

  double pay(double hoursWorked, double payRate) {
    double basePay = hoursWorked * payRate;
    double overtimePay; // Calculate overtime pay
    switch(this) {
      case SATURDAY: case SUNDAY:
        overtimePay = hoursWorked * payRate / 2;
      default: // Weekdays
        overtimePay = hoursWorked <= HOURS_PER_SHIFT ?
            0 : (hoursWorked - HOURS_PER_SHIFT) * payRate / 2;
        break;
    }
    return basePay + overtimePay;
  }
}
