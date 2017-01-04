package chapter10.entry74.finalMethod;

/**
 * This is a super class contain one method/constructor marked as final to test if it's legal.
 *
 * @author jacka
 * @version 1.0 on 1/4/2017.
 */
public class SuperClass {
  private final int identifier;

  /**
   * The constructor cannot be final.
   */
  public SuperClass() {
    this.identifier = 1;
  }

  public final void printState() {
    System.out.printf("The identifier = %d%n" , identifier);
    System.out.printf("The identifier = %d/n" , identifier);
  }

  public static void main(String[] args) {
    new SuperClass().printState();
    System.out.println("This is the second line.");
  }
}
