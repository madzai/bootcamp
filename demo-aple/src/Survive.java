// ! interface = Contract
// extends multiple interfaces
public interface Survive extends Eatable, Sleepable {
  void drink(); // if Human implements Survive, then must write eat(), sleep() and also drink()
}
