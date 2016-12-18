package chapter2.entry3;

/**
 * This is meaningless.
 * @author jacka
 * @version 1.0 on 12/17/2016.
 */
public enum SingletonEnum {
  INSTANCE;

  public void leavingTheBuilding() {
    System.out.println("Instance = " + INSTANCE);
  }


}
