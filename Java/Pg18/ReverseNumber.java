import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scanner.nextInt();
        int rev = 0;

        while(n > 0){
            int flag = n % 10;
            rev = rev * 10 + flag; 
            n = n/10;
        }

        System.out.print(rev);

    }
}
