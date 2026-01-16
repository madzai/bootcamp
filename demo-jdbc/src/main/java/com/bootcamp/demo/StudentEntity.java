package com.bootcamp.demo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class StudentEntity {
  private Integer id;
  private String name;
  private String email;
}
