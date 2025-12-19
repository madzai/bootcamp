import java.util.ArrayList;
import java.util.Arrays;

public class DemoPassByReference {
  public static void main(String[] args) {
    System.out.println(sum(10, 3)); // 103
    int x = 15;
    System.out.println(sum(x, 6)); // 106
    System.out.println(x); // 15

    // ! Array (Pass by reference)
    int[] arr = new int[] {-9, -100, 73};
    addOne(arr);
    // arr = addOne(arr);
    System.out.println(Arrays.toString(arr)); // [-8, -99, 74]

    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Sue"));

    doubleTheCats(cats);
    System.out.println(cats);

  }

  // ! Pass By Value: All Primitives, String, All Wrapper Classes
  // ! Pass By Reference: Array, and all other classes

  // ! Primitive
  public static int sum(int x, int y) { // ! Pass by value (a copy of value)
    x = 100;
    return x + y;
  }

  public static void addOne(int[] arr) { // ! Pass by reference
    // both the arr in addOne and the arr in main() are pointing to the same object
    if (arr == null)
      return;
    for (int i = 0; i < arr.length; i++) {
      arr[i]++;
    }
  }

  // not needed because of pass by reference
  // public static int[] addOne(int[] arr) {
  // if (arr == null)
  // return null;
  // for (int i = 0; i < arr.length; i++) {
  // arr[i]++;
  // }
  // return arr;
  // }

  // ! variable
  public void doubleTheCats(ArrayList<Cat> cats) { // ! Pass By Reference
    ArrayList<Cat> doubleCats = new ArrayList<>();
    for (Cat cat : cats) { // lock arraylist
      // cat.setName("John"); // can't change the elements in for each loop
      doubleCats.add(cat);
      doubleCats.add(cat);
    }
    System.out.println("doubleTheCats: " + doubleCats);
    cats = doubleCats; // ! Problem
  }
}
