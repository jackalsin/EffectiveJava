package chapter10.entry74.serializeDemo;

import java.io.Serializable;

/**
 * This is a class used to test {@code Serializable} interface usage.
 *
 * @author jacka
 * @version 1.0 on 1/4/2017.
 */
public class Employee implements Serializable {
  private static final long serialVersionUID = 42L;
  private final String name;
  private final int age;
  private final Gender gender;

  public Employee(String name, int age, Gender gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public Gender getGender() {
    return gender;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", gender=" + gender +
        '}';
  }

  /**
   * A class that represents gender.
   */
  public enum Gender {
    MALE, FEMALE
//    ,EUNUCH // this one add after serializing
    ;
  }
}