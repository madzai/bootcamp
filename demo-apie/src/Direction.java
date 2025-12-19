// JVM -> Class Loader -> create enum -> main()
public enum Direction { // class
  EAST('E', -1), SOUTH('S', -2), WEST('W', 1), NORTH('N', 2); // calling constructor
  // static variables carry static values

  private char value; // E, S, W, N
  private int number; // ! Attribute can be used for presentation relationship

  // ! enum constructor -> private
  // ! JVM calls this constructor 4 times
  private Direction(char value, int number) {
    this.value = value;
    this.number = number;
  }

  public boolean isOpposite(Direction direction) {
    return this.number * -1 == direction.getNumber();
  }

  // this
  public Direction opposite() {
    // values
    // for (Direction d : Direction.values()) {
    for (Direction d : values()) { // implicit static method
      // if (this.isOpposite(d))
      if (this.number * -1 == d.getNumber())
        return d;
    }
    return null; // not found (Exceptional, Optional)
  }

  public char getValue() {
    return this.value;
  }

  public int getNumber() {
    return this.number;
  }

  public static void main(String[] args) {
    System.out.println("NORTH -> " + Direction.NORTH); // "NORTH"
    System.out.println("NORTH.getValue() -> " + Direction.NORTH.getValue()); // 'N'
    System.out.println("North == North? " //
        + (Direction.NORTH == Direction.NORTH)); // true (enum: only one NORTH object in memory)

    System.out.println();
    System.out.println("East opposite to West? " //
        + Direction.EAST.isOpposite(Direction.WEST)); // true
    System.out.println("East opposite to North? " //
        + Direction.EAST.isOpposite(Direction.NORTH)); // false
    System.out.println("South opposite to North? " //
        + Direction.SOUTH.isOpposite(Direction.NORTH)); // true

    System.out.println("South's opposite: " //
        + Direction.SOUTH.opposite()); // NORTH

    for (int i = 0; i < Direction.values().length; i++)
      System.out.println(Direction.values()[i]);

  }
}
