import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoStreamMap {

  public static class Employee {
    private String department;
    private String name;
    private int salary;

    public Employee(String department, String name, int salary) {
      this.department = department;
      this.name = name;
      this.salary = salary;
    }

    public String getDepartment() {
      return this.department;
    }

    public String getName() {
      return this.name;
    }

    public int getSalary() {
      return this.salary;
    }

    @Override
    public String toString() {
      return "Employee(" //
          + "name:" + this.name //
          + ",dept:" + this.department //
          + ",salary:" + this.salary //
          + ")";
    }
  }

  public static void main(String[] args) {
    List<Employee> employees = Arrays.asList(new Employee("IT", "John", 21000) //
        , new Employee("HR", "Sally", 19000) //
        , new Employee("IT", "Mary", 35000) //
        , new Employee("HR", "Dicky", 28000) //
        , new Employee("MK", "Leo", 34000) //
        , new Employee("IT", "Oscar", 39000) //
    );
    Map<String, List<Employee>> employeeMap = employees.stream()
        .collect(Collectors.groupingBy(e -> e.getDepartment()));
    System.out.println(employeeMap);

    Map<String, Integer> salaryMap = employees.stream() //
        .collect(Collectors.groupingBy(e -> e.getDepartment(),
            Collectors.summingInt(e -> e.getSalary())));
    System.out.println("Grouping by department -> salary");
    System.out.println("HR total salary: " + salaryMap.get("HR")); // 47000
    System.out.println("IT total salary: " + salaryMap.get("IT")); // 95000

    Map<Boolean, List<Employee>> salaryGroup = employees.stream() //
        .collect(Collectors.partitioningBy(e -> e.getSalary() >= 30000));
    System.out.println("Partition by salary >= 30000");
    System.out.println(salaryGroup);

    Map<Boolean, List<Employee>> nameGroup = employees.stream() //
        .collect(Collectors.partitioningBy(
            e -> e.getName() == "Oscar" || e.getName() == "Dicky"));
    System.out.println("Partition by names Oscar or Dicky, and others");
    System.out.println(nameGroup);


  }
}
