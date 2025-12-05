public class DemoLoop {
  public static void main(String[] args) {
    // for (initialization; criteria to continue; modifier)
    int x = 3;
    // bad: for (int i = 1; i <= 4; i++)
    // i = 0 useful for index
    // start with i=0 unless i is useful (not a dummy a variable)
    // for (int i = 0; i < 4; i++), only adjust i < n
    for (int i = 0; i < 4; i++) {
      x *= 3;
    }
    System.out.println(x); // 3^5 = 243

    // Step 1: i = 0
    // Step 2: i < 4? Yes
    // Step 3: x *= 3

    // Step 4: i++, i -> 1
    // Step 5: i < 4? Yes
    // Step 6: x *= 3

    // Step 7: i++, i -> 2
    // Step 8: i < 4? Yes
    // Step 9: x *= 3

    // Step 10: i++, i -> 3
    // Step 11: i < 4? Yes
    // Step 12: x *= 3

    // Step 13: i++, i -> 4
    // Step 14: i < 4? No -> exit loop

    // print hello 50 times
    for (int i = 0; i < 50; i++) {
      System.out.println("Hello ");
    }

    // print even numbers in 0 - 100
    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      }
    }

    // 0 - 20: print odd numbers and number > 5
    for (int i = 0; i <= 20; i++) {
      // if (i % 2 > 0 && i > 5) { // slower as i > 5 has less cases than odd numbers in 0-20
      if (i > 5 && i % 2 > 0 ) {      
        System.out.println(i);
      }
    }

    // Leap year
    // Divided by 100, not a leap year, unless divided by 400
    // e.g. 2000 is a leap year and 2100 is not, 2004 is a leap year
    // Leap year if divisible by 100 and 400
    // or if not a multiple of 100, then divisible by 4 
    int year = 2000;
    boolean isLeapYear = false;
    // if (year % 100 == 0) {
    //   if (year % 400 == 0) {
    //     isLeapYear = true;
    //   }
    // } else if (year % 4 == 0) {
    //   isLeapYear = true;
    // }

    // if (year % 4 == 0) {
    //   if (year % 100 > 0) {
    //     isLeapYear = true;
    //   } else {
    //     if (year % 400 == 0) {
    //       isLeapYear = true;
    //     }
    //   }
    // } 

    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          isLeapYear = true; // 2000
        } 
      } else {
        isLeapYear = true; // 2004
      }
    }
    System.out.println("Leap year? " + isLeapYear);

    isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0); 

    System.out.println("Leap year? " + isLeapYear);

    // Sum up 1 - 100
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      sum += i;
    }
    System.out.println("1 + 2 + ... + 100 = " + sum);

    // the number of values divided by 6 between 1 - 100
    int count = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 6 == 0) {
        count++;
      }
    }
    System.out.println("Number of 6 multiples from 1 - 100: " + count);

    // System.out.println(i); // error: i is declared within for loop (independent code block)

    // convert 1 - 100 to char values, then concat them together
    String Hundred = "";
    for (int i = 1; i <= 100; i++) {
      Hundred += (char) i; // String + any type of value -> String
    }
    System.out.println("Characters from 1 - 100: " + Hundred);

    // ! break -> exit earlier
    // The first number between 1 - 50 which is divisible by 7
    int target = -1;
    for (int i = 1; i <= 50; i++) {
      if (i % 7 == 0) {
        target = i;
        break; // break the loop
      }
    }

    if (target == -1) {
      System.out.println("target not found");
    } else {
      System.out.println("The first number between 1 - 50 which is divisible by 7 is " + target);
    }

    // ！ continue -> skip the rest
    for (int i = 0; i < 20; i++) {
      if (i % 2 == 0) {
        System.out.println("Hello");
        continue; // goes to modifier (i++), the the rest in the same for loop
      }
      System.out.println("Goodbye");
      // 1000 lines ...
    }

    // Alt
    // for (int i = 0; i < 20; i++) {
    //   if (i % 2 == 0) {
    //     System.out.println("Hello");
    //   } else { 
    //     System.out.println("Hello");
    //     System.out.println("Goodbye");
    //   }
    // }
    
    // find the largest number < 1000, divided by 7
    int target1 = -1;
    // for (int i = 1; i < 1000; i++) {
    //   if ((1000 - i) % 7 == 0) {
    //     target1 = i;
    //     break;
    //   }
    // }

    for (int i = 0; i < 1000; i += 7) {
      if (i % 7 == 0) {
        target1 = i;
      }
    }

    System.out.println("The largest multiple of 7 less than 1000 is " + target1);

    int largestNumber = 0;
    while (true) {
      if (largestNumber + 7 >= 1000) {
        break;
      }
      largestNumber += 7;
    }
    System.out.println("The largest number is " + largestNumber);

    // Time string: add seconds
    String currentTime = "23:42:00";
    int secondsToAdd = 6500;

    int currentHour = (currentTime.charAt(0) - '0') * 10 + currentTime.charAt(1) - '0';
    int currentMinute = (currentTime.charAt(3) - '0') * 10 + currentTime.charAt(4) - '0';
    int currentSecond = (currentTime.charAt(6) - '0') * 10 + currentTime.charAt(7) - '0';
    
    int currentTimeInSeconds = currentHour * 3600 + currentMinute * 60 + currentSecond;
    int finalTimeInSeconds = currentTimeInSeconds + secondsToAdd;
    System.out.println("Final time in seconds: " + finalTimeInSeconds);
    int todayTimeInSeconds = finalTimeInSeconds % (24 * 60 * 60);
    System.out.println("Today's time in seconds: " + todayTimeInSeconds);
    
    int todayHour = todayTimeInSeconds / (60 * 60); // prefix 0
    int todayMinute = todayTimeInSeconds % (60 * 60) / 60; // prefix 0
    int todaySecond = todayTimeInSeconds % (60 * 60) % 60; // prefix 0

    String todayHourInString = todayHour < 10 ? "0" + todayHour : "" + todayHour;
    String todayMinuteInString = todayMinute < 10 ? "0" + todayMinute : "" + todayMinute;
    String todaySecondInString = todaySecond < 10 ? "0" + todaySecond : "" + todaySecond;

    String todayTime = todayHourInString + ":" + todayMinuteInString + ":" + todaySecondInString;
    System.out.println("Updated time: " + todayTime); // 01:30:20

    // Keep doubling a given number until > 10000
    int n = 9;
    target = n;
    while (target <= 10000) {
      target *= 2;
    }

    // while (true) {
    //   if (target > 10000) {
    //     break;
    //   } else {
    //     target *= 2;
    //   }
    // }

    System.out.println("Final number doubled until >10000 : " + target);

    String s10 = "HELLOXWORLD";
    // Find the index of 'X', return -1 if not found
    // i.e. use loop, not indexOf()
    int indexOfTarget = -1;
    for (int i = 0; i < s10.length(); i++) {
      if (s10.charAt(i) == 'X') {
        indexOfTarget = i;
        break;
      }
    }
    System.out.println("Index of X in " + s10 + ": " + indexOfTarget);

    // Prime numbers between 1 - 50
    System.out.println("Prime numbers from 1-50:");
    boolean isPrime = true;
    for (int i = 2; i <= 50; i++) {
      isPrime = true;
      for (int j = 2; j < i; j++) {
        if (i % j == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.print(i);
        System.out.print(" ");
      }
    }
    System.out.println();

    // Outter loop
    // for (int i = 0; i < 3; i++) {
    //   // Inner loop
    //   for (int j = 0; j < 3; j++) {
    //     System.out.println("i=" + i + ", " + "j=" + j);
    //   }
    // }

    // *
    // **
    // ***
    // ****
    int k = 4;
    String starString = "";
    for (int i = 1; i <= k; i++) {
      starString = "";
      for (int j = 0; j < i; j++) {
        starString += "*";
      }
      System.out.println(starString);
    }

    System.out.println();

    for (int i = 1; i <= k; i++) {      
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    // ..*..
    // .***.
    // *****

  }
}
