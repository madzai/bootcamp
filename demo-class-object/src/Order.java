public class Order {
  // id
  private int id;
  private String[] items;
  private String address;
  private double price;


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

}
