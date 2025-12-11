// ! One to Many
import java.math.BigDecimal;

public class Customer {
  private Order[] orders; // ! Object Reference

  public Customer() {
    this.orders = new Order[0];
  }

  public void add(Order newOrder) {
    // ! Step 1: create a new array with length + 1
    Order[] newOrders = new Order[this.orders.length + 1];
    // ! Step 2: copy original array elements to the new array
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    // ! Step 3: put the new element at the tail of the new array
    newOrders[newOrders.length - 1] = newOrder;
    // ! Step 4: Assign the new array object to object reference
    this.orders = newOrders;
  }

  public Order[] getOrders() {
    return this.orders;
  }

  // getOrder (int orderId)
  // ! Method signature: Method Name + parameter
  // OK
  // public Order getOrder(int order Id)
  // public Order getOrder(String order str)
  // Problem
  // public Order getOrder(int order Id)
  // public Order getOrder(int orderId Id)


  public double getOrderAmount(int orderId) {
    for (Order order : this.orders) {
      if (order.getId() == orderId)
        return order.amount();
    }
    return 0.0;
  }

  // Presentation
  // Vip: total order amount >= 100,000
  public boolean isVip() {
    BigDecimal total = BigDecimal.ZERO;
    for (Order order : this.orders)
      total = total.add(BigDecimal.valueOf(order.amount()));
    return total.doubleValue() >= 100_000;
  }

  public Order getOrder(int orderId) {
    for (Order o : this.orders) {
      if (o.getId() == orderId)
        return o;
    }
    return null;
  }

  public static void main(String[] args) {
    // customer
    // order
    // getOrders
    // ! setOrders



  }
}
