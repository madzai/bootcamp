public class Student {
  private Candy[] candies;

  // Similar to Setter (edit attribute value)
  public void receiveCandy(Candy candy) {
    Candy[] newCandies = new Candy[this.candies.length + 1];
    for (int i; i < this.candies.length; i++) {
      newCandies[i] = this.candies[i];
    }
    newCandies[this.candies.length] = candy;
    this.candies = newCandies;
  }
}


////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// public class Student {
// private int id;
// private Candy[] candies;

// public Student(int id) {
// this.id = id;
// this.candies = new Candy[0];
// }

// public void receiveCandy(Candy candy) {
// Candy[] newCandies = new Candy[this.candies.length + 1];
// for (int i; i < this.candies.length; i++) {
// newCandies[i] = this.candies[i];
// }
// newCandies[this.candies.length] = candy;
// this.candies = newCandies;
// }

// public int getId() {
// return this.id;
// }

// public Candy[] getCandies() {
// return this.candies;
// }

// public int getNumOfCandies() {
// return this.candies.length;
// }
// }
