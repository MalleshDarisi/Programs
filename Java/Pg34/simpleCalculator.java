import java.util.*;

public class simpleCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean proceedCalculate = true;

        while (proceedCalculate) {
            displayMenu();
            int choice = scanner.nextInt();
            if (choice == 5){
                System.out.println("Exiting !!! Bye ...");
                    break;
            }       

            System.out.println("Enter the First Number :");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the Second Number :");   
            double num2 = scanner.nextDouble(); 

            double result;
            switch(choice){
                case 1: 
                    result = add(num1, num2);
                    System.out.println("Result :" +result);
                    break;
                case 2: 
                    result = subtract(num1, num2);
                    System.out.println("Result :" +result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result :" + result);
                    break;
                case 4:
                    if(num2 != 0){
                        result = divide(num1, num2);
                        System.out.println("Result :" +result);
                    } else{
                        System.out.println("ERROR !!! Division by zero is not allowed. ");
                    }
                    break;
                default:
                System.out.println("Invalid Choice. Please select the correct option.");
                    
            }

            System.out.println("Do you want to perform another calculation ? (Yes/No): ");
            String res = scanner.next();
            if (!res.equalsIgnoreCase("yes")){
                proceedCalculate = false;
                System.out.println("Exiting the calculator. Good Bye !!!");
            }            
        }
        scanner.close();
    }

    public static void displayMenu(){
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static double add(double a, double b){
        return a + b;
    }
    
    public static double subtract(double a, double b){
        return a - b;
    }

    public static double multiply(double a, double b){
        return a * b;
    }
    
    public static double divide(double a, double b){
        return a / b;
    }
    
}
