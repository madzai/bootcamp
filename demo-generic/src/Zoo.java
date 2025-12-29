public class Zoo<T, U> {

  // ! Control the range of Type for the object.
  public class Zoo<T extends Animal, U extends Worker> {
    private List<T> animals; // Tiger, Panda extends Animal
    private List<U> workers; // Keeper, Cleaner extends Worker

    // add
    // add

    public static void main(String[] args) {
      // zoo1 can add tiger only
      Zoo<Tiger, Keeper> zoo1 = new Zoo<>();
      // zoo2 can add any type of animals
      Zoo<Animal, Worker> zoo2 = new Zoo<>();
      // zoo3 can add panda only
      Zoo<Panda, Cleaner> zoo3 = new Zoo<>();
    }
  }
}
