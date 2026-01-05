import java.util.function.Function;

public class TrimAndUppercase implements Function<String, String> {
  @Override
  public String apply(String s) {
    return s.trim().toUpperCase();
  }
}


