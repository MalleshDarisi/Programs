import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to check");
        int year = scanner.nextInt();
        scanner.close();

        if((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
            System.out.println("The Given year is Leap year");
        }else{
            System.out.println("The year is not leap year");
        }

        
        
    }
    
}
