public class String1 {
  private char[] chs;

  // public String1(char[] chs) {
  // this.chs = chs;
  // }

  public String1(String s) {
    this.chs = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      this.chs[i] = s.charAt(i);
    }
  }

  public char charAt(int idx) {
    return this.chs[idx];
  }

  public boolean contains(char c) {
    for (char ch : this.chs) {
      if (ch == c)
        return true;
    }
    return false;
  }

  // public char[] getChs() {
  // return this.chs;
  // }

  public String getChs() {
    String s = "";
    for (char ch : this.chs) {
      s += ch;
    }
    return s;
  }

  public static void main(String[] args) {
    String1 s = new String1("hello");
    char c = s.charAt(0); // h
    boolean result = s.contains('e'); // true

    System.out.println("String1 s: " + s.getChs());
    System.out.println("First char: " + c);
    System.out.println("Contains e? " + result);
  }
}
