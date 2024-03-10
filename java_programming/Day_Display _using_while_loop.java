public class Main {
    
    public static void displayDays(String[] days) {
        int j=0;
       while(j<days.length){
        System.out.println("Day " + (j+1) + " - " + days[j]);
            j++;
  }
    }
      public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
             displayDays(days);
     
    }
}        
