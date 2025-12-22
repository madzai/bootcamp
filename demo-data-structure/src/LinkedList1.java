public class LinkedList1 {
  private Node head;

  public LinkedList1() {

  }

  public void add(String name) {
    Node newNode = new Node(name);
    if (this.head == null)
      this.head = newNode;
    Node tempHead = head;
    while (tempHead.next() != null) {
      tempHead = tempHead.next();
    }
    tempHead.setNext(newNode);
  }

  public int size() {
    int count = 0;
    Node tempHead = head;
    while (tempHead != null) {
      count++;
      tempHead = tempHead.next();
    }
    return count;
  }

  public boolean isEmpty() {
    return this.head == null;
  }

  public boolean contains(Node node) {
    Node n = this.head;
    while (n != null) {
      if (n.equals(node))
        return true;
      n = n.next();
    }
    return false;
  }

  public static void main(String[] args) {
    LinkedList1 lt1 = new LinkedList1();
    lt1.add("John");
    lt1.add("Sally");
    lt1.add("Leo");
    System.out.println(lt1.size());
  }
}
