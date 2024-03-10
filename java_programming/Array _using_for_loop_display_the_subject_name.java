public class Main {
    
    public static void displayFavouriteSubjects(String studentName, String[] subjects) {
        System.out.println("Three favorite subjects of " + studentName + " are:");
        
        for (int i = 0; i < 3 ; i++) {
            System.out.println(subjects[i]);
           
        }
    }

    public static void main(String[] args) {
        String studentName = "Sathish Kumar";
        String[] subjects = {"Tamil", "English", "Computer Science", "Maths", "Biology"};
        
        displayFavouriteSubjects(studentName, subjects);
    }
}
