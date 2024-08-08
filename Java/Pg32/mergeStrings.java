import java.util.*;

public class mergeStrings {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First String: ");
        String str1 = scanner.nextLine();
        int length1 = str1.length();
        System.out.println("Enter the Second String: ");
        String str2 = scanner.nextLine();
        int length2 = str2.length();

        int minLen = Math.min(length1, length2);

        StringBuilder merged = new StringBuilder();


        for(int i = 0; i < minLen; i++){
            merged.append(str1.charAt(i));
            merged.append(str2.charAt(i));            
        }

        if(length1 > minLen){
            merged.append(str1.substring(minLen));
        }else{
            merged.append(str2.substring(minLen));
        }

        scanner.close();

        System.out.println("The output is: " +merged);



    }
    
}
