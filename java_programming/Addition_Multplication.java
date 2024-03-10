public class Main {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
       return a * b;
    }
   public static void main(String[] args) {
        int i = 2;
        int j = 4;
        int result=i + j; 
        int multiplyResult = multiply(result, 5);
          System.out.println("Addition Result: " + result);
          System.out.println("Multiplication Result: " + multiplyResult);

  }
 }