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
    while (temp != null) {
      System.out.println(temp.value);
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

  public Node removeLast() {
    if (length == 0)
      return null;

    Node temp = head;
    Node pre = head;

    while (temp.next != null) {
      pre = temp;
      temp = temp.next;
    }

    tail = pre;
    tail.next = null;
    length--;

    if (length == 0) {
      head = null;
      tail = null;
    }

    return temp;
  }

  public void prepend(int value) {
    Node newNode = new Node(value);

    if (length == 0) {
      head = newNode;
      tail = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
    length++;

  }

  public Node removeFirst() {
    if (length == 0)
      return null;
    Node temp = head;
    head = tail;
    temp.next = null;
    length--;
    if (length == 0) {
      tail = null;
    }
    return temp;
  }

  public Node get(int index) {
    if (index < 0 || index >= length) {
      return null;
    }

    Node temp = head;
    for (int i = 0; i < index; i++) {
      temp = temp.next;
    }
    return temp;
  }

  public boolean set(int index, int value) {
    Node temp = get(index);
    if (temp != null) {
      temp.value = value;
      return true;
    }
    return false;
  }

  public boolean insert(int index, int value) {
    if (index < 0 || index > length)
      return false;
    if (index == 0)
      prepend(value);
    if (index == length)
      append(value);
    Node newNode = new Node(value);
    Node temp = get(index - 1);
    newNode.next = temp.next;
    temp.next = newNode;
    length++;
    return true;
  }

  public Node remove(int index) {
    if (index < 0 || index >= length)
      return null;
    if (index == 0)
      removeFirst();
    if (index == length - 1)
      removeLast();

    Node prev = get(index - 1);
    Node temp = prev.next;
    prev.next = temp.next;
    temp.next = null;
    length--;
    return temp;
  }

  public void reverse() {
    Node temp = head;
    head = tail;
    tail = temp;
    Node before = null;
    Node after = temp.next;
    for (int i = 0; i < length; i++) {
      after = temp.next;
      temp.next = before;
      before = temp;
      temp = after;
    }
  }

  public Node findMiddleNode() {
    if (length == 0)
      return null;
    if (length == 1)
      return head;
    Node fast = head;
    Node slow = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    if (length / 2 == 0)
      return slow.next;
    return slow;
  }

  public boolean hasLoop() {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow)
        return true;
    }

    return false;
  }

  public Node findKthFromEnd(int k) {
    if (length < k)
      return null;
    Node slow = head;
    Node fast = head;
    for (int i = 0; i < k; i++) {
      if (fast == null)
        return null;
      fast = fast.next;
    }
    while (fast != null) {
      slow = slow.next;
      fast = fast.next;

    }
    return slow;
  }

  public void partitionList(int x) {
    Node lesser = new Node(0);
    Node greater = new Node(0);
    Node lesserTail = lesser;
    Node greaterTail = greater;

    Node temp = head;

    while (temp != null) {
      if (temp.value < x) {
        lesserTail.next = temp;
        lesserTail = lesserTail.next;
      } else {
        greaterTail.next = temp;
        greaterTail = greaterTail.next;
      }

      temp = temp.next;
    }

    lesserTail.next = greater.next;
    greaterTail.next = null;

    head = lesser.next;

    return;
  }

  public void removeDuplicates() {
    if (head == null)
      return;
    // Node current = head;
    Node point1 = head;

    // check if pointers are at end of list to avoid Null Pointer Exception
    while (point1 != null) {
      Node prev = point1;
      Node point2 = point1.next;
      while (point2 != null) {
        // When duplicate is found
        if (point1.value == point2.value) {
          prev.next = point2.next;
          length--;
        } else {
          // move previous pointer only if no duplicate found
          prev = point2;
        }
        point2 = point2.next;
      }
      point1 = point1.next;
    }
  }

  public int binaryToDecimal() {
    Node current = head;
    int num = 0;
    while (current != null) {
      num = num * 2 + current.value;
      current = current.next;
    }
    return num;
  }

  public void reverseBetween(int m, int n) {
    if (head == null)
      return;
    Node dummy = new Node(0);
    Node dummyTail = dummy;
    Node current = head;
    int i = 0;
    while (i < m) {
      current = current.next;
      // System.out.println(current.value);
      i++;
      // System.out.println("First loop:" + i);
    }
    while (i <= n) {
      dummyTail.next = current;
      dummyTail = dummyTail.next;
      current = current.next;
      // System.out.println(current.value);
      i++;
      // System.out.println("Second loop:" + i);
    }
    Node temp = dummy.next;
    dummy.next = dummyTail;
    dummyTail = temp;
    Node before = null;
    Node after = temp.next;
    while (temp.next != null) {
      after = temp.next;
      temp.next = before;
      before = temp;
      temp = after;
    }
    dummyTail.next = current;
    head.next = dummy.next;
  }
}
