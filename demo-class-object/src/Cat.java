public class Cat {
  // name & age are unique for each Cat
  // ! Attributes
  private String name;
  private int age;

  // Implicitly exist constructor
  // ! Constructor: the process of building the object
  public Cat() {

  }

  // ! instance methods
  public boolean isAdult() {
    // if (this.age >= 5) {
    // return true;
    // } else {
    // return false;
    // }
    return this.age >= 5;
  }

  public void setName(String name) {
    // . : goes to (1st person view)
    this.name = name; // this.name = my name
  }

  // getAge, setAge
  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static void main(String[] args) {
    // ! "new" -> Constructor
    String s1 = new String();

    Cat c1 = new Cat(); // name, age
    c1.setName("John");
    System.out.println("c1 has name: " + c1.getName()); // John
    Cat c10 = c1;
    c10.setName("Peter");
    c1.setAge(4);
    System.out
        .println("c1 have name " + c1.getName() + " and age " + c1.getAge()); // Peter

    Cat c2 = new Cat(); // name, age
    // set, get
    c2.setName("Sarah");
    c2.setAge(1);
    System.out.println("c2 is " + c2.getName() + " with age " + c2.getAge());
    Cat c3 = new Cat();
    c3.setName("Moana");
    c3.setAge(10);
    // System.out.println("c3 has name: " + c3.getName());
    System.out.println("c3 is " + c3.getName() + " with age " + c3.getAge());

    // Excel row (data) x column (attributes)
    // OOP: (c1.name, c1.age) ~ one row in Excel
    // OOP: ()

    Cat[] cats = new Cat[3];
    cats[0] = c1;
    cats[1] = c2;
    cats[2] = c3;

    for (int i = 0; i < cats.length; i++) {
      System.out.println("Cat " + (i + 1) + ": name = " + cats[i].getName()
          + ", age = " + cats[i].getAge()
          + (cats[i].isAdult() ? " (adult)" : " (kitten)"));
    }

    // Adult definition, better set in object
    if (c3.getAge() > 18) {

    }

    // More readible for humans
    if (c3.isAdult()) {

    }

  }
}
