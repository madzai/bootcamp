package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class StudentTest {
  @Mock
  private Calculator calculator;

  @Test
  void testOperate() {
    Mockito.when(this.calculator.sum()).thenReturn(100);

    Student s1 = new Student(this.calculator);
    Assertions.assertEquals(150, s1.operate(8, 10));
  }

}
