import java.util.Objects;

public class Student {
  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Student))
      return false;
    Student student = (Student) o;
    return Objects.equals(this.name, student.getName()) //
        && Objects.equals(this.score, student.getScore());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.score);
  }

  @Override
  public String toString() {
    return "Student(name=" + this.name //
        + ",score=" + this.score + ")";
  }

  public String getName() {
    return this.name;
  }

  public int getScore() {
    return this.score;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setScore(int score) {
    this.score = score;
  }
}
