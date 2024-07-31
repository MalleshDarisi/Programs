import java.util.Scanner;

public class armStrongNum {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scanner.nextInt();
        int sum = 0;
        int len = String.valueOf(n).length();
        int temp = n;


        while(n > 0){
            int r = n % 10;
            sum += Math.pow(r, len);
            n = n/10;

        }

        if(temp == sum){
            System.out.println("It is armstrong number");
        }else{
            System.out.println("Not an armstrong number");
        }
    }
}
