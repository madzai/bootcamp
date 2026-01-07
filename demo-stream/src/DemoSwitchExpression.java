public class DemoSwitchExpression {
  // switch
  // 1. break actively
  // 2. No range checking

  // Switch Expression (Lambda)
  public static void main(String[] args) {
    Weekday today = Weekday.WED;

    switch (today) {
      case MON -> System.out.println("Mon");
      // case MON -> System.out.println("Mon"); // error: can't repeat
      case TUE -> System.out.println("Tuey");
      case WED -> System.out.println("Wed");
      case THU -> System.out.println("Thu");
      case FRI -> System.out.println("Fri");
    };

    String result = switch (today) {
      case MON -> {
        // ...
        yield "Monday";
      }
      case TUE -> "Tuesday";
      case WED, THU -> "Wednesday and Thursday";
      case FRI -> "Friday";
      default -> "Default";
    };
    System.out.println(result);

  }

  public static enum Weekday {
    MON, TUE, WED, THU, FRI,;
  }

}
