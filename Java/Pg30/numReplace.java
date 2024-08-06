import java.util.*;

public class numReplace {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of an array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements : ");
        for (int i = 0; i < size; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the number to replace in array: ");
        int replace = scanner.nextInt();
        System.out.println("With what number it need to replace: ");
        int replacedWith = scanner.nextInt();

        scanner.close();

        for (int i = 0; i < size; i++ ){
            if(arr[i] == replace){
                arr[i] = replacedWith;

            }
        }

        for (int i = 0; i < size; i++){
            System.out.print(arr[i] +" ");
        }        
    }
    
}
