public class LinkedList1 {
  private Node head;

  public LinkedList1(Node head) {
    this.head = head;
  }

  public void add(Node next) {
    this.head.setNext(next);
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public boolean contains(Node node) {
    Node n = this.head;
    while (n != null) {
      if (n.equals(node))
        return true;
      n = n.getNext();
    }
    return false;
  }
}
