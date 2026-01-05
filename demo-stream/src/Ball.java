public class Ball {
  // enum Color (RED, YELLOW, BLUE)
  // int num

  public static enum Color {
    RED, BLUE, YELLOW;
  }

  private Color color;
  private int num;

  public Ball(Color color, int num) {
    this.color = color;
    this.num = num;
  }

  public Color getColor() {
    return this.color;
  }

  public int getNum() {
    return this.num;
  }

  // toString
  @Override
  public String toString() {
    return "Ball(" //
        + "color=" + this.color //
        + ",num=" + this.num + ")";
  }

}
