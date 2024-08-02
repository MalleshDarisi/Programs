import java.util.*;
public class SimIntrest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of Principle :");
        double p = scanner.nextDouble();
        System.out.println("Enter the value of Rate of Interest :");
        double r = scanner.nextDouble();
        System.out.println("Enter the time in years : ");
        double t = scanner.nextDouble();

        scanner.close();

        double simpleInterest = (p * t * r) / 100;

        System.out.println("The Simple Interest : " +simpleInterest);
    }
}
