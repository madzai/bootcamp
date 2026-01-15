package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
  // private static final String URL = "jdbc:mysql://localhost:3306/bootcamp_db";
  private static final String URL = "jdbc:mysql://127.0.0.1:3306/bootcamp_db";
  private static final String USER = "root";
  private static final String PASSWORD = "1408!erkBF"; // 1408!erkBF

  public static Connection getConnection() throws SQLException {
    return DriverManager.getConnection(URL, USER, PASSWORD);
  }
}
