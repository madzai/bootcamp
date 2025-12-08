package exercises;

public class JavaQuest3 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";

    // prints J
    // prints e (the 1st e)
    // code here ...
    System.out.println("index 15: " + str.charAt(15));
    System.out.println("index 1: " + str.charAt(1));
    System.out.println("index 1: " + str.charAt(str.indexOf("e")));

    // Use indexOf()
    // prints 3
    // prints 9
    // prints 10
    // code here ...
    System.out.println("Index of t: " + str.indexOf("t"));
    System.out.println("Index of x: " + str.indexOf("x"));
    System.out.println("Index of L: " + str.indexOf("L"));


    // Use String trim()
    String abc = "    ab c    ";
    // prints "ab c"
    System.out.println("Trim: " + abc.trim() + ".");

    // Use String replace() method
    // prints VenturenixLAB, Coding
    // code here ...
    System.out.println(str.replace("Java", "Coding"));

    // int length()
    // prints 19
    // code here ...
    System.out.println("String length of " + str + " is " + str.length());

    // Use String substring(int start, int end)
    // prints "ren"
    // code here ...
    System.out.println("Substring: " + str.substring(5, 8));

    // print "VENTURENIXLAB, JAVA"
    // prints "venturenixlab, java"
    // code here ...
    System.out.println("Uppercase: " + str.toUpperCase());
    System.out.println("Lowerercase: " + str.toLowerCase());


    // Method Chaining (one line to complete)
    // prints "V*NTUR*NIXLAB, JAVA!!!"
    // code here ...
    System.out.println(str.replace("e", "*") + "!!!");
  }
}
