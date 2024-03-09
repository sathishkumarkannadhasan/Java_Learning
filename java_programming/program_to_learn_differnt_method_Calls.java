public class Main {
	//4 User defined methods are Created in this cls
    
	// this methods Accepts 2 integers as parameters
	// this methods returns an integer
    public static int add(int a, int b) {
    System.out.println("inside add method");
        return a + b;
    }
    
    // this methods Accepts 2 integers as parameters
	// this methods returns an integer
    public static int multiply(int a, int b) {
        return a * b;
    }
    
	// this methods Accepts 2 integers as parameters
	// this methods returns an integer
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    //this method accepts two strings as parameters
    // this method returns nothing
   public static void displayName(String firstName, String lastName){
   System.out.println(firstName + lastName);
  
   }
  
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        
        displayName("jaya" , "kumar");// calling dispalyName method by passing 2                                              Strings
        
        String firstName = "sathish"; //We are intializing String variable
        String lastName = "kumar";//We are intializing String variable
        
        displayName(firstName,lastName);// calling dispalyName method by passing 2 											String variables
        
        displayName("Raj", "Kumar"); // calling dispalyName method by passing 2                                              Strings
        
       // String fullName = displayName("Selva","Kumar"); / this is not allowed since the method returns nothing
       
        int subtractionResult = subtract(i, j); // Storing the  Returned integer in a 												integer variable
        
        System.out.println("Subtraction: " + subtractionResult); // Dispalying the       												integer variable that is having the 												result
       
        System.out.println("Addition: " + add(8,5)); //Calling add method directly 													inside print statement to display the 												  Returned integer 
        
        System.out.println("Multiplication: " + multiply(9,3));//Calling multiply 													method directly inside print statement 													to display the  Returned integer

        
    }
}