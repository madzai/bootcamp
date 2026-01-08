package com.bootcamp.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// file name suffix = xxxTest.java or xxxTests.java
public class CalculatorTest {
  @Test // Test Annotation -> one test case
  void testSum() {
    Calculator c1 = new Calculator(11, 4);
    Assertions.assertEquals(15, c1.sum());
  }
}
