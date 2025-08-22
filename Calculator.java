import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        double num = scanner.nextDouble();
        System.out.println("Enter number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter operator (+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Sum: " + (num + num1)); 
            break;
             case '-': System.out.println("Difference: " + (num - num1)); 
            break;
             case '*': System.out.println("Product: " + (num * num1)); 
            break;
             case '/':
             if(num1 != 0){
                  System.out.println("Qoutient: " + (num / num1)); 
        
             }else {
                System.out.println("not divisible by zero");
      }
            break;
            default:  System.out.println("invalid operator");
        }



    }
}
