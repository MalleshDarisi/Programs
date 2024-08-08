import java.util.*;

public class numberTable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter the number :");
        int n = scanner.nextInt();
        scanner.close();
        
        for(int i = 1; i <= 20; i++){
            System.out.println(n + " * " + i +" = " +(n * i));
        }
    }
    
}
