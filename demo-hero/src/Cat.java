public class Cat extends Animal {

  @Override
  public void eat() {
    System.out.println("Cat is eating");
  }

  @Override
  public void sleep() {
    System.out.println("Cat is sleeping");
  }

  public void catchFish() {
    System.out.println("Catch fish");
  }

  public static void main(String[] args) {
    // ! Static polymorphism (compile time)
    Object o = new Cat();
    // o.eat(); // error

    // ! Dynamic polymorphism (run time)
    Animal a = new Cat();
    a.eat();
    a.sleep(); // cating is sleeping

    // Parent Reference, Child Object
    Object o2 = new Cat();
    Animal a2 = new Cat();
    Animal[] animals = new Cat[3]; // doesn't make sense
    // Animal[] animals = new Animal[3]; // if to put Dog into array
    animals[0] = new Cat();
    // animals[1] = new Dog(); // ! runtime error (trap: but surprisingly OK in compile time)

    // Downcasting
    Object[] objects = new Object[2];
    objects[0] = new Warrior();
    objects[1] = new Dog();

    // not Open Close: have to add else if for more types of new objects in the future
    for (Object obj : objects) {
      if (obj instanceof Dog) {
        Dog dog = (Dog) obj; // ! Downcasting
        dog.sleep();
      } else if (obj instanceof Warrior) {
        Warrior warrior = (Warrior) obj; // ! Downcasting
        warrior.attack(warrior);
      }
    }

  }
}
