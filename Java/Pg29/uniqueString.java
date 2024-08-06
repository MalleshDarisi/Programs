import java.util.*;

public class uniqueString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string :");
        String input = scanner.nextLine();
        scanner.close();

        Set<Character> unique = new HashSet<>();
        
        for(char ch : input.toCharArray()){
            unique.add(ch);
        }

        System.out.println("The unique letters are :" + unique);
    }
    
}
