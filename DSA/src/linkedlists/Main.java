package DSA.src.linkedlists;

public class Main {
  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(11);
    myLinkedList.append(3);
    myLinkedList.append(23);
    myLinkedList.append(7);

    myLinkedList.remove(2);

    myLinkedList.printList();

  }
}
