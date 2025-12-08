import java.time.LocalDate;

public class DemoLocalDate2 {
  public static void main(String[] args) {
    // 2024-10-01
    // 2023-01-31
    // 2025-06-30
    // array stores the dates
    // count the no. of dates after 2024

    LocalDate[] dates = new LocalDate[] {LocalDate.of(2024, 10, 1),
        LocalDate.of(2023, 1, 31), LocalDate.of(2025, 6, 30)};

    int count = 0;
    for (int i = 0; i < dates.length; i++) {
      // if (dates[i].isAfter(LocalDate.of(2023, 12, 31))) {
      if (dates[i].getYear() >= 2024) {
        count += 1;
      }
    }
    System.out.println("No. of dates after 2024: " + count);

    // find the max date from the array of dates
    // LocalDate maxDate = LocalDate.of(1900, 1, 1);
    LocalDate maxDate = dates[0];
    for (int i = 0; i < dates.length; i++) {
      if (dates[i].isAfter(maxDate)) {
        maxDate = dates[i];
      }
    }
    System.out.println("Max date: " + maxDate);

  }
}
