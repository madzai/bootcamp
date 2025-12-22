// Dog[], Leader.java -> Dog[] dogs
public class Dog {
  private Dog dog;
  private String name;

  public Dog(String name) {
    this.name = name;
  }

  public void setNext(Dog nextDog) {
    this.dog = nextDog;
  }

  public Dog getNext() {
    return this.dog;
  }

  public String getName() {
    return this.name;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Dog))
      return false;
    Dog dog = (Dog) o;
    return this.name == dog.getName();
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("Peter");
    d1.setNext(new Dog("Sally"));
    d1.getNext().setNext(new Dog("Tommy"));
    System.out.println("3rd dog: " + d1.getNext().getNext().getName()); // Tommy

    // Find the last Dog (LinkedList -> while)
    Dog head = d1;
    // Dog tail = d1;
    // Dog tail2 = d1;

    // Peter Sally Tommy
    System.out.println();
    System.out.println("List out all dogs");
    while (head != null) {
      System.out.print(head.getName() + " ");
      // tail2 = tail;
      // tail = head;
      head = head.getNext();
    }

    // remove the last dog
    // d1 -> null
    head = d1; // Resume head -> Peter
    // System.out.println(head.getName()); // Peter

    removeLast(d1);
    System.out.println();
    System.out.println();
    System.out.println("Last dog removed");
    System.out.println("3rd dog: " + d1.getNext().getNext()); // null
    System.out.println("2nd dog: " + d1.getNext().getName()); // Sally

    // Peter Sally
    d1 = remove(d1, new Dog("Peter"));
    System.out.println();
    // System.out.println("head dog after removing Peter: " + d1.getName()); //
    // Sally

    System.out.println("List out all dogs"); // only Sally in dogs
    showAllDogs(d1);

    // // Peter Sally
    // removeLast(d1);
    // System.out.println();
    // System.out.println();
    // System.out.println("After removing the last dog");
    // System.out.println(d1.getName() + " " //
    // + d1.getNext().getName() + " " //
    // + d1.getNext().getNext());

    // Peter Sally Tommy Zack
    d1 = new Dog("Peter");
    d1.setNext(new Dog("Sally"));
    d1.getNext().setNext(new Dog("Tommy"));
    d1.getNext().getNext().setNext(new Dog("Zack"));
    System.out.println();
    System.out.println();
    System.out.println("Reset: list out all 4 dogs");
    System.out.println(d1.getName() + " " //
        + d1.getNext().getName() + " " //
        + d1.getNext().getNext().getName() + " " //
        + d1.getNext().getNext().getNext().getName());

    d1 = remove(d1, new Dog("Tommy"));
    System.out.println();
    System.out.println("After removing dogs up to Tommy");
    showAllDogs(d1);

    // Joe Andy Elsa Frank
    d1 = new Dog("Joe");
    d1.setNext(new Dog("Andy"));
    d1.getNext().setNext(new Dog("Elsa"));
    d1.getNext().getNext().setNext(new Dog("Frank"));
    System.out.println();
    System.out.println();
    System.out.println("Reset: list out all 4 dogs");
    showAllDogs(d1);

    System.out.println();
    System.out.println();
    removeMiddle(d1, new Dog("Elsa"));
    System.out.println("After removing Elsa");
    showAllDogs(d1);

  }

  public static void showAllDogs(Dog dog) {
    Dog head = dog;
    while (head != null) {
      System.out.print(head.getName() + " ");
      head = head.getNext();
    }
  }

  // Remove target and all dogs before
  public static Dog remove(Dog dog, Dog target) {
    Dog head = dog;
    while (head != null) {
      if (head.equals(target)) {
        return head.getNext();
      }
      head = head.getNext();
    }
    return head;
  }

  public static void removeLast(Dog dog) { // Assume Dog is in LinkedList Design
    if (dog == null) // ! Early return
      return;
    Dog head = dog;
    while (head.getNext() != null) {
      if (head.getNext().getNext() == null) { // Found the last dog.
        head.setNext(null);
        break;
      }
      head = head.getNext();
    }
  }

  public static void removeMiddle(Dog dog, Dog target) {
    if (dog == null || target == null)
      return;
    Dog head = dog;
    while (head != null) {
      if (head.getNext().equals(target)) {
        head.setNext(head.getNext().getNext());
        break;
      }
      head = head.getNext();
    }
  }

}
