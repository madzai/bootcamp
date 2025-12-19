import java.util.ArrayList;
import java.util.List;

public class Cat {
  private String name;

  public Cat(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Cat))
      return false;
    Cat cat = (Cat) o;
    return this.name == cat.getName();
  }

  @Override
  public String toString() {
    return "Cat(name=" + this.name + ")";
  }


  public static void main(String[] args) {
    // ArrayList of Cat
    ArrayList<Cat> cats = new ArrayList<>();
    System.out.println(cats);

    // add, remove
    Cat c1 = new Cat("Nancy");
    cats.add(c1);
    cats.add(c1);
    cats.add(new Cat("Ann"));
    System.out.println(cats);

    cats.remove(new Cat("Nancy")); // removed (after ovverride equals)
    System.out.println(cats);
    System.out.println(cats.size());
    cats.remove(c1);
    System.out.println(cats);
    System.out.println(cats.size());

    // ! Array has ordering
    cats.add(new Cat("Peter")); // add Last
    cats.addFirst(new Cat("Jenny"));
    System.out.println(cats);

    // ! Loop + break
    // cats.remove(new Cat("Peter"));
    if (cats.contains(new Cat("Peter"))) { // true
      System.out.println("There is a cat called Peter");
    } else {
      System.out.println("There isn't a cat called Peter");
    }

    // cats.clear();
    // System.out.println(cats);
    // System.out.println(cats.size());

    // // ! array.length
    // if (cats.isEmpty()) { // false
    // System.out.println("No cats");
    // } else {
    // System.out.println("There are cats");
    // }

    // // Polymorphism
    // List<Cat> catList = new ArrayList<>();


  }

  // self
  // public class Cat {
  // private String name;
  // private String color;

  // public Cat(String name, String color) {
  // this.name = name;
  // this.color = color;
  // }

  // @Override
  // public boolean equals(Object o) {
  // if (o == this)
  // return true;
  // if (!(o instanceof Cat))
  // return false;
  // Cat cat = (Cat) o;
  // // return this.name == cat.getName();
  // return this.name == cat.getName() //
  // && this.color == cat.getColor();
  // }

  // @Override
  // public String toString() {
  // return "(Cat: name=" + this.name //
  // + ", color=" + this.color + ")";
  // }

  // public String getName() {
  // return this.name;
  // }

  // public String getColor() {
  // return this.color;
  // }

  // public static void main(String[] args) {
  // // ArrayList of Cat
  // ArrayList<Cat> cats = new ArrayList<>();
  // System.out.println(cats);
  // // add, remove
  // cats.add(new Cat("Ann", "Brown"));
  // cats.add(new Cat("Peter", "White"));
  // cats.add(new Cat("Ann", "Black"));
  // cats.add(new Cat("Peter", "Pink"));
  // System.out.println(cats);
  // cats.remove(new Cat("Peter", "White"));
  // // cats.remove(new Cat("Peter", "Blue"));
  // System.out.println(cats);
  // }
}
