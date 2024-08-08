import java.util.Scanner;

public class emptyReplace {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = scanner.nextLine();
        
        input = input.replaceAll(" ", "");

        System.out.println("the output without spaces: " + input);

        
        scanner.close();
        
    }
    
}
