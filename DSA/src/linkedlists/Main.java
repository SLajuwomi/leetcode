package DSA.src.linkedlists;

public class Main {
  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(11);
    myLinkedList.append(23);
    myLinkedList.append(7);

    System.out.println(myLinkedList.set(5, 12));

    myLinkedList.printList();

  }
}
