package exercises;

import java.util.Scanner;

public class ExceptionExercise4 {
  // Follow the instructions below to complete the User Registration Process.
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter username: ");
    String username = scanner.nextLine();

    System.out.print("Enter password: ");
    String password = scanner.nextLine();

    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    scanner.close();

    // code here ...
    // call method registerUser(), handle the exception to print "User Registeration is Fail."
    // or "User Registeration is Success."

    // try, catch
  }

  public static class UserRegistrationException extends RuntimeException {
    // code here ...
  }

  // Call validateUsername(), validatePassword() and validateEmail()
  // if anyone of the above throw exception, this method registerUser() should throw custom
  // exception UserRegistrationException.
  // otherwise, print "User registered successfully: jackywong", where jackywong is the username.
  public static void registerUser(String username, String password,
      String email) {
    // code here ...

    System.out.println("User registered successfully: " + username);
  }

  // Throw IllegalArgumentException if String username is null or empty string
  private static void validateUsername(String username) {
    // code here ...
    if (username == "" || username == null) {
      throw new IllegalArgumentException("username cannot be empty.");
    }
  }

  // Throw IllegalArgumentException
  // if password is null or password length < 8 or it does not contain
  // any special characters of !@$&_
  private static void validatePassword(String password) {
    // code here ...
    if (password == null || password.length() < 8)
      throw new IllegalArgumentException("password must be of length >= 8");
    if (!(password.indexOf('!') != -1 || password.indexOf('@') != -1 //
        || password.indexOf('$') != -1 || password.indexOf('&') != -1 //
        || password.indexOf('_') != -1))
      throw new IllegalArgumentException(
          "password must contain at least one special character of ! @ $ & _");
  }

  // Throw IllegalArgumentException if String email is null or it does not contain character @
  private static void validateEmail(String email) {
    // code here ...
    if (email.indexOf('@') == -1)
      throw new IllegalArgumentException("Invalid email address");
  }
}
