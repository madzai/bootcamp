package com.bootcamp.demo;

import java.util.Optional;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// Customer -> Orders -> Items
// Item -> Order -> Customer

@ToString
@EqualsAndHashCode
public class Cat {
  @Setter
  // @Getter
  private Gun gun;
  @Getter
  boolean isAlive;

  public Cat() {
    this.isAlive = true;
  }

  // public void setGun(Gun gun) {
  // this.gun = gun;
  // }

  public void clearBullet() {
    if (this.gun != null)
      this.gun.clearBullet();
  }

  // APIE
  public Optional<Integer> checkBullet() {
    if (this.gun != null)
      return Optional.of(this.gun.getBullet());
    return Optional.empty();
  }

  public void beingKilled() {
    this.isAlive = false;
  }

  public void attack(Cat targetCat) {
    if (this.gun == null || !this.isAlive)
      return;
    if (this.gun.shoot()) {
      targetCat.beingKilled();
    }
  }

  // public boolean getIsAlive() {
  // return this.isAlive;
  // }

}
