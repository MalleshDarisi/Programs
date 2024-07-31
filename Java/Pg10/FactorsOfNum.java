import java.util.*;
public class FactorsOfNum {
public static void main(String[] args){
    @SuppressWarnings("resource")
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int n = scanner.nextInt();

    if(n == 0 || n == 1){
        System.out.println("The factorial of a given number is 1");
    } else{
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.print(i +" ");
            }
        }
    }

}
}
