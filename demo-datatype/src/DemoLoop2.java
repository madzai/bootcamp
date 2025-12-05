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
    double principal = 1000.0;
    double interest = 0.03;
    double finalAmount = principal;
    for (int i = 0; i < 3; i++) {
      finalAmount *= (1 + interest);
    }
    System.out.println("Amount after 3 years of interest accrual: " + finalAmount);

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
    int n = 11;
    for (int i = 1; i <= n; i++) {
      result += i; // String + int -> String
      if (i < n) { 
        result += "/";
      }
    }
    System.out.println("Result: " + result);

    // "llello", count the no. of l
    String word = "llello";
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
    int countCapital = 0;

    // String word2Capital = word2.toUpperCase();  
    // for (int i = 0; i < word2.length(); i++) {
    //   if (word2.charAt(i) == word2Capital.charAt(i)) {
    //     countCapital++;
    //   }
    // }
    for (int i = 0; i < word2.length(); i++) {
      // ! compare char value (<, >, >=, <=) -> compare int
      if (word2.charAt(i) >= 'A' && word2.charAt(i) <= 'Z') { 
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
    String letterString = "";
    int countVowel = 0;
    String vowels = "aeiou";
    for (int i = 0; i < word3.length(); i++) {
      letterString = "";
      letterString += word3.charAt(i);
      if (vowels.contains(letterString)) {
        countVowel++;
      }

      // if (word3.charAt(i) == 'a' || word3.charAt(i) == 'e'
      //     || word3.charAt(i) == 'i' || word3.charAt(i) == 'o'
      //     || word3.charAt(i) == 'u') {
      //   countVowel++;
      // }
    }
    System.out.println("No. of vowels in " + word3 + ": " + countVowel);

    // given a string "hello", print "hello", "hell", "hel", "he", "h"
    String word4 = "hello";
    // for (int i = word4.length(); i > 0; i--) {
    //   System.out.println(word4.substring(0, i));
    // }

    for (int i = 0; i < word4.length(); i++) {
      System.out.println(word4.substring(0, word4.length() - i));
    }

    // Given Password = "abcd@1234XYZ"
    // Check fi the password is valid
    // 1. Length >= 12
    // 2. with at least one capital letter
    // 3. with at least one special character @#$!

    String password = "abcd@1234XYZ";
    String SpecChar = "@#$!";
    String letterString2 = "";
    boolean pwHasSpecChar = false;
    boolean pwHasCapital = false;
    boolean pwValid = false;
    if (password.length() >= 12) {
      for (int i = 0; i < password.length(); i++) {
        if ((int) password.charAt(i) >= 65 && (int) password.charAt(i) <= 90) {
          pwHasCapital = true;
        }

        // if (password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '!') {
        //   pwHasSpecChar = true;
        // }

        letterString2 = "";
        letterString2 += password.charAt(i);
        if (SpecChar.contains(letterString2)) {
          pwHasSpecChar = true;
        }
      }
    }

    if (pwHasCapital && pwHasSpecChar) {
      pwValid = true;
    }
    System.out.println("Valid password: " + pwValid);
    System.out.println(password + " is a valid password: " + (pwHasCapital && pwHasSpecChar));

    // model answer
    boolean isLengthValid = password.length() >= 12;
    boolean withCapitalLetter = false;
    boolean withSpecialChar = false;
    for (int i = 0; i < password.length(); i++) {
      if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
        withCapitalLetter = true;
        // break;
      }
      if (password.charAt(i) == '@' || password.charAt(i) == '#'
          || password.charAt(i) == '$' || password.charAt(i) == '!') {
        withSpecialChar = true;
        // break;
      }
      if (withCapitalLetter && withSpecialChar) {
        break;
      }    
    }
    boolean isPasswordValid = isLengthValid && withCapitalLetter && withSpecialChar;
    System.out.println("Password valid: " + isPasswordValid);


    // Given a string "abc5uk20fs", move all numbers to another string
    // s1 = "abc5uk20fs" -> s2 = 520
    String s1 = "abc5uk20fs19";
    String s2 = "";
    for (int i = 0; i < s1.length(); i++) {
      // if ( (int) s1.charAt(i) >= 48 && (int) s1.charAt(i) < 58) {
      if (s1.charAt(i) >= '0' && s1.charAt(i) <= '9') {
        s2 += s1.charAt(i);
      }
    }
    System.out.println(s1 + " has number string " + s2);

    // Encrypt password with algorithm: ASCII + 3
    // e.g. "abcd" -> "defg"
    System.out.println('a' + 3); // char + int -> int

    String pw1 = "abcd";
    String pw2 = "";

    // int charNum = -1;
    // for (int i = 0; i < pw1.length(); i++) {
    //   charNum = (int) pw1.charAt(i);
    //   pw2 += (char) (charNum + 3);
    // }

    for (int i = 0; i < pw1.length(); i++) {
      // OK if not ASCII number overflow
      pw2 += (char) (pw1.charAt(i) + 3);
    }
    System.out.println(pw1 + " -- encyrption --> " + pw2);
  }
}
