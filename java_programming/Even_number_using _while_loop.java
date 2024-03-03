public class Main {
  public static void main(String[] args) {
    int i = 0;
    while (i <= 10) {
     System.out.println("inside while loop");
     System.out.println(" i = " + i + "reminder =" + i % 2);
      if (i % 2 == 0) {
        System.out.println("i=" + i);
      }
      i++;
    }
  }
}