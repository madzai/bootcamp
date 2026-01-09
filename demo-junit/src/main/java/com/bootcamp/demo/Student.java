package com.bootcamp.demo;

public class Student {
  private Calculator calculator;

  public Student(Calculator calculator) {
    this.calculator = calculator;
  }

  public int operate(int x, int y) {
    this.calculator.setX(x);
    this.calculator.setY(y);
    return this.calculator.sum() + 50; // 100
  }
}
