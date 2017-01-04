package chapter10.entry74.serializeDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * This class shows how to deserialize an object.
 *
 * @author jacka
 * @version 1.0 on 1/4/2017.
 */
public class DeserializeDemo {

  public static void main(String[] args) {
    System.out.println("Deserializing ... ");

    try {
      FileInputStream inputStream = new FileInputStream(SerializeDemo.OUT_FILE);
      ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
      Employee e = (Employee) objectInputStream.readObject();
      System.out.println(e);
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
