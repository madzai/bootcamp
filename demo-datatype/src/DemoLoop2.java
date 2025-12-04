public class DemoLoop2 {
  public static void main(String[] args) {
    // print 3 hello
    for (int i = 0; i < 3; i++) {
      System.out.println("hello");
    }

    // 1-10
    for (int i = 0; i < 10; i++) {
      System.out.println(i + 1);
    }

    // name = "Mary", print every char of the name
    String name = "Mary";
    for (int i = 0; i < name.length(); i++) {
      System.out.println(name.charAt(i));
    }

    // principal = 1000.0, interest 3% per year, calculate the total amount after 3 years
    double principal = 1000;
    double interest = 0.03;
    for (int i = 1; i <= 3; i++) {
      principal *= (1 + interest);
    }
    System.out.println("Amount after 3 years of interest accrual: " + principal);

    // sum up all odd numbers and sum up all even numbers separately for 1 - 20, then find the product of them
    int sumOdd = 0;
    int sumEven = 0;
    for (int i = 1; i <= 20; i++) {
      if (i % 2 == 1) {
        sumOdd += i;
      } else {
        sumEven += i;
      }
    }
    System.out.println("Product of sum of odd & sum of even = " + sumOdd + " x " + sumEven + " = " + sumOdd * sumEven);

    // print "1/2/3/4/5"
    String result = "";
    for (int i = 1; i <= 5; i++) {
      result += i;
      if (i < 5) {
        result += "/";
      }
    }
    System.out.println("Result: " + result);

    // "llello", count the no. of l
    String word = "lello";
    char letterMatch = 'l';
    int countOfLetters = 0;
    for (int i = 0; i < word.length(); i++) {
      if (word.charAt(i) == letterMatch) {
        countOfLetters += 1;
      }
    }
    System.out.println("Count of " + letterMatch + " in " + word + ": " + countOfLetters);

    // "HeLLo", count the number of capital letters (uppercase letters)
    String word2 = "HeLLo";
    String word2Capital = word2.toUpperCase();
    int countCapital = 0;
    for (int i = 0; i < word2.length(); i++) {
      if (word2.charAt(i) == word2Capital.charAt(i)) {
        countCapital++;
      }
    }
    System.out.println("Count of capital letters in " + word2 + ": " + countCapital);

    // print 1 4 9 16 25 ... 100
    String numSeq = "";
    for (int i = 1; i <= 10; i++) {
      numSeq += i * i;
      numSeq += " ";
    }
    System.out.println("Sequence of square numbers: " + numSeq.trim() + ".");

    // given a string "apple", count of the no. of vowel characters (a, e, i, o, u)
    String word3 = "apple";
    int countVowel = 0;
    for (int i = 0; i < word3.length(); i++) {
      if (word3.charAt(i) == 'a' || word3.charAt(i) == 'e' || word3.charAt(i) == 'i' || word3.charAt(i) == 'o' || word3.charAt(i) == 'u') {
        countVowel++;
      }
    }
    System.out.println("No. of vowels in " + word3 + ": " + countVowel);

    // given a string "hello", print "hello", "hell", "hel", "he", "h"
    String word4 = "hello";
    for (int i = word4.length(); i > 0; i--) {
      System.out.println(word4.substring(0, i));
    }

  }
}
