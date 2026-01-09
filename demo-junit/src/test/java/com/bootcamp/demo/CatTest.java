package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

// ! Cat -> Gun

public class CatTest {
  // ! testAttack() and testAttack2() are integration tests
  // Cat Test depends on Gun completeness

  @Mock // ! behavior (method) doesn't exist by default
  private Gun gun; // object reference

  // ! Unit Test (Testing Env.)
  void testAttack3() {
    Mockito.when(this.gun.shoot()).thenReturn(true);
    Cat c1 = new Cat();
    c1.setGun(this.gun);
    // Testing ...
    Cat c2 = new Cat();
    c1.attack(c2);
    Assertions.assertEquals(false, c2.isAlive());
  }

  // ! Unit Test (Testing Env.)
  void testAttack4() {
    Mockito.when(this.gun.shoot()).thenReturn(false);
    Cat c1 = new Cat();
    c1.setGun(this.gun);
    // Testing ...
    Cat c2 = new Cat();
    c1.attack(c2);
    Assertions.assertEquals(true, c2.isAlive());
  }

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
