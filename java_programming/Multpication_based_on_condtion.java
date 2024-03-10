public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        int i = 5;
        int j = 5;
        int result = add(i, j);
        System.out.println("Addition Result: " + result);

        if (result >= 10) {
            result = multiply(result, 5);
            System.out.println("Sum is greater than or equal to  10");
            System.out.println("Multiplication Result: " + result);
        } else {
            result = multiply(result, 10);
            System.out.println("Sum is less than 10");
            System.out.println("Multiplication Result: " + result);
        }
    }
}