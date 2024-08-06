// Big O(n)

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

  // O(n^2)
  public static void doubleItems(int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
      }
    }
  }

  public static void main(String[] args) {
    // printItems(10);
    doubleItems(10);
  }

}