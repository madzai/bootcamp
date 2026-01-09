package com.bootcamp.demo;

public class Calculator {
  private int x;
  private int y;

  public void setX(int x) {
    this.x = x;
  }

  public void setY(int y) {
    this.y = y;
  }

  public int sum() {
    return this.x + this.y;
  }
}
