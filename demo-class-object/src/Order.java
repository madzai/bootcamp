public class Order {
  // id
  private int id;
  private String[] items;
  private String address;
  private double price;

  // ! give up empty constructor: new Order(); -> error
  public Order(int id) {
    this.id = id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setItems(String[] items) {
    this.items = items;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getId() {
    return this.id;
  }

  public String[] getItems() {
    return this.items;
  }

  public String getAddress() {
    return this.address;
  }

  public double getPrice() {
    return this.price;
  }

  public static void main(String[] args) {
    Order o1 = new Order(1);
    Order o2 = new Order(2);

    // c1.add(o1);
    // New order object o1 (id = 1)
    // New Order array new Orders
    // copy old Orders elements to new Orders array
    // Put new Order object into new Orders array
    // c1's Orders array points to new Orders array (to replace old Orders array)

    Customer c1 = new Customer();
    c1.add(o1);
    c1.add(o2);
    System.out.println(c1.getOrder(1).getId());

  }

}
