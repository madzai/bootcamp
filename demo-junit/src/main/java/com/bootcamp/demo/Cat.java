package com.bootcamp.demo;

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
  private Gun gun;
  // @Getter
  private boolean isAlive;

  public Cat() {
    this.isAlive = true;
  }

  // public void setGun(Gun gun) {
  // this.gun = gun;
  // }

  public void beingKilled() {
    this.isAlive = false;
  }

  public void attack(Cat targetCat) {
    if (this.gun == null)
      return;
    if (this.gun.shoot()) {
      targetCat.beingKilled();
    }
  }

  public boolean getIsAlive() {
    return this.isAlive;
  }

}
