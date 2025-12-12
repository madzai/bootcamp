public class Teacher {
  private Candy[] candies;

  public Teacher() {
    this.candies = new Candy[0];
  }

  public void add(Candy candy) {

  }

  public void add(Candy[] candies) {
    for (Candy candy : candies) {
      this.add(candy);
    }
  }

  public void distribute(Student student) {
    // ! Teacher object doesn't even know how student stores the candy
    student.receive(x);
  }

  public static void main(String[] args) {
    // A teacher has 22 candies, 5 students
    // main: distribute all candies to all students
    // Finally, the teacher has no candies
    // Show all candies for each student

    Candy[] candies = new Candy[] {new Candy.ofRed(), new Candy.ofRed(),
        new Candy.ofRed(), new Candy.ofRed(), new Candy.ofBlue(),
        new Candy.ofBlue(), new Candy.ofBlue(), new Candy.ofBlue(),
        new Candy.ofYellow(), new Candy.ofYellow(), new Candy.ofYellow(),
        new Candy.ofYellow(), new Candy.ofRed(), new Candy.ofRed(),
        new Candy.ofRed(), new Candy.ofRed(), new Candy.ofBlue(),
        new Candy.ofBlue(), new Candy.ofBlue(), new Candy.ofBlue(),
        new Candy.ofYellow(), new Candy.ofYellow()};
    System.out.println(candies.length);
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

