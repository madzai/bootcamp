import java.util.ArrayList;
import java.util.List;

// ! Control the range of Type for the object.
public class Zoo<T extends Animal, U extends Worker> {
  private List<T> animals; // Tiger, Panda extends Animal
  private List<U> workers; // Keeper, Cleaner extends Worker

  public Zoo() {
    this.animals = new ArrayList<>();
    this.workers = new ArrayList<>();
  }

  // add
  // add
  public boolean add(T animal) {
    return this.animals.add(animal);
  }

  public boolean add(U worker) {
    return this.workers.add(worker);
  }

  public int noOfAnimal() {
    return this.animals.size();
  }

  public int noOfWorker() {
    return this.workers.size();
  }

  public static void main(String[] args) {
    Zoo<Tiger, Keeper> zoo1 = new Zoo<>();
    // zoo1 can add tiger only

    Zoo<Panda, Cleaner> zoo2 = new Zoo<>();
    // zoo3 can add Panda only

    Zoo<Animal, Worker> zoo3 = new Zoo<>();
    // zoo3 can add Tiger and Panda

    zoo1.add(new Tiger());
    zoo2.add(new Panda());
    zoo3.add(new Tiger());
    zoo3.add(new Panda());
    System.out.println(zoo1.noOfAnimal());
    System.out.println(zoo2.noOfAnimal());
    System.out.println(zoo3.noOfAnimal());
    System.out.println();

    zoo1.add(new Keeper());
    zoo2.add(new Cleaner());
    zoo3.add(new Cleaner());
    zoo3.add(new Cleaner());
    System.out.println(zoo1.noOfWorker());
    System.out.println(zoo2.noOfWorker());
    System.out.println(zoo3.noOfWorker());
    System.out.println();
  }
}
