public class Student {

  // Subject array can't be modified, but indiviual Subject can be changed
  public final Subject[] subjects = new Subject[] { //
      new Subject("CHIN"), //
      new Subject("ENG"), //
      new Subject("MATH") //
  };

  public void changeSubject(int index, Subject subject) {
    this.subjects[index] = subject;
  }

  // add/drop method if many subjects

  public void changeFirstSubject(Subject subject) {
    this.subjects[0] = subject;
  }

  public void changeSecondSubject(Subject subject) {
    this.subjects[1] = subject;
  }

  public void changeThirdSubject(Subject subject) {
    this.subjects[2] = subject;
  }

  public void displaySubjects() {
    for (Subject s : this.subjects) {
      System.out.print(s.getName() + " ");
    }
    System.out.println();
  }

  public String showSubjects() {
    // for loop
    // String result = "";
    // for (Subject s : this.subjects) {
    // result += s.getName();
    // result += " ";
    // }
    // return result.trim();

    // without for looop
    return this.subjects[0].getName() + ", " //
        + this.subjects[1].getName() + ", " //
        + this.subjects[2].getName();
  }

  public double averageScore() {
    // return (this.subjects[0].getScore() + //
    // this.subjects[1].getScore() + //
    // this.subjects[2].getScore()) / 3.0;

    // Alt
    double totalScore = 0.0;
    totalScore += this.subjects[0].getScore() + //
        this.subjects[1].getScore() + //
        this.subjects[2].getScore();
    return totalScore / 3;
  }

  public void setScore(int index, int score) {
    this.subjects[index].setScore(score);
  }


  // ! All students can take 3 Subjects only
  // ! Each Student takes CHIN, ENG, MATH by default
  public static void main(String[] args) {
    Student s1 = new Student();
    s1.displaySubjects();
    // MATH -> HISTORY
    s1.changeSubject(2, new Subject("HISTORY"));
    // Show subjects studied
    s1.displaySubjects();

    System.out.println(s1.showSubjects());
    System.out.println(s1.averageScore());

    s1.setScore(0, 70);
    s1.setScore(1, 80);
    s1.setScore(2, 60);
    System.out.println(s1.averageScore());

    s1.changeSecondSubject(new Subject("GEOGRAPHY"));
    System.out.println(s1.showSubjects());

  }
}
