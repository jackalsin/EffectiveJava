package chapter6.entry30.Operations;

/**
 * Fix the problem shown in BadOperations
 * @author jacka
 * @version 1.0 on 12/24/2016.
 */
public enum GoodOperations {
  PLUS { double apply(double x, double y){return x + y;} },
  MINUS { double apply(double x, double y){return x - y;} },
  TIMES { double apply(double x, double y){return x * y;} },
  DIVIDE { double apply(double x, double y){return x / y;} };
  abstract double apply(double x, double y);
}
