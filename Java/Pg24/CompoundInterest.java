import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Principle amount: ");
        double pr = scanner.nextDouble();
        System.out.println("Enter the annual interest rate in % :");
        double rate = scanner.nextDouble();
        System.out.println("Enter the number of times interest is compund per year: ");
        int n = scanner.nextInt();
        System.out.println("Enter the time in years: ");
        int t = scanner.nextInt();

        scanner.close();

        rate = rate/100;

        double A = pr * Math.pow(1+ rate/n , n*t );

        System.out.println("The compound Interest: " + A);
    }
}
