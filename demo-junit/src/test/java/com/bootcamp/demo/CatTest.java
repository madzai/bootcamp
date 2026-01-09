package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ! Cat -> Gun

public class CatTest {
  @Test
  void testCat() {
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Assertions.assertEquals(true, cat1.getIsAlive());
    cat1.setGun(new Gun());
    cat1.attack(cat2);
    // Assertions.assertEquals(true, cat1.getIsAlive());
    Assertions.assertEquals(false, cat2.getIsAlive());

  }

}
