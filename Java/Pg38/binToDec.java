import java.util.*;

public class binToDec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary Number :");
        Long input = sc.nextLong();
        int decimal = 0, i = 0;
        long rem;
        sc.close();

        while(input != 0 ){
            rem = input % 10;
            decimal += rem * Math.pow(2, i);
            input /= 10;
            ++i; 
        }

        System.out.println("The decimal Number is : " +decimal);
    }
    
}
