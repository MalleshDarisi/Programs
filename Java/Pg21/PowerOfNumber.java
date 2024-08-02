import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = scanner.nextInt();
    
    double result = Math.pow(n,n);
    System.out.println("The power of the number is : " +result);
    }
} 

