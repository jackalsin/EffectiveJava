package chapter6.entry30.payroll;

/**
 * <p>This class fix the problem aroused from the {@code BadPayRoll}</p>
 * @author jacka
 * @version 1.0 on 12/25/2016.
 */
public enum GoodPayroll {
  MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY),
  WEDNESDAY(PayType.WEEKDAY), THURSDAY(PayType.WEEKDAY),
  FRIDAY(PayType.WEEKDAY),
  SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);
  GoodPayroll(PayType payType) {
    if (payType == null) throw new NullPointerException();
    this.payType = payType;
  }
  private final PayType payType;
  public double pay(double hoursWorked, double payRate) {
    return payType.pay(hoursWorked, payRate);
  }
  private enum PayType {
    WEEKDAY {
      @Override
      double overtimePay(double hrs, double payRate) {
        return hrs <= HOUR_OF_SHIFT ? 0 : (hrs - HOUR_OF_SHIFT) * payRate / 2d;
      }
    }, WEEKEND {
      @Override
      double overtimePay(double hrs, double payRate) {
        return hrs * payRate / 2d;
      }
    };

    private static final int HOUR_OF_SHIFT = 8;

    abstract double overtimePay(double hrs, double payRate);

    double pay(double hrs, double payRate) {
      double basePay = hrs * payRate;
      return basePay + overtimePay(hrs, payRate);
    }
  }
}
