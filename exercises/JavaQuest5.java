package exercises;

public class JavaQuest5 {
  public static void main(String[] args) {
    /**
     * Expected output: The index of the last character of c is 11
     */

    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...

    // if (str.lastIndexOf("c") > -1) {
    // if (str.lastIndexOf("" + target) > -1) {
    if (str.lastIndexOf(target) > -1) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
  }
}
