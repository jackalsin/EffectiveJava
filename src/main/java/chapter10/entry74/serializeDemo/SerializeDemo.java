package chapter10.entry74.serializeDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * This is the serialize process of an object.
 *
 * @author jacka
 * @version 1.0 on 1/4/2017.
 */
public class SerializeDemo {

  /**
   * The file to save the serializable object.
   */
  static final String OUT_FILE = "testSerializable.tmp";

  public static void main(String[] args) {
    Employee e = new Employee("Alex Zader", 33, Employee.Gender.MALE);
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(OUT_FILE);
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(e);
      objectOutputStream.close();
      fileOutputStream.close();
    } catch (IOException e1) {
      e1.printStackTrace();
    }
  }
}
