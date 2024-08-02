import java.util.Scanner;

public class VowelsString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String input = scanner.nextLine();
        scanner.close();
        int count = 0;

        String vowels = "AEIOUaeiou";

        for (int i = 0; i <input.length(); i++){
            if (vowels.indexOf(input.charAt(i)) != -1 ){
                count++;
            } 
        }
        System.out.println("The vowels count is: " +count); 
    }
}
