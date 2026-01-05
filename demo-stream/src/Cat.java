public class Cat {
  private String name;
  private int age;

  // ! Encapsulation -> Builder Pattern
  private Cat(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

  public static Builder builder() {
    return new Builder();
  }

  // ! Encapsulation
  public static class Builder {
    private String name;
    private int age;

    // setter
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    // setter
    public Builder age(int age) {
      this.age = age;
      return this;
    }

    public Cat build() {
      return new Cat(this.name, this.age);
    }

    // @Override
    // public String toString() {
    // return "Cat(name=" + this.getName() //
    // + ", age=" + this.getAge() //
    // + ")";
    // }

    public static void main(String[] args) {
      // new Cat.Builder("John", 19); // can be confusing if too many attributes

      // Cat c1 = new Cat.Builder() //
      // .name("John") //
      // .age(19) //
      // .build();

      Cat c1 = Cat.builder() // return Builder Object
          .name("John") // return Builder Object
          .age(19) // return Builder Object
          .build(); // return Cat Object

      System.out.println(c1.getName());
      System.out.println(c1.getAge());


    }
  }
}
