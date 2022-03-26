public class Main {
  public static void main(String[] args) {
    int n = 5;
    System.out.format("Soal 4.A %n");
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.format("%d ", i);
      }
      System.out.println(" ");
    }
    System.out.format("%n%nSoal 4.B %n");
    for (int i = 1; i <= n; i++) {
      for (int j = i; j >= 1; j--) {
        System.out.format("%d ", j);
      }
      System.out.println(" ");
    }
  }
}
