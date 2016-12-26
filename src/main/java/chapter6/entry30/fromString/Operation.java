package chapter6.entry30.fromString;

import java.util.HashMap;
import java.util.Map;

/**
 * When creating an enum, you will automatically get a toString() method.
 * @author jacka
 * @version 1.0 on 12/25/2016.
 */
public enum Operation {
  PLUS("+") {
    double apply(double x, double y) { return x + y; }
  },
  MINUS("-") {
    double apply(double x, double y) { return x - y; }
  },
  TIMES("*") {
    double apply(double x, double y) { return x * y; }
  },
  DIVIDE("/") {
    double apply(double x, double y) { return x / y; }
  };
  private final String symbol;
  Operation(String symbol) { this.symbol = symbol; }
  @Override public String toString() { return symbol; }
  abstract double apply(double x, double y);

  /* example to implement the fromString method */
  private static final Map<String, Operation> stringToEnum = new HashMap<>();
  static { // Initialize map from constant name to enum constant
    for (Operation op : values())
      stringToEnum.put(op.toString(), op);
  }
  // Returns Operation for string, or null if string is invalid
  public static Operation fromString(String symbol) {
    return stringToEnum.get(symbol);
  }


}
