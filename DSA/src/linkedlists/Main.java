package DSA.src.linkedlists;

public class Main {
  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(4);

    myLinkedList.getHead();
    myLinkedList.getTail();
    myLinkedList.getLength();
    myLinkedList.printList();

    myLinkedList.append(3);
    myLinkedList.getHead();
    myLinkedList.getTail();
    myLinkedList.getLength();
    myLinkedList.printList();
  }
}
