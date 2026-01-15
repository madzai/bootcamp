package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteStudent {
  public static void main(String[] args) {
    try (Connection conn = DBUtil.getConnection()) {
      String sql = "DELETE FROM students WHERE name = ?";
      PreparedStatement stmt = conn.prepareStatement(sql);
      stmt.setString(1, "Alice");
      int rows = stmt.executeUpdate();
      System.out.println("Deleted: " + rows);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
