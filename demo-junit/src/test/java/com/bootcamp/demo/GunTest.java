package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GunTest {
  @Test
  void testShoot() {
    Gun gun = new Gun();
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(6, gun.getBullet()); // ! requirement changed
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot()); // ! requirement changed
    Assertions.assertEquals(0, gun.getBullet());
    Assertions.assertEquals(false, gun.shoot());
    Assertions.assertEquals(0, gun.getBullet());
  }
}
