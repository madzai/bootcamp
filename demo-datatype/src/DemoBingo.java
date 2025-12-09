import java.util.Random;
import java.util.Scanner;

public class DemoBingo {
  public static void main(String[] args) {
    // 1-100 (random number)
    // random: 73
    // One user
    // 0. Ask user to input a number between x and y
    // 1. compare user input (from scanner) to the random number
    // 1b. Out of the range, ask the question again, until input is valid
    // 2. if same -> end game.
    // 3. if not -> update the range for selection, e.g.
    // Round 1 user picks 69, range becomes 70-100
    // Round 2 user picks 90, range becomes 70-89
    // ...

    // Version 2: Support User A & B, show the winner
    // Ask user A to input a number between x and y
    // ...
    // User B wins

    Scanner scanner = new Scanner(System.in);
    int input = -1;
    int target = new Random().nextInt(99) + 1; // (0-99) + 1 -> (1-100)
    int min = 1;
    int max = 100;

    int numPlayers = 2;
    int player = 1;

    if (numPlayers == 1) {
      // Verion 1: 1 player
      while (input != target) {
        while (input < min || input > max) {
          System.out
              .println("Please input a number between " + min + " & " + max);
          input = scanner.nextInt();
        }

        if (target == input) {
          System.out.println("End game");
        } else {
          if (target > input) {
            min = input + 1;
          } else {
            max = input - 1;
          }
        }
      }
    } else if (numPlayers == 2) {
      // Verion 2: 2 players
      while (input != target) {
        while (input < min || input > max) {
          System.out.println("Player " + ((player > 0) ? "A" : "B")
              + ": input a number between " + min + " & " + max);
          input = scanner.nextInt();
        }

        if (target == input) {
          if (player == 1) {
            System.out.println("Player A wins");
          } else {
            System.out.println("Player B wins");
          }
        } else {
          if (target > input) {
            min = input + 1;
          } else if (target < input) {
            max = input - 1;
          }
          player *= -1;
        }
      }
    }
  }
}
