package exercises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DataStructureExercise {
  public static void main(String[] args) {
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    ArrayList<Integer> numbers = new ArrayList<>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    for (int i = 1; i < 6; i++)
      numbers.add(i * 10);
    // 1c. Print all the elements in the list.
    System.out.println(numbers);
    // 1d. Remove the number 30 from the list.
    numbers.remove(2);
    // 1e. Print the size of the list.
    System.out.println(numbers.size());

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: "Apple", "Banana", "Mango", and
    // "Orange".
    ArrayList<String> fruits = new ArrayList<>();
    String[] fruitsStr = new String[] {"Apple", "Banana", "Mango", "Orange"};
    for (String f : fruitsStr)
      fruits.add(f);
    // 2b. Check if "Grapes" exists in the list.
    System.out.println(fruits.contains("Grapes"));
    // 2c. If it doesn’t exist, add it to the list.
    if (!fruits.contains("Grapes"))
      fruits.add("Grapes");
    // 2d. Update "Mango" to "Peach".
    fruits.set(2, "Peach");
    // 2e. Print the final list.
    System.out.println(fruits);

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    ArrayList<Integer> q3 = new ArrayList<>();
    q3.add(10);
    q3.add(20);
    q3.add(10);
    q3.add(30);
    q3.add(40);
    q3.add(20);
    q3.add(50);
    // System.out.println(q3);
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> q3Hs = new HashSet<>(q3);
    // 3c. Print the list after removing duplicates.
    System.out.println(q3Hs);


    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet<String> q4 = new HashSet<>();
    q4.add("USA");
    q4.add("India");
    q4.add("China");
    q4.add("Japan");
    // 4b. Add "Canada" to the set.
    q4.add("Canada");
    // 4c. Add "India" again. Print the result.
    System.out.println(q4.add("India"));
    // 4d. Print all elements in the set.
    System.out.println(q4);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> q5 = new HashSet<>();
    for (int i = 1; i < 6; i++)
      q5.add(i * 1.1);
    System.out.println(q5);
    // 5b. Check if the set contains the number 3.3
    // 5c. Remove the number 2.2 from the set.
    // 5d. Print the size of the set.

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    // 6c. Set 2: 30, 40, 50, 60
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    // 7b. Convert the HashSet to an ArrayList.
    // 7c. Print the converted list.

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // 8b. Iterate over the ArrayList and print each student's details.
    // 8c. Remove the student Bob.
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // 8e. Create another ArrayList to store student with name starts with 'A'

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    // 9b. Find the common students of the two sets
    // 9c. Print the result.

  }

  public static class Student {
    private int id;
    private String name;

    // Constructor
    // getter, setter, etc.

    public Student(int id, String name) {
      this.id = id;
      this.name = name;
    }

    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }
  }
}
