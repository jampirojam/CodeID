public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
    	System.out.format(" %d ", i+1);
    	for (int j = 1; j <= i; j++) {
       	System.out.format(" %d ", i+1+j);
      }
      System.out.println(" ");
    }
  }
}
