package DSA.src.linkedlists;

public class Main {
  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(1);
    myLinkedList.append(0);
    myLinkedList.append(1);
    // myLinkedList.append(1);
    // myLinkedList.append(4);
    // myLinkedList.append(2);
    // myLinkedList.append(5);

    System.out.println(myLinkedList.binaryToDecimal());

    myLinkedList.printList();

  }
}
