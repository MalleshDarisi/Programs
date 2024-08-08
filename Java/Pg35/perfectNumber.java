import java.util.*;

public class perfectNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for(int i = 1; i <= n/2; i++){
            if (n % i == 0){
                sum += i;

            }
        }

        if(sum == n){
            System.out.println("Its perfect number" );
        }else{
            System.out.println("Its not the perfect number");
        }
        scanner.close();
    }
    
}
