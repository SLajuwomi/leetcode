
// Big O(n) -  As n grows, the number of operations grows - Proportional

public class Main {

  public static void printItems(int n) {
    for (int i = 0; i < n; i++) {
      System.out.println(i);
    }

    // Technically O(2n) but we drop constants for simplification
    for (int j = 0; j < n; j++) {
      System.out.println(j);
    }
  }

  // O(n^2) - Loop within a loop - most inefficient
  public static void doubleItems(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
      }
    }
    // Still O(n^2), we drop non dominant values
    for (int k = 0; k < n; k++) {
      System.out.println(k);
    }
  }

  // O(1) - As n grows, the number of operations stays the same - constant
  public static int addItems(int n) {
    return n + n + n;
  }

  // Divide and conquer - O(log n)
  // if 8 items in array, takes 3 splits to find an item

  // O(a + b)
  public static void differentInputs(int a, int b) {
    for (int i = 0; i < a; i++) {
      System.out.println(i);
    }

    // Technically O(2n) but we drop constants for simplification
    for (int j = 0; j < b; j++) {
      System.out.println(j);
    }
  }

  public static void main(String[] args) {
    // printItems(10);
    doubleItems(10);
    // System.out.println(addItems(2));
  }

}