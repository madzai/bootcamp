package com.bootcamp.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.sql.*;

public class DatabaseManager {
  private String url;
  private String username;
  private String password;
  private Connection connection;

  // Table Students
  public DatabaseManager(String url, String username, String password)
      throws Exception {
    if (url == null || username == null || password == null)
      throw new RuntimeException();
    this.connection = DriverManager.getConnection(url, username, password);
  }

  public boolean insert(StudentEntity student) {
    if (student == null)
      return false;
    try {
      String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
      PreparedStatement stmt = this.connection.prepareStatement(sql);
      stmt.setString(1, student.getName()); // 1st ?
      stmt.setString(2, student.getEmail()); // 2nd ?
      int rows = stmt.executeUpdate();
      System.out.println("Inserted: " + rows);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean deleteByName(String studentName) {
    if (studentName == null)
      return false;
    try {
      String sql = "DELETE FROM students WHERE name = ?";
      PreparedStatement stmt = this.connection.prepareStatement(sql);
      stmt.setString(1, studentName);
      int rows = stmt.executeUpdate();
      System.out.println("Deleted: " + rows);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public boolean updateEmailByName(String newEmail, String studentName) {
    if (newEmail == null || studentName == null)
      return false;
    try {
      String sql = "UPDATE students SET email = ? WHERE name = ?";
      PreparedStatement stmt = this.connection.prepareStatement(sql);
      stmt.setString(1, newEmail);
      stmt.setString(2, studentName);
      int rows = stmt.executeUpdate();
      System.out.println("Updated: " + rows);
      return true;
    } catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }

  public List<StudentEntity> getStudents() {
    List<StudentEntity> students = new LinkedList<>();
    try {
      String sql = "SELECT * FROM students";
      Statement stmt = this.connection.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        StudentEntity student = new StudentEntity.builder() //
            .id(rs.getInt("id")) //
            .name(rs.getString("name")) //
            .email(rs.getString("email")) //
            .build();
        students.add(student);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/bootcamp_2512";
    String username = "root";
    String password = "admin1234";
    DatabaseManager databaseManager =
        new DatabaseManager(url, username, password);
    DatabaseManager.insert(new StudentEntity("John", "j@gmail.com"));

  }


}


