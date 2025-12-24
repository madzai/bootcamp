import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;


public class Event {
  private Importance importance;
  private LocalDateTime eventDate; // isBefore

  public Event(Importance importance) {
    this.importance = importance;
  }

  public Event(Importance importance, LocalDateTime eventDate) {
    this.importance = importance;
    this.eventDate = eventDate;
  }

  public Importance getImportance() {
    return this.importance;
  }

  public LocalDateTime getEventDate() {
    return this.eventDate;
  }

  @Override
  public String toString() {
    return "Event(" + //
        "Importance:" + this.importance + //
        ", EventDate:" + this.eventDate + //
        ")";
  }

  public static enum Importance {
    HIGH, MEDIUM, LOW,;
  }

  // Importance > time
  public static class SortByImportance2 implements Comparator<Event> {
    @Override
    public int compare(Event e1, Event e2) {
      // Same importance
      if (e1.getImportance() == e2.getImportance()) {
        if (e1.getEventDate().isBefore(e2.getEventDate())) {
          return -1;
        } else {
          return 1;
        }
      } else {
        // Different Importance
        if (e1.getImportance() == Importance.HIGH)
          return -1;
        if (e2.getImportance() == Importance.HIGH)
          return 1;
        if (e1.getImportance() == Importance.MEDIUM)
          return -1;
        if (e2.getImportance() == Importance.MEDIUM)
          return 1;
        return -1;
      }
    }
  }

  public static class SortByImportance implements Comparator<Event> {
    @Override
    public int compare(Event e1, Event e2) {
      if (e1.getImportance() == Importance.HIGH)
        return -1;
      if (e2.getImportance() == Importance.HIGH)
        return 1;
      if (e1.getImportance() == Importance.MEDIUM)
        return -1;
      if (e2.getImportance() == Importance.MEDIUM)
        return 1;
      return -1;
    }
  }

  public static void main(String[] args) {
    // Comparator: HIGH -> MEDIUM -> LOW
    PriorityQueue<Event> eventQueue =
        new PriorityQueue<>(new SortByImportance());
    eventQueue.add(new Event(Importance.LOW));
    eventQueue.add(new Event(Importance.HIGH));
    eventQueue.add(new Event(Importance.MEDIUM));
    eventQueue.add(new Event(Importance.HIGH));

    System.out.println(eventQueue.poll().getImportance()); // HIGH
    System.out.println(eventQueue.poll().getImportance()); // HIGH
    System.out.println(eventQueue.poll().getImportance()); // MEDIUM
    System.out.println(eventQueue.poll().getImportance()); // LOW

    // Example 2
    PriorityQueue<Event> eventQueue2 =
        new PriorityQueue<>(new SortByImportance2());
    eventQueue2.add(new Event(Importance.LOW,
        LocalDateTime.of(2025, Month.DECEMBER, 31, 23, 59, 59)));
    eventQueue2.add(new Event(Importance.LOW,
        LocalDateTime.of(2025, Month.OCTOBER, 3, 23, 59, 59)));
    eventQueue2.add(new Event(Importance.HIGH,
        LocalDateTime.of(2025, Month.JULY, 31, 23, 59, 59)));
    eventQueue2.add(new Event(Importance.MEDIUM,
        LocalDateTime.of(2025, Month.DECEMBER, 31, 23, 59, 59)));
    eventQueue2.add(new Event(Importance.HIGH,
        LocalDateTime.of(2025, Month.MARCH, 23, 3, 59, 59)));
    eventQueue2.add(new Event(Importance.MEDIUM,
        LocalDateTime.of(2025, Month.DECEMBER, 1, 2, 59, 59)));

    System.out.println("Sort by importance -> event date");
    System.out.println(eventQueue2.poll());
    System.out.println(eventQueue2.poll());
    System.out.println(eventQueue2.poll());
    System.out.println(eventQueue2.poll());
    System.out.println(eventQueue2.poll());

  }
}

