import java.util.*;
public class revStr {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to reverse: ");
        String str = scanner.nextLine();
        String revStr = "";
        scanner.close();

        for(int i = str.length() - 1; i >= 0 ; i--){
            revStr += str.charAt(i);
        }

        System.out.println("The reverse String is : " +revStr);
    }
}
