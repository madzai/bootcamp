import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream2 {
  public static void main(String[] args) {
    // Peter, 2020-OCT-23, 15000.00
    // John, 2019-JAN-31, 23000.00
    // Mary, 2022-MAY-05, 37000.00
    // Leo, 2002-DEC-10, 58000.00
    List<Employee> employees = new LinkedList<>(List.of(//
        new Employee(1, "Peter", LocalDate.of(2020, 10, 23), 15000.00), //
        new Employee(2, "John", LocalDate.of(2019, 1, 31), 23000.00), //
        new Employee(3, "Mary", LocalDate.of(2022, 5, 5), 37000.00), //
        new Employee(4, "Leo", LocalDate.of(2002, 12, 10), 58000.00) //
    ));
    // System.out.println(employees);
    for (Employee employee : employees)
      System.out.println(employee);

    // ! Find all of their salary
    List<Double> salaries = employees.stream() //
        .map(e -> e.getSalary()) //
        .collect(Collectors.toList());
    System.out.println("\nSalaries: " + salaries);

    // ! Find all of their join dates
    List<LocalDate> joinDates = employees.stream() //
        .map(e -> e.getJoinDate()) //
        .collect(Collectors.toList());
    System.out.println("Join dates: " + joinDates);

    // ! Find the names of all employees who joined before 2020-JAN-01
    List<String> namesBefore2020 = employees.stream() //
        .filter(e -> e.getJoinDate().isBefore(LocalDate.of(2020, 1, 1))) //
        .map(e -> e.getName()) //
        .collect(Collectors.toList());
    System.out.println("Joined before 2020: " + namesBefore2020);

    // ! Find all employees with salary > 25000.00
    List<Employee> namesSalary25K = employees.stream() //
        .filter(e -> e.getSalary() > 25000) //
        .collect(Collectors.toList());
    System.out.println("Salary >25,000: \n" + namesSalary25K);

  }

  public static class Employee {
    private double salary;
    private LocalDate joinDate;
    private String name;
    private int id;

    public Employee(int id, String name, LocalDate joinDate, double salary) {
      this.id = id;
      this.name = name;
      this.joinDate = joinDate;
      this.salary = salary;
    }

    public double getSalary() {
      return this.salary;
    }

    public LocalDate getJoinDate() {
      return this.joinDate;
    }

    public String getName() {
      return this.name;
    }

    public int getId() {
      return this.id;
    }

    @Override
    public String toString() {
      return "Employee(" //
          + "id:" + this.id //
          + ",name:" + this.name //
          + ",joined:" + this.joinDate //
          + ",salary:" + this.salary //
          + ")";
    }
  }

}
