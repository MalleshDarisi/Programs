import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scanner.nextInt();
        int flag1 = n;
        int rev = 0;

        while(n > 0){
            int flag = n % 10;
            rev = rev * 10 + flag; 
            n = n/10;
        }

        if(flag1 == rev){
            System.out.println("The Given Number is the Palindrome");
        }else{
            System.out.println("Number is Not  Palindrome");
        }
    }
}
