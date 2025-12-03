public class DemoIf {
  public static void main(String[] args) {
    int x = 10;
    if (x % 2 == 1) {
      System.out.println("x is odd.");
    } else {
      System.out.println("x is even.");
    }

    if (x > 0) {
      System.out.println("Positive number");
    } 

    if (x < 0) {
      System.out.println("Negative number");
    }

    // if x > 3 and even, money + 10
    // otherwise, money + 5
    int money = 10;
    if (money > 3 && x % 2 == 0) {
      money += 10;
    } else {
      money += 5;
    }
    System.out.println("money = " + money);

    // Example
    // char gender = 'M';
    boolean isFemale = false;
    boolean isSmoker = true;
    int age = 66;

    // Premium base $100
    // if female, above 40, 20% more premium
    // if male, smoker, 50% more premium
    // if female, smoker, 5% more premium
    // if age >= 70, 40% more premium

    // Test cases
    // ! Male age 69, smoker -> 50%
    // ! Male age 69, non-smoker -> 0%
    // ! Male age 70, smoker -> 90%
    // ! Male age 70, non-smoker -> 40%
    // ! Female age 39, smoker -> 5%
    // ! Female age 45, smoker -> 25%
    // ! Female age 75, smoker -> 65%
    // ! Female age 39, non-smoker -> 0%
    // ! Female age 45, non-smoker -> 20%
    // ! Female age 75, non-smoker -> 60%

    double basePremium = 100;
    int percentage = 0;

    if (age >= 40) {      
      if (isFemale) {
        percentage += 20;
      }

      if (age >= 70) {
        percentage += 40;
      }
    } 
    
    if (isSmoker) {
      if (isFemale) {
        percentage += 5;
      } else {
        percentage += 50;
      }
    }

    double premium = basePremium * (1 + percentage / 100.0);
    System.out.println("premium = " + premium);

    // else if

    // divisible by 3 -> money + 3
    // divisible by 4 -> money + 4
    // divisible by 5 -> money + 5
    money = 100;
    int u = 135;
    if (u % 3 == 0) {
      money += 3;
    } 
    if (u % 4 == 0) {
      money += 4;
    }
    if (u % 5 == 0) {
      money += 5;
    }
    System.out.println("money = " + money);

    // Example 2
    int score = 75;
    char grade = ' ';

    // >= 90 -> Grade A
    // >= 80 and < 90 -> Grade B
    // >= 70 and < 80 -> Grade C
    // Otherwise Grade F

    // if (score < 70) {
    //   grade = 'F';
    // } else if (score < 80) {
    //   grade = 'C';
    // } else if (score < 90) {
    //   grade = 'B';
    // } else {
    //   grade = 'A';
    // }

    if (score >= 90) {
      grade = 'A';
    } else if (score >= 80) {
      grade = 'B';
    } else if (score >= 70) {
      grade = 'C';
    } else {
      grade = 'F';
    }

    // same speed, but lower readability & less flexible for changes
    // grade = 'F';
    // if (score >= 90) {
    //   grade = 'A';
    // } else if (score >= 80) {
    //   grade = 'B';
    // } else if (score >= 70) {
    //   grade = 'C';
    // } 


    System.out.println("Grade: " + grade);

    // String method
    String name = "John";
    // Safer than name.equals("John"): in case name is NULL?
    if ("John".equals(name)) {
      System.out.println("String check: Is John");
    } else {
      System.out.println("String check: Not John");
    }

    // charAt
    if (name.charAt(0) == 'J' && name.charAt(1) == 'o' && name
        .charAt(2) == 'h' && name.charAt(3) == 'n') {
      System.out.println("Letter check: Is John");
    } else {
      System.out.println("Letter check: Not John");
    }

    // Starts with
    if (name.startsWith("J")) {
      System.out.println("Name starts with J");
    } else {
      System.out.println("Name does not start with J");
    }

    // contains
    if (name.contains("John")) {
      System.out.println("Name contains John");
    } else {
      System.out.println("Name doesn't contain John");
    }

    // length
    if (name.length() >= 3) {
      System.out.println("Name is too long");
    }


    //  2. switch
    // Grade A -> 100
    // Grade B -> 50
    // Grade C -> 20
    // Otherwise -> 0
    money = 0;
    grade = 'B';
    switch(grade) {
      case 'A':
        money += 100;
        break;
      case 'B':
        money += 50;
        break;
      case 'C':
        money += 20;
        break;
      default: // else
    }
    // money will be 70 without break; for each case
    System.out.println("Money: " + money);

    String footballer = "Trump";
    int jerseyNumber = 0;
    switch(footballer) {
      case "Henry":
        jerseyNumber = 14;
        break;
      case "Ronaldo":
        jerseyNumber = 9;
        break;
      case "Zidane":
        jerseyNumber = 10;
        break;
      case "Casillas":
        jerseyNumber = 1;
        break;
      case "Lampard":
        jerseyNumber = 8;
        break;
      default:
        jerseyNumber = 99;
    }
    System.out.println(footballer + " " + jerseyNumber);

    int pow = 3;
    int base = 2;
    switch(pow - 1) {
      case 3:
        base *= 2;
      case 2:
        base *= 2;
      case 1:
        base *= 2;
      default:
        break;
    }
    System.out.println(base);

  }
}
