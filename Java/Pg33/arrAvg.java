import java.util.*;
public class arrAvg {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Size of the array must be greater than 0.");
            return;
        }

        System.out.println("Enter the array elements : ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        int sum = 0;

        for(int i = 0; i < size; i++){
            sum += arr[i];
        }

        double avg = (double) sum / size;

        System.out.format("The required Average is : %.2f", avg);


        
    }
    

}
