package com.bootcamp.demo;

import java.sql.*;

public class SelectStudents {
  public static void main(String[] args) {
    try (Connection conn = DBUtil.getConnection()) {
      String sql = "SELECT * FROM students";
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        System.out.println(rs.getInt("id") + ", " + //
            rs.getString("name") + ", " + //
            rs.getString("email"));
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
