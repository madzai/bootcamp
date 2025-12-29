package exercises;

import java.util.Scanner;

public class ExceptionExercise3 {
  // Question: Create a custom exception called InvalidAgeException. Throw this exception if a user
  // enters an age less than 18.

  // 1. If NumberFormatException is caught, print "Error: Please enter a valid number."
  // 2. Pass the age number into a static method checkAge().
  // This method will throw a custom exception InvalidAgeException if the age < 18; otherwise, print
  // "Age X is accepted".
  // 3. For the method caller, handle the potential exception by printing "Age is invalid. Please
  // input again later."

  public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Please input an age for checking:");
    // String input = scanner.nextLine();
    // scanner.close();
    // code here for the caller...
    // try, catch
    try {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Please input an age for checking:");
      String input = scanner.nextLine();
      scanner.close();
      int age = Integer.parseInt(input);
      checkAge(age);
    } catch (InvalidAgeException e) {
      System.out.println(e.getMessage());
    }
  }

  // code here for the method
  public static class InvalidAgeException extends Exception {
    private String message;

    private InvalidAgeException() {
      this.message = "Ineligible age. Please input age >= 18";
    }

    public static InvalidAgeException of() {
      return new InvalidAgeException();
    }

    public String getMessage() {
      return this.message;
    }
  }

  public static void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
      throw InvalidAgeException.of();
    }
    System.out.println("Age " + age + " is accepted");
  }
}
