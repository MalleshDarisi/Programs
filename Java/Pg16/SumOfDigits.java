import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scanner.nextInt();
        int sum = 0, r = 0;

        while(n > 0){
            r = n % 10;
            sum += r;
            n = n / 10;
        }

        System.out.println("The sum of the given digit is " + sum);
    }
}
