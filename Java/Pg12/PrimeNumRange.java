import java.util.Scanner;

public class PrimeNumRange {
    public static void main(String[] Args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Starting Number : ");
        int start = scanner.nextInt();
        System.out.println("Enter the Ending Number : ");
        int end = scanner.nextInt();
        int flag = 0;

        if(start < end){
            for(int i = start; i <= end; i++ ){
                
                for(int j = 2; j < i; j++){
                    if(i % j == 0){
                        flag = 0;
                        break;
                    }else{
                        flag = 1;
                    }
                }
                if(flag == 1){
                    System.out.print(i+" ");
                }
            }
        }else{
            System.out.println("Start number should be less than end number");
        }
        

    }
}
