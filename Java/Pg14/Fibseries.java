import java.util.Scanner;

public class Fibseries {
    public static void main(String[] Args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print(first+" "+second+" ");
        for(int i = 0; i < n - 2; i++ ){ 
            int next = first + second;
            System.out.print(next+" ");
            first = second;
            second = next;
        }
    }
}
