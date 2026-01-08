package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Cat {
  private String name;
  private int age;

  // constructor
  // getter, setter
  // toString, equals, hashCode

  public static void main(String[] args) {
    // Testing for empty constructor
    Cat c1 = new Cat();
    System.out.println(c1.getName() == null); // true
    System.out.println(c1.getAge() == 0); // true
    // System.out.println(c1);

    // Testing for all argument constructor
    Cat c2 = new Cat("John", 3);
    System.out.println(c2.getName().equals("John")); // true
    System.out.println(c2.getAge() == 3); // true

    // Test for setter
    c1.setAge(3);
    c1.setName("Jane");
    System.out.println(c1.getName() == "Jane"); // true
    System.out.println(c1.getAge() == 3); // true
    // System.out.println(c1);

    // Test for equals and hashCode
    Cat c4 = new Cat("Robert", 8);
    Cat c3 = new Cat("Robert", 8);
    System.out.println("c4 = c3? " + c4.equals(c3));
    System.out
        .println("Hash code: c4 = c3? " + (c2.hashCode() == c3.hashCode()));
    System.out.println("c1 = c3? " + c1.equals(c3));
    System.out
        .println("Hash code: c1 = c3? " + (c1.hashCode() == c3.hashCode()));

    // toString - not needed for testing
    System.out.println(c2);

  }
}
