package exercises;

public class JavaQuest2 {
  public static void main(String[] args) {
    // add condition to print "a is between 0 and 8"
    // how about a > 9?
    int a = 10;
    if (a == 9) {
      System.out.println("a is equals to 9");
    }

    // Take a character and check whether it is:
    // 1. Vowel (a, e, i, o, u – both lowercase and uppercase)
    // 2. Consonant
    // 3. Not an alphabet
    char ch = 'i';
    if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
          || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
        System.out.println("Vowel");
      } else {
        System.out.println("Consonant");
      }
    } else {
      System.out.println("Not an alphabet");
    }

    // Take salary and years of experience, then calculate bonus
    // Experience ≥ 10 years → 20% bonus
    // 5–9 years → 10% bonus
    // < 5 years → 5% bonus
    // Also, if salary > 100000, reduce bonus by half
    int exp = 12;
    int salary = 110_000;
    int bonusPercent = 0;

    if (exp >= 10) {
      bonusPercent += 20;
    } else if (exp >= 5 && exp <= 9) {
      bonusPercent += 10;
    } else {
      bonusPercent += 5;
    }

    if (salary > 100_000) {
      bonusPercent *= 0.5;
    }

    double bonus = salary * bonusPercent / 100.0;
    System.out.println("Bonus: " + bonus);

  }
}
