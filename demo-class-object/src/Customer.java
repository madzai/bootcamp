// ! One to Many

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


  public Order getOrder(int orderId) {
    // self
    // Order theOrder = new Order();
    // for (int i = 0; i < this.orders.length; i++) {
    // if (this.orders[i].getId() == orderId)
    // theOrder = this.orders[i];
    // }
    // return theOrder;

    // Lesson
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
