public class Node {
  private Node next;
  private String name;

  public Node(String name) {
    this.name = name;
  }

  public Node next() {
    return this.next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  @Override
  public boolean equals(Object o) {

  }
}
