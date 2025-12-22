public class Node {
  private Node next;
  private String name;

  public Node(String name) {
    this.name = name;
  }

  public Node getNext() {
    return this.next;
  }

  // setNext
  public void setNext(Node next) {
    this.next = next;
  }
}
