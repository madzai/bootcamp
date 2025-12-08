import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DemoLocalDateTime {
  public static void main(String[] args) {
    LocalDateTime currentTime = LocalDateTime.of(2025, 12, 31, 23, 59, 59);
    System.out.println("Current time: " + currentTime); // 2025-12-31T23:59:59

    System.out.println("32 min later: " + currentTime.plusMinutes(32));
    System.out.println("2 days earlier: " + currentTime.minusDays(2));

    // Re-format
    System.out.println(
        currentTime.format(DateTimeFormatter.ofPattern("dd MMM HH:mm"))); // 31 Dec 23:59
    System.out.println(
        currentTime.format(DateTimeFormatter.ofPattern("dd MMM hh:mm:ss a"))); // 31 Dec 11:59:59 PM

    // Time zone
    ZoneId newYork = ZoneId.of("America/New_York");
    ZonedDateTime newYorkZonedTime = ZonedDateTime.of(currentTime, newYork);
    System.out.println("New York time: " + newYorkZonedTime);

    ZoneId hongKong = ZoneId.of("Asia/Hong_Kong");

    // newYorkTime (ZonedDateTime) -> LocalDateTime
    // LocalDateTime newYorkLocalDateTime = newYorkZonedTime.toLocalDateTime();
    LocalDateTime hongKongLocalDateTime =
        newYorkZonedTime.withZoneSameInstant(hongKong).toLocalDateTime();
    System.out.println("Hong Kong local time: " + hongKongLocalDateTime);

    // .now()
    System.out.println("Current time (now): " + LocalDateTime.now());
    System.out.println("Current time (now): " + LocalDate.now());

    // Epoch second -> total no. of seconds since 1970 1 1 00:00:00
    System.out.println("Total seconds: "
        + LocalDateTime.now().toEpochSecond(ZoneOffset.ofHours(8))); // ! UTC + 8

    System.out.println("Nano seconds: " + LocalDateTime.now().getNano());
    System.out.println(
        "Nano seconds: " + LocalDateTime.now().truncatedTo(ChronoUnit.MICROS)); // 2025-12-08T12:37:11.957183

  }
}
