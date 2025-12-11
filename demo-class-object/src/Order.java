import java.math.BigDecimal;
import java.math.RoundingMode;

// ! Order Class
public class Order {
  // id
  private int id;
  private Item[] items;
  // private String address;
  // private double price;

  // ! give up empty constructor: new Order(); -> error
  public Order(int id) {
    this.id = id;
    this.items = new Item[0];
  }

  // presentation
  public double amount() {
    BigDecimal bdTotal = BigDecimal.ZERO;
    for (Item item : this.items) {
      bdTotal = bdTotal.add(BigDecimal.valueOf(item.amount()));
    }
    return bdTotal.doubleValue();
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addItem(Item newItem) {
    Item[] newItems = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++)
      newItems[i] = this.items[i];
    newItems[newItems.length - 1] = newItem;
    this.items = newItems;
  }

  public int getId() {
    return this.id;
  }

  public Item[] getItems() {
    return this.items;
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

    // Test
    BigDecimal bdTotal = BigDecimal.valueOf(0.2);
    bdTotal = bdTotal.add(BigDecimal.valueOf(0.1));
    double bd = bdTotal.setScale(1, RoundingMode.HALF_DOWN).doubleValue();
    System.out.println(bdTotal);
    System.out.println(bd);

  }

}
