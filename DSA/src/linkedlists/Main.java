package DSA.src.linkedlists;

public class Main {
  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(3);
    myLinkedList.append(2);
    myLinkedList.append(8);
    myLinkedList.append(5);
    myLinkedList.append(6);
    myLinkedList.append(9);
    myLinkedList.append(4);

    myLinkedList.partitionList(5);

    myLinkedList.printList();

  }
}
