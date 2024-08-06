import java.util.Scanner;

public class vowelCons {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to check: ");
        char ch = scanner.next().charAt(0);
        String vowels = "aeiouAEIOU";
        scanner.close();

        if(vowels.indexOf(ch) != -1){
            System.out.println("The given character is Vowel");

        }else{
            System.out.println("The given character is Consonents");
        }
    }
}
