import java.util.*;

public class decToBin {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int input = scanner.nextInt();
        int[] bin = new int[1000];
        scanner.close();

            int i = 0; 
            while(input > 0)
            {
                bin[i] = input % 2;
                input = input / 2;
                i++;
            }
            
        
        for (int j = i -1; j >=0; j--){
            System.out.print( bin[j] );
        }
        
        
    }
}
