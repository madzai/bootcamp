package com.bootcamp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import lombok.Getter;



@Getter
public class DBManager {
  private String url;
  private String userName;
  private String password;
  private Connection connection;

  // Table Students
  public DBManager(String url, String userName, String password)
      throws Exception {
    if (url == null || userName == null || password == null)
      throw new RuntimeException();
    this.connection = DriverManager.getConnection(url, userName, password);
  }

  public boolean insert(StudentEntity student) {
    if (student == null)
      return false;
    try {
      String sql = "INSERT INTO students (name, email) VALUES (?, ?)";
      PreparedStatement stmt = this.connection.prepareStatement(sql);
      stmt.setString(1, student.getName()); // the first ?
      stmt.setString(2, student.getEmail()); // the second ?
      int rows = stmt.executeUpdate();
      System.out.println("Inserted: " + rows);
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

  public List<StudentEntity> getStudents() {
    List<StudentEntity> students = new LinkedList<>();
    try {
      String sql = "SELECT * FROM students";
      Statement stmt = this.connection.createStatement();
      ResultSet rs = stmt.executeQuery(sql);
      while (rs.next()) {
        StudentEntity student = StudentEntity.builder() //
            .id(rs.getInt("id")) //
            .name(rs.getString("name")) //
            .email(rs.getString("email")) //
            .build();
        students.add(student);
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    return students;
  }

  public static void main(String[] args) throws Exception {
    String url = "jdbc:mysql://localhost:3306/bootcamp_2512";
    String userName = "root";
    String password = "admin1234";
    DBManager dbManager = new DBManager(url, userName, password);
    // dbManager.insert(new StudentEntity(null, "John", "john@gmail.com"));
    // dbManager.insert(new StudentEntity(null, "Peter", "peter@gmail.com"));

    // ! Before Delete and Update
    System.out.println(dbManager.getStudents());

    // dbManager.updateEmailByName("john123@hotmail.com", "John");
    dbManager.deleteByName("Peter");

    // ! After Delete and Update
    System.out.println(dbManager.getStudents());
  }
}
