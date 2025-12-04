public class DemoString {
  public static void main(String[] args) {
    // "hello" -> String value
    // s -> String variable
    String s = "hello";

    // 'hello' -> not Java
    // 'h' can't assign char value into String variable
    // String s2 = 'hello'; // error
    // String s2 = 'h'; // error

    // + operator
    String s2 = "world";
    String s3 = s + " " + s2; // concatenation
    System.out.println(s3); // hello world

    // String but not string?
    // String is a class, not a primitive datatype
    System.out.println("Length of s is " + s.length()); // method of String class

    s = "goodbye";
    System.out.println("String variable s, " + s + " has length " + s.length()); // hello world

    // 2. charAt(), index starts with 0
    char firstChar = s.charAt(0); // 'h'
    System.out.println("First Char is " + firstChar);
    // last char?
    char lastChar = s.charAt(s.length() - 1); // 'o'
    System.out.println("Last Char is " + lastChar);


    // 3. equals(), case-sensitive
    boolean isGoodbye = s.equals("goodbye"); // true
    System.out.println("s equals to goodbye? " + isGoodbye);
    boolean isCapitalGoodbye = s.equals("Goodbye"); // true
    System.out.println("s equals to Goodbye? " + isCapitalGoodbye);

    System.out.println("s equals to Goodbye (igonoring case)? " + s.equalsIgnoreCase("Goodbye"));

    // 4. contains
    System.out.println("contains oo: " + s.contains("oo")); // true
    System.out.println("contains ooo: " + s.contains("ooo")); // false
    System.out.println("contains o: " + s.contains("o")); // true
    
    // 5. isEmpty
    // Empty string is a String value ("")
    String emptyString = "";
    System.out.println("Is emptyString empty? " + emptyString.isEmpty()); // true
    System.out.println("Is s empty? " + s.isEmpty()); // false

    // 6. isBlank()
    System.out.println("Is s blank? " + s.isBlank()); // false
    System.out.println("Is emptyString blank? " + emptyString.isBlank()); // false

    String spaceString = "  ";
    System.out.println("Is spaceString blank? " + spaceString.isBlank());
    System.out.println("Is spaceString empty? " + spaceString.isEmpty());

    // 7. replace
    // s is unchanged, only create a new String value
    String newString = s.replace("oo", "xx");
    System.out.println(newString);
    // replace char instead of string
    System.out.println(s.replace('g', 'v'));

    // 8. startsWith() -> check prefix
    System.out.println(s.startsWith("go")); // true
    System.out.println(s.startsWith("o")); // false

    // 9. endsWith() -> check suffix
    System.out.println(s.endsWith("bye")); // true
    System.out.println(s.endsWith("aye")); // false

    // 10. indexOf()
    System.out.println("index of d in s: " + s.indexOf('d'));
    System.out.println("index of the first o in s: " + s.indexOf('o'));
    System.out.println("index of x in s: " + s.indexOf('x')); // -1, not found

    System.out.println("index of ood in s: " + s.indexOf("ood"));
    System.out.println("index of ooo in s: " + s.indexOf("ooo"));

    System.out.println("index of the last o in s: " + s.lastIndexOf('o'));

    // 11. concat() -> + Operation
    System.out.println(s.concat("!!!"));

    // 12. substring()
    System.out.println(s.substring(3)); // dbye
    System.out.println(s.substring(2, 5)); // odb, 3rd to 5th (5-1 = 4) char

    // 13. toLowerCase() and toUpperCase()
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
    System.out.println("BootCAMP".toLowerCase()); // bootcamp

    // 14. trim() -> remove leading and trailing spaces
    System.out.println(" Java Python.  ".trim()); // "Java Python."

    // ! Chain Method
    System.out.println(" Java Python.  ".length());
    System.out.println(" Java Python.  ".trim().length());
  }
}
