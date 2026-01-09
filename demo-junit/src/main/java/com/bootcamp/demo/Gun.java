package com.bootcamp.demo;

import lombok.Getter;

@Getter
public class Gun {
  private int bullet;

  public Gun() {
    // ! requirement changed
    // this.bullet = 6;
    this.bullet = 7;
  }

  public void clearBullet() {
    this.bullet = 0;
  }

  public boolean shoot() {
    if (this.bullet > 0) {
      this.bullet--;
      return true;
    }
    return false;
  }

  public int getBullet() {
    return this.bullet;
  }
}
