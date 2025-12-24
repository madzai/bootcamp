public class Cat extends Animal {
  @Override
  public void eat() {
    System.out.println("Cat is eating...");
  }

  @Override
  public void sleep() {
    System.out.println("Cat is sleeping...");
  }

  public static void main(String[] args) {
    // ! Static Polymorphism (Compile Time)
    Object o = new Cat();
    // o.eat();
    Animal a = new Cat();
    a.eat();

    // ! Dynamic Polymorphism (Run Time)
    a.sleep(); // Cat is sleeping...

    // Parent Reference, Child Object
    Object o2 = new Cat();
    Animal a2 = new Cat();

    // !!!!
    Animal[] animals = new Cat[3]; // Doesn't make sense.
    animals[0] = new Cat();
    // animals[1] = new Dog(); // ! Runtime Error

    // Polymorphism + Downcasting
    Object[] objects = new Object[2];
    objects[0] = new Warrior();
    objects[1] = new Dog();

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
