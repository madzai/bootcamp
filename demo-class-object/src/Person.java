import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {
  // height, weight
  private double height;
  private double weight;

  // BMI = weight (kg) / height (m) ^2
  public double bmi() {
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2.0)), 2,
            RoundingMode.HALF_UP)
        .doubleValue();
  }

  public String bmiRating() {
    double bmi = this.bmi();
    if (bmi() < 18.5) {
      return "Under Weight";
    } else if (bmi < 25.0) {
      return "Normal Weight";
    } else if (bmi < 30.0) {
      return "Over Weight";
    } else if (bmi < 35.0) {
      return "Obese Type I";
    } else if (bmi < 40.0) {
      return "Obese Type II";
    } else {
      return "Obese Type III";
    }
  }

  // ! void -> No return
  public void setHeight(double height) {
    this.height = height;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHeight() {
    return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setHeight(1.82);
    p1.setWeight(79);
    System.out.println(p1.getHeight());
    System.out.println(p1.getWeight());

    Person[] persons = new Person[2];
    persons[0] = p1;
    persons[1] = new Person();
    persons[1].setHeight(1.65);
    persons[1].setWeight(50);

    p1.setWeight(72);

    for (int i = 0; i < persons.length; i++) {
      System.out
          .println("Person " + (i + 1) + ": height = " + persons[i].getHeight()
              + " m, weight = " + persons[i].getWeight() + " kg, BMI = "
              + persons[i].bmi() + " (" + persons[i].bmiRating() + ")");
    }

    // System.out.println(Math.pow(2, 2));

  }

}
