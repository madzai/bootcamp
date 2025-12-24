import java.time.LocalDateTime;
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

  public Importance getImportance() {
    return this.importance;
  }

  public static enum Importance {
    HIGH, MEDIUM, LOW,;
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

    ArrayList<Event> events = new ArrayList<>();
    // ...
    // ...
    Collections.sort(events, new SortByImportance());
  }
}


// public class Event {
// private Importance importance;
// private LocalDateTime eventDate;

// public Event(Importance importance) {
// this.importance = importance;
// }

// public Event(Importance importance, LocalDateTime eventDate) {
// this.importance = importance;
// this.eventDate = eventDate;
// }

// public Importance getImportance() {
// return this.importance;
// }

// public LocalDateTime getEventDate() {
// return this.eventDate;
// }

// // Sort by importance
// public static class SortByImportance implements Comparator<Event> {
// @Override
// public int compare(Event e1, Event e2) {
// if (e1.getImportance() == e2.getImportance()) {
// return -1;
// } else {
// if (e1.getImportance() == Importance.HIGH)
// return -1;
// if (e2.getImportance() == Importance.HIGH)
// return 1;
// if (e1.getImportance() == Importance.MEDIUM)
// return -1;
// if (e2.getImportance() == Importance.MEDIUM)
// return 1;
// return -1;
// }
// }
// }

// // sort by importance -> time
// // public static class SortByImportanceAndTime implements Comparator<Event> {
// // @Override
// // public int compare(Event e1, Event e2) {
// // if (e1.getImportance() == e2.getImportance()) {
// // return e2.getEventDate().isAfter(e1.getEventDate()) ? -1 : 1;
// // } else {
// // if (e1.getImportance() == Importance.HIGH)
// // return -1;
// // if (e2.getImportance() == Importance.HIGH)
// // return 1;
// // if (e1.getImportance() == Importance.MEDIUM)
// // return -1;
// // if (e2.getImportance() == Importance.MEDIUM)
// // return 1;
// // return -1;
// // }
// // }
// // }

// // sort by importance -> time
// // public static class SortByTimeAndImportance implements Comparator<Event> {
// // @Override
// // public int compare(Event e1, Event e2) {
// // if (!e1.getEventDate().isEqual(e1.getEventDate())) {
// // return e2.getEventDate().isAfter(e1.getEventDate()) ? -1 : 1;
// // } else {
// // if (e1.getImportance() == Importance.HIGH)
// // return -1;
// // if (e2.getImportance() == Importance.HIGH)
// // return 1;
// // if (e1.getImportance() == Importance.MEDIUM)
// // return -1;
// // if (e2.getImportance() == Importance.MEDIUM)
// // return 1;
// // return -1;
// // }
// // }
// // }

// @Override
// public String toString() {
// return "Event(importance=" + this.importance + ")";
// }

// public static enum Importance {
// HIGH, MEDIUM, LOW,;
// }

// public static void main(String[] args) {
// // Comparator: HIGH > MEDIUM > LOW
// PriorityQueue<Event> eventQueue = new PriorityQueue<>();
// eventQueue.add(new Event(Importance.HIGH));
// eventQueue.add(new Event(Importance.MEDIUM));
// eventQueue.add(new Event(Importance.HIGH));
// eventQueue.add(new Event(Importance.LOW));
// eventQueue.add(new Event(Importance.MEDIUM));
// eventQueue.add(new Event(Importance.MEDIUM));
// eventQueue.add(new Event(Importance.HIGH));
// System.out.println(eventQueue);
// // System.out.println(eventQueue.poll());
// // System.out.println(eventQueue.poll());
// // System.out.println(eventQueue.poll());
// // System.out.println(eventQueue.poll());
// // System.out.println(eventQueue.poll());
// // System.out.println(eventQueue.poll());
// // System.out.println(eventQueue.poll());

// // No. of Events is fixed, use Collections.sort (much quicker)
// // ArrayList<Event> events = new ArrayList<>();
// // events.add(new Event(Importance.LOW, //
// // LocalDateTime.of(2025, 3, 31, 23, 59, 59)));
// // events.add(new Event(Importance.HIGH, //
// // LocalDateTime.of(2025, 11, 31, 12, 59, 59)));
// // events.add(new Event(Importance.HIGH, //
// // LocalDateTime.of(2023, 10, 31, 23, 59, 59)));
// // events.add(new Event(Importance.MEDIUM, //
// // LocalDateTime.of(2025, 1, 31, 2, 49, 59)));
// // events.add(new Event(Importance.MEDIUM, //
// // LocalDateTime.of(2025, 10, 31, 23, 59, 59)));
// // events.add(new Event(Importance.MEDIUM, //
// // LocalDateTime.of(2025, 4, 23, 23, 59, 59)));
// // Collections.sort(events, new SortByImportanceAndTime());
// }
// }
