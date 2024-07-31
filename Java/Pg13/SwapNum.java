import java.util.Scanner;

public class SwapNum {
    public static void main(String[] Args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int first = scanner.nextInt();
        System.out.println("Enter the second Number : ");
        int second = scanner.nextInt();
        int temp;

        temp = first;
        first= second;
        second = temp;

        System.out.println("Updated numbers are first: "+ first +" second "+ second);


    }
}
