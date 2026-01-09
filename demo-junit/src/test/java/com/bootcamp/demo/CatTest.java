package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ! Cat -> Gun

public class CatTest {
  @Test
  void testAttack() {
    Cat c1 = new Cat();
    c1.setGun(new Gun());

    Cat c2 = new Cat();
    Assertions.assertEquals(true, c1.isAlive());
    Assertions.assertEquals(true, c2.isAlive());
    c1.attack(c2);
    Assertions.assertEquals(false, c2.isAlive());
    Assertions.assertEquals(6, c1.checkBullet());

    c1.attack(c2);
    c1.attack(c2);
    c1.attack(c2);
    c1.attack(c2);
    c1.attack(c2);
    c1.attack(c2);
    c1.attack(c2);
    Assertions.assertEquals(0, c1.checkBullet().orElse(-1));
  }

  @Test
  void testAttack2() {
    Cat c1 = new Cat();
    c1.setGun(new Gun());
    Assertions.assertEquals(7, c1.checkBullet().orElse(-1));
    c1.clearBullet();
    Assertions.assertEquals(0, c1.checkBullet().orElse(-1));
    Cat c2 = new Cat();
    c1.attack(c2);
    Assertions.assertEquals(true, c2.isAlive());
  }

}
