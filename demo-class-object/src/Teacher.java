public class Teacher {
  private Candy[] candies;

  public Teacher() {
    this.candies = new Candy[0];
  }

  public void add(Candy candy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i = 0; i < this.candies.length; i++) {
      newCandies[i] = this.candies[i];
    }
    newCandies[this.candies.length] = candy;
    this.candies = newCandies;
  }

  public void add(Candy[] candies) {
    for (Candy candy : candies) {
      this.add(candy);
    }
  }

  public void distribute(Student student) {
    // ! Teacher object doesn't even know how student stores the candy
    Candy candy = this.deductCandy();
    if (candy != null) {
      student.receive(candy);
    }
  }

  public void distributeAll(Student[] students) {
    int idx = 0;
    while (true) {
      Candy candy = this.deductCandy();
      if (candy == null)
        break;
      idx = idx % students.length == 0 ? 0 : idx;
      students[idx++].receive(candy);

    }
  }

  public Candy deductCandy() {
    if (this.candies.length <= 0)
      return null;

    Candy deductedCandy = this.candies[this.candies.length - 1];
    Candy[] newCandies = new Candy[this.candies.length - 1];
    for (int i = 0; i < this.candies.length - 1; i++) {
      newCandies[i] = this.candies[i];
    }
    this.candies = newCandies;
    return deductedCandy;
  }

  public int getNumOfCandies() {
    return this.candies.length;
  }

  public static void main(String[] args) {
    // A teacher has 22 candies, 5 students
    // main: distribute all candies to all students
    // Finally, the teacher has no candies
    // Show all candies for each student

    Candy[] candies = new Candy[] {Candy.ofRed(), Candy.ofRed(), Candy.ofRed(),
        Candy.ofRed(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(),
        Candy.ofBlue(), Candy.ofYellow(), Candy.ofYellow(), Candy.ofYellow(),
        Candy.ofYellow(), Candy.ofRed(), Candy.ofRed(), Candy.ofRed(),
        Candy.ofRed(), Candy.ofBlue(), Candy.ofBlue(), Candy.ofBlue(),
        Candy.ofBlue(), Candy.ofYellow(), Candy.ofYellow()};
    // System.out.println(candies.length);

    Teacher teacher = new Teacher();
    teacher.add(candies);
    System.out
        .println("Teacher's no. of candies: " + teacher.getNumOfCandies());

    Student[] students = new Student[] {new Student(), new Student(),
        new Student(), new Student(), new Student()};

    teacher.distributeAll(students);
    System.out
        .println("Teacher's no. of candies: " + teacher.getNumOfCandies());
    System.out.println(
        "Student 1's no. of candies: " + students[0].getNumOfCandies());
    System.out.println(
        "Student 2's no. of candies: " + students[1].getNumOfCandies());
    System.out.println(
        "Student 3's no. of candies: " + students[2].getNumOfCandies());
    System.out.println(
        "Student 4's no. of candies: " + students[3].getNumOfCandies());
    System.out.println(
        "Student 5's no. of candies: " + students[4].getNumOfCandies());

  }

}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// public class Teacher {
// private Candy[] candies;

// public Teacher() {
// this.candies = new Candy[22];
// String color = "";

// for (int i = 0; i < 22; i++) {
// if (i % 3 == 0) {
// color = "RED";
// } else if (i % 3 == 1) {
// color = "YELLOW";
// } else {
// color = "BLUE";
// }
// this.candies[i] = new Candy(i + 1, color);
// }
// }

// public void giveCandy(Candy candy) {
// Candy[] newCandies = new Candy[this.candies.length - 1];
// int idx = 0;
// for (Candy c : this.candies) {
// if (c != candy)
// newCandies[idx] = c;
// }
// this.candies = newCandies;
// }

// public Candy[] getCandies() {
// return this.candies;
// }

// public int getNumOfCandies() {
// return this.candies.length;
// }

// // A teacher has 22 candies, 5 students
// // main: distribute all candies to all students
// // Finally, the teacher has no candies
// // Show all candies for each student

// public static void main(String[] args) {
// Teacher teacher = new Teacher();

// Student[] students = new Student[] {new Student(1), new Student(2),
// new Student(3), new Student(4), new Student(5)};

// System.out.print("Teacher's candies:");
// for (Candy candy : teacher.getCandies()) {
// System.out.print(candy.getId() + " ");
// }
// System.out.println();

// // Distribute candies
// Candy theCandy = new Candy(1, "RED");
// int studentidx = 0;
// for (int i = 0; i < teacher.getNumOfCandies(); i++) {
// theCandy = teacher.getCandies()[i];
// teacher.giveCandy(theCandy);
// studentidx = i % 5;
// students[i].receiveCandy(theCandy);
// }

// }
// }

