public class Ball {
  private Color color;

  // ! private Constructor
  private Ball(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  // if parameter is String, we usually use static method to control
  public static Ball ofRed() {
    return new Ball(Color.RED);
  }
}
