import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Customer {

  private List<Address> addresses;

  public Customer() {
    this.addresses = new LinkedList<>();
  }

  public void add(Address address) {
    this.addresses.add(address);
  }

  public List<Address> getAddresses() {
    return this.addresses;
  }

  public static void main(String[] args) {
    Customer c1 = new Customer();
    c1.add(new Address("c1_a1_l1", "c1_a1_l2"));
    c1.add(new Address("c1_a2_l1", "c1_a2_l2"));

    Customer c2 = new Customer();
    c2.add(new Address("c2_a1_l1", "c2_a1_l2"));
    c2.add(new Address("c2_a2_l1", "c2_a2_l2"));
    c2.add(new Address("c2_a3_l1", "c2_a3_l2"));

    List<Customer> customers = new ArrayList<>();
    customers.add(c1);
    customers.add(c2);
    // System.out.println(customers.size());

    // ! Approach 1: FlatMap
    // Many Customers have many Addresses
    // ! Find addresses -> List<Address>
    List<Address> addresses = customers.stream() //
        .flatMap(e -> e.getAddresses().stream()) //
        // ! list.stream() for flatMap
        .collect(Collectors.toList());
    System.out.println(addresses);

    // ! Approach 2: Loop
    List<Address> addressList = new ArrayList<>();
    for (Customer customer : customers) {
      for (Address address : customer.getAddresses()) {
        addressList.add(address);
      }
    }
    System.out.println(addressList);

  }

}
