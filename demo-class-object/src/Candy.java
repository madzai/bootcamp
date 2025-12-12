public class Candy {
  private int id;
  private String color; // "RED", "YELLOW", "BLUE"

  // ! Private constructor
  private Candy(String color) {
    this.color = color;
  }

  public static Candy ofRed() {
    return new Candy("RED");
  }

  public static Candy ofBlue() {
    return new Candy("BLUE");
  }

  public static Candy ofYellow() {
    return new Candy("YELLOW");
  }

}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// public class Candy {
// private int id;
// private String color; // "RED", "YELLOW", "BLUE"

// public Candy(int id, String color) {
// this.id = id;
// this.color = color;
// }

// public int getId() {
// return this.id;
// }

// public String getColor() {
// return this.color;
// }

// public String toString() {
// return "Candy(" //
// + "id=" + this.id //
// + ", color=" + this.color //
// + ")";
// }
// }
