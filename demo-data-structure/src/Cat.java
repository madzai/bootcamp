import java.util.ArrayList;

public class Cat {
  private String name;
  private String color;

  public Cat(String name, String color) {
    this.name = name;
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Cat))
      return false;
    Cat cat = (Cat) o;
    // return this.name == cat.getName();
    return this.name == cat.getName() //
        && this.color == cat.getColor();
  }

  @Override
  public String toString() {
    return "(Cat: name=" + this.name //
        + ", color=" + this.color + ")";
  }

  public String getName() {
    return this.name;
  }

  public String getColor() {
    return this.color;
  }

  public static void main(String[] args) {
    // ArrayList of Cat
    ArrayList<Cat> cats = new ArrayList<>();
    System.out.println(cats);
    // add, remove
    cats.add(new Cat("Ann", "Brown"));
    cats.add(new Cat("Peter", "White"));
    cats.add(new Cat("Ann", "Black"));
    cats.add(new Cat("Peter", "Pink"));
    System.out.println(cats);
    cats.remove(new Cat("Peter", "White"));
    // cats.remove(new Cat("Peter", "Blue"));
    System.out.println(cats);
  }
}
