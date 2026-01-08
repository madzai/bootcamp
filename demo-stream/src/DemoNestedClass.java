// ! Outer Class
public class DemoNestedClass {
  private int x;

  // public int sum() {
  // return this.x + y; // error for y (belongs to inner class)
  // }

  public void setX(int x) {
    this.x = x;
  }

  // ! Nested static class
  public static class Fruit2 {

  }

  // ! Inner class
  public class Fruit {
    private int y;

    public Fruit(int y) {
      this.y = y;
    }

    public int sum() {
      return x + this.y;
    }
  }

  public static void main(String[] args) {

    Fruit fruit1 = new DemoNestedClass().new Fruit(5);
    System.out.println(fruit1.sum());

    Fruit2 fruit2 = new DemoNestedClass.Fruit2();

    DemoNestedClass d1 = new DemoNestedClass();

    d1.setX(10);
    Fruit fruit3 = d1.new Fruit(10);
    Fruit fruit4 = d1.new Fruit(5);
    Fruit fruit5 = d1.new Fruit(3);
    System.out.println(fruit3.sum()); // 20
    System.out.println(fruit4.sum()); // 15
    System.out.println(fruit5.sum()); // 13

    d1.setX(20);
    System.out.println(fruit3.sum()); // 30
    System.out.println(fruit4.sum()); // 25
    System.out.println(fruit5.sum()); // 23

  }
}
