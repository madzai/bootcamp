package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GunTest {
  @Test
  void testShoot() {
    Gun gun = new Gun();
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(6, gun.getBullet());

    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot());
    Assertions.assertEquals(true, gun.shoot()); // ! requirement changed (bullets 6 -> 7)
    Assertions.assertEquals(0, gun.getBullet());
    Assertions.assertEquals(false, gun.shoot());
    Assertions.assertEquals(0, gun.getBullet());
  }
}
