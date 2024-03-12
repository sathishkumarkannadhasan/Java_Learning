public class Main {

static int x =50;
  public static void main(String[] args) {
 // System.out.println(x);


    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x
System.out.println(x);
      int x = 100;
      System.out.println(x);

      // Code here CAN use x

    } // The block ends here
      System.out.println(x);

  // Code here CANNOT use x
  
  }
}