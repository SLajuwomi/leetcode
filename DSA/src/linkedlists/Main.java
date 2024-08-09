package DSA.src.linkedlists;

public class Main {
  public static void main(String[] args) {

    LinkedList myLinkedList = new LinkedList(1);
    myLinkedList.append(2);

    System.out.println(myLinkedList.removeLast().value);
    System.out.println(myLinkedList.removeLast().value);
    System.out.println(myLinkedList.removeLast());

  }
}
