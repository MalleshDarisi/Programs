import java.util.*;

public class PrimeOrNot {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = scanner.nextInt();
        boolean flag = true;

        if(n == 0 || n == 1){
            System.out.println("Not a Prime Number");
        } else{
            for(int i = 2; i <= n-1; i++){
                if(n % i == 0){
                    flag = false;
                }
            }
        }

        if(flag == true){
            System.out.println(n +" is prime number");
        }else{
            System.out.println(n +" is Not a Prime number");
        }
        
    }
}



