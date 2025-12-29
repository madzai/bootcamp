import java.util.LinkedList;
import java.util.List;

public class Zoo2 {
  private List<Animal> animals;
  private List<Worker> workers;

  public Zoo2() {
    this.animals = new LinkedList<>();
    this.workers = new LinkedList<>();
  }

  public boolean add(Animal animal) {
    return this.animals.add(animal);
  }

  public boolean add(Worker worker) {
    return this.workers.add(worker);
  }

  public int noOfAnimal() {
    return this.animals.size();
  }

  public static void main(String[] args) {
    Zoo2 zoo2 = new Zoo2();
    zoo2.add(new Keeper());
    zoo2.add(new Tiger());
    zoo2.add(new Cleaner());
    zoo2.add(new Panda());
    zoo2.add(new Tiger());
    System.out.println(zoo2.noOfAnimal()); // 3
  }
}
