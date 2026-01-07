// ! Outer Class
public class DemoNestedClass {
  private int x;

  // public int sum() {
  // return this.x + y; // error for y (belongs to inner class)
  // }

  // ! Nested static class
  public static class Fruit2 {

  }

  // ! Inner class
  public class Fruit {
    private int y;

    public int sum() {
      return x + this.y;
    }
  }

  public static void main(String[] args) {

    Fruit fruit = new DemoNestedClass().new Fruit();
    Fruit2 fruit2 = new DemoNestedClass.Fruit2();

    DemoNestedClass d1 = new DemoNestedClass();
    Fruit fruit3 = d1.new Fruit();
    Fruit fruit4 = d1.new Fruit();
    Fruit fruit5 = d1.new Fruit();

  }
}
