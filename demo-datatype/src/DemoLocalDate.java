import java.time.LocalDate;
import java.util.Date;

public class DemoLocalDate {
  public static void main(String[] args) {
    String s = "hello"; // java.lang (no need to import)
    // ! plus/minus
    LocalDate ld1 = LocalDate.of(2025, 12, 31); // java.time (needs to import)
    LocalDate ld2 = ld1.plusDays(1);
    System.out.println("Today: " + ld1);
    System.out.println("After 1 day: " + ld2);

    LocalDate afterThreeYear = ld1.plusYears(3L);
    System.out.println("3 years later: " + afterThreeYear);
    System.out.println("2 weeks before: " + ld1.minusWeeks(2L));

    // ! Get the values from a date
    ld1 = ld1.plusDays(200L);
    System.out.println("Added 200 days: " + ld1);
    System.out.println("Day of year: " + ld1.getDayOfYear());
    System.out.println("Day of month: " + ld1.getDayOfMonth());

    // ! Comparison
    // 2023 4 28
    LocalDate joinDate = LocalDate.of(2023, 4, 28);
    // 3 months probation
    LocalDate probationEndDate = joinDate.plusMonths(3L);
    // check if 2023 8 1 passed probation period
    // isAfter()
    // isBefore()
    LocalDate today = LocalDate.of(2023, 8, 1);
    if (today.isAfter(probationEndDate)) {
      System.out.println("Today: passed probation");
    }

    // Effective Date 2026 01 01
    LocalDate effectiveDate = LocalDate.of(2026, 1, 1);
    today = LocalDate.of(2026, 1, 1);
    // if (today.equals(effectiveDate) || today.isAfter(effectiveDate)) { // slower as isAfter more likely than equals
    if (today.isAfter(effectiveDate) || today.equals(effectiveDate)) {
      System.out.println("Effective already");
    } else {
      System.out.println("Not yet effective");
    }

    System.out.println("Date: " + ld1); // 2026-07-19
    System.out.println("Leap year: " + ld1.isLeapYear()); // false
    System.out.println("with year 2024: " + ld1.withYear(2024));

    System.out.println(ld1.compareTo(LocalDate.of(2026, 7, 13))); // distance (years/month/days)
    int dateDiff = ld1.compareTo(effectiveDate); // for same year, give month diff; for same month: gives day diff
    System.out.println("Date difference: " + dateDiff);
    if (ld1.compareTo(effectiveDate) > 0) {
      System.out.println(ld1 + " is later than " + effectiveDate);
    }

    // older date data type (may appear in older codes)
    Date d1 = new Date(2025, 11, 31); // Dec, not Nov
    System.out.println(d1.getYear());

    // ! Wrong demo. Never use (>=, <=, >, <, ==) to compare non-primitive values
    // ! Instead, use isAfter(), isBefore(), equals()
    LocalDate ld3 = LocalDate.of(2024, 10, 31);
    LocalDate ld4 = LocalDate.of(2024, 10, 31);
    System.out.println(ld4 == ld3); // false

  }
}
