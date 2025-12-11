import java.math.BigDecimal;
// import java.math.RoundingMode;

public class Item {
  private double price;
  private double quantity;

  public Item(double price, double quantity) {
    this.price = price;
    this.quantity = quantity;
  }

  public double amount() {
    return BigDecimal.valueOf(this.price)
        .multiply(BigDecimal.valueOf(this.quantity)).doubleValue();
  }

  public double getPrice() {
    return this.price;
  }

  public double getQuantity() {
    return this.quantity;
  }

  public static void main(String[] args) {
    // 99.9 x 2
    // 10.5 x 6
    Item item1 = new Item(99.9, 2);
    Item item2 = new Item(10.5, 6);
    Item item3 = new Item(100000.0, 10);

    System.out.println("Item 1: price " + item1.getPrice() + " quantity "
        + item1.getQuantity() + " -> amount = " + item1.amount());
    System.out.println("Item 2: price " + item2.getPrice() + " quantity "
        + item2.getQuantity() + " -> amount = " + item2.amount());


    // order1.amount()
    Order order1 = new Order(1);
    order1.addItem(item1);
    System.out.println("Order1 amount: " + order1.amount());


    // // customer1
    // // c1.getOrderAmount(1)
    Customer c1 = new Customer();
    c1.add(order1);
    System.out.println("Customer1's Order1 amount: " + c1.getOrderAmount(1));
    System.out.println("Customer1 is VIP? " + c1.isVip());

    Order order2 = new Order(2);
    order2.addItem(item3);
    c1.add(order2);
    System.out.println("Customer1's Order2 amount: " + c1.getOrderAmount(2));
    System.out.println("Customer1 is VIP? " + c1.isVip());


  }
}
