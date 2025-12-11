public class String1 {
  private char[] chs;

  public String1(String s) {
    // this.chs = new char[s.length()];
    // for (int i = 0; i < s.length(); i++) {
    // this.chs[i] = s.charAt(i);

    if (s == null)
      this.chs = new char[0];
    else
      this.chs = s.toCharArray();
  }

  public String1(char[] chs) {
    this.chs = chs;
  }

  // ! System.out.println() -> toString()
  public String toString() {
    return new String(this.chs);
  }

  public boolean contains(char c) {
    // also OK if without this.
    // for (char ch : this.chs) {
    for (char ch : chs) {
      if (ch == c)
        return true;
    }
    return false;
  }

  public String1 replace(char from, char to) {
    // String1 chs2 = this.chs;
    // for (char ch : chs2) {
    // if (ch == from)
    // ch = to;
    // }
    // return chs2;

    char[] newChs = new char[this.chs.length];
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] != from)
        newChs[i] = this.chs[i];
      else
        newChs[i] = to;
    }
    return new String1(newChs); // by the constructor that recieves char[]
  }

  // Quick: no for loop
  public char charAt(int idx) {
    return this.chs[idx];
  }

  // Quick: no for loop
  public int length() {
    return this.chs.length;
  }

  // Quick: no for loop
  public boolean isEmpty() {
    return this.length() == 0;
  }

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


    String1 s2 = new String1("");
    System.out.println(s2.length()); // 0
    System.out.println(s2.isEmpty()); // true
    // System.out.println(s2.charAt(0)); // ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0

    // String s3 = new String1(null);
    // System.out.println(s3.length()); // 0
    // System.out.println(s3.isEmpty()); // true

    String1 s4 = new String1("goodbye");
    String1 s5 = s4.replace('o', 'x');
    // System.out.println gives toString() by default
    System.out.println("String1 s4: " + s4); // goodbye
    System.out.println("String1 s5: " + s5); // gxxdbye


  }
}
