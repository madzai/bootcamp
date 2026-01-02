// public class TrimAndUppercase {

// public class TrimAndUppercase implements Function<String, String> {
// @Override
// public String apply(String s) {
// return s.trim().toUpperCase();
// }
// }
// }



public class TrimAndUppercase implements Function<String, String> {
  @Override
  public String apply(String s) {
    return s.trim().toUpperCase();
  }
}

