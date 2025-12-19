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
    System.out.println("The name of the 3rd dog");
    System.out.println(d1.getNext().getNext().getName()); // Tommy

    // Find the last Dog (LinkedList -> while)
    Dog head = d1;
    // Dog tail = d1;
    // Dog tail2 = d1;

    System.out.println("List out all dogs");
    while (head != null) {
      System.out.println(head.getName());
      // tail2 = tail;
      // tail = head;
      head = head.getNext();
    }

    // remove the last dog
    // d1 -> null

    // self
    // System.out.println("The 2nd last dog: " + tail2.getName());
    // tail2.setNext(null);
    // // Show all dogs in the linked list
    // head = d1;
    // while (head != null) {
    // System.out.println(head.getName());
    // head = head.getNext();
    // }

    // Lesson
    // d1 -> null
    // Error if only two dogs in the list
    head = d1;
    while (head != null) {
      if (head.getNext().getNext() == null) { // found the last dog
        head.setNext(null);
        break;
      }
      head = head.getNext();
    }
    System.out.println("After removing the last dog, the 3rd dog is ");
    System.out.println(d1.getNext().getNext());

    // public static Dog remove(Dog dog, Dog target) {
    // Dog head = dog;
    // while (head != null) {
    // if (head.equals(target)) {
    // if (head.getNext() != null) {
    // dog = head.getNext();
    // break;
    // }
    // dog = head.getNext();
    // }
    // }
    // }


  }
}
