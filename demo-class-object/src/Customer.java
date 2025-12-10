public class Customer {
  private Order[] orders;

  public Customer() {
    this.orders = new Order[0];
  }

  public void add(Order newOrder) {
    Order[] newOrders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      newOrders[i] = this.orders[i];
    }
    newOrders[newOrders.length - 1] = newOrder;
    this.orders = newOrders;
  }

  public Order[] getOrders() {
    return this.orders;
  }

  // getOrder (int orderId)
  public Order getOrder(int orderId) {
    Order theOrder = new Order();
    for (int i = 0; i < this.orders.length; i++) {
      if (this.orders[i].getId() == orderId)
        theOrder = this.orders[i];
    }
    return theOrder;
  }

  public static void main(String[] args) {
    // customer
    // order
    // getOrders
    // ! setOrders



  }
}
