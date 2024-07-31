import java.util.*;

public class NoOfDigits{
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int flag = 0;
        System.out.println("Enter the number : " );
        int num = scanner.nextInt();

        if(num == 0){
            flag = 1;
        }else{
            while(num > 0){
                num = num / 10;
                flag += 1;
            }
        }

        System.out.println("No of Digits are: " + flag);

    }
}