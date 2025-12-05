import java.util.Arrays;

public class DemoArray3 {
  public static void main(String[] args) {
    // 10, 25, 3, 48, 57
    // print all members
    int[] numbers = new int[] {10, 25, 3, 48, 57};
    System.out.println(Arrays.toString(numbers));

    // scores 23, 44, 67, 88, 91, 12
    // loop -> print all even numbers
    int[] scores = new int[] {23, 44, 67, 88, 91, 12};
    System.out.println("Even numbers:");
    for (int i = 0; i < scores.length; i++) {
      if (scores[i] % 2 == 0) {
        System.out.println(scores[i]);
      }
    }

    // Find the median: 34, 78, 12, 89, 45, 99, 23
    // Sorted: 12 23 34 45 78 89 99
    scores = new int[] {34, 78, 12, 89, 45, 99, 23, 11};

    // Bubble sorting
    int backup = -1;
    for (int i = 0; i < scores.length - 1; i++) {
      for (int j = 0; j < scores.length - i - 1; j++) {
        if (scores[j] > scores[j + 1]) {
          backup = scores[j];
          scores[j] = scores[j + 1];
          scores[j + 1] = backup;
        }
      }
    }
    System.out.print("Bubble-sorted: ");
    System.out.println(Arrays.toString(scores));

    int medianIndex = -1;
    double median = -1.0;
    if (scores.length % 2 == 1) {
      medianIndex = scores.length / 2;
      median = scores[medianIndex];
    } else {
      medianIndex = scores.length / 2 - 1;
      median = (scores[medianIndex] + scores[medianIndex + 1]) / 2.0;
    }
    System.out.println("Median: " + median);

    // Prices 99.9, 13.8, 9.9, 1200.0
    // Quantities 3, 10, 12, 20
    // Amount = Price * Quantity
    double[] prices = new double[] {99.9, 13.8, 9.9, 1200.0};
    double[] quantities = new double[] {3, 10, 12, 20};
    double[] amounts = new double[4];

    for (int i = 0; i < prices.length; i++) {
      amounts[i] = prices[i] * quantities[i];
    }

    System.out.println("Amounts: " + Arrays.toString(amounts));

    // Login
    String[] usernames = new String[] {"johnwong", "stevenchan", "jennyng"};
    String[] passwords = new String[] {"abcd1234", "ijk789", "xyz456"};

    String usernameInput = "stevenchan";
    String passwordInput = "ijk789";

    // 1. username is NOT Found.
    // 2. Password is wrong for this user.
    // 3. Login successful.

    // boolean usernameOk = false;
    // boolean passwordOk = false;

    // for (int i = 0; i < usernames.length; i++) {
    // if (usernameOk && passwordOk) {
    // break;
    // }
    // if (usernameInput == usernames[i]) {
    // usernameOk = true;
    // }
    // if (passwordInput == passwords[i]) {
    // passwordOk = true;
    // }
    // }

    // if (usernameOk && passwordOk) {
    // System.out.println("Login successful.");
    // } else if (usernameOk) {
    // System.out.println("Password is wrong for this user.");
    // } else {
    // System.out.println("Username does not exist.");
    // }


    boolean usernameCorrect = false;
    boolean pwCorrect = false;

    for (int i = 0; i < usernames.length; i++) {
      if (usernameInput == usernames[i]) {
        usernameCorrect = true;
        if (passwordInput == passwords[i]) {
          pwCorrect = true;
        }
      }
    }

    if (!usernameCorrect) {
      System.out.println("Username does not exist.");
    } else {
      if (pwCorrect) {
        System.out.println("Login successful.");
      } else {
        System.out.println("Password is wrong for this user.");
      }
    }

    // ages 16, 66, 18, 37
    // genders 'M', 'F', 'M', 'F'
    // smokers false, true, true, false

    // baseFee = 100
    // 1. Smokers -> +20% fee
    // 2. age > 60 -> +30% fee
    // 3. genders female -> +5% fee
    // calculate fees

    int[] ages = new int[] {16, 66, 18, 37};
    char[] genders = new char[] {'M', 'F', 'M', 'F'};
    boolean[] smokers = new boolean[] {false, true, true, false};
    int baseFee = 100;
    double[] fees = new double[] {baseFee, baseFee, baseFee, baseFee};

    for (int i = 0; i < ages.length; i++) {
      if (smokers[i]) {
        fees[i] += baseFee * 0.2;
      }
      if (ages[i] > 60) {
        fees[i] += baseFee * 0.3;
      }
      if (genders[i] == 'F') {
        fees[i] += baseFee * 0.05;
      }
    }
    System.out.println("Fees: " + Arrays.toString(fees));
  }
}
