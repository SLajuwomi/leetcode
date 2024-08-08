package DSA.src.linkedlists;

public class LinkedList {
  private Node head;
  private Node tail;
  private int length;

  class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
    }
  }

  public LinkedList(int value) {

    Node newNode = new Node(value);
    head = newNode;
    tail = newNode;
    length = 1;
  }

  public void printList() {
    Node temp = head;
    Node last = tail;
    while (temp != null) {
      System.out.println(temp.value);
      System.out.println(last.value);
      temp = temp.next;
    }
  }

  public void getHead() {
    System.out.println("Head: " + head.value);
  }

  public void getTail() {
    System.out.println("Tail: " + tail.value);
  }

  public void getLength() {
    System.out.println("Length: " + length);
  }

  public void append(int value) {
    Node newNode = new Node(value);
    if (head != null) {
      tail.next = newNode;
      tail = newNode;

    } else {
      head = newNode;
      tail = newNode;
    }
    length++;
  }

}
