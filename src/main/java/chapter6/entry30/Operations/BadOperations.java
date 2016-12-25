package chapter6.entry30.Operations;

/**
 * This class provides a working enum class for Operations
 * However, there are 2 flaws:
 * 1) if you add one more operation, you are very likely to miss to add it in switch statement
 * 2) You will get an compile error without throw statement.
 * @author jacka
 * @version 1.0 on 12/24/2016.
 */
public enum  BadOperations {

  PLUS, MINUS, TIMES, DIVIDE;
  // Do the arithmetic op represented by this constant
  double apply(double x, double y) {
    switch(this) {
      case PLUS: return x + y;
      case MINUS: return x - y;
      case TIMES: return x * y;
      case DIVIDE: return x / y;
    }

    throw new AssertionError("Unknown op: " + this);
  }

}
