import java.util.Scanner;

public class YearsBefore100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = scanner.nextInt();
        int yearsOld = 100 - age;

        if(yearsOld > 0){
            System.out.println("Not 100 yet");
        }else if(yearsOld == 0) {
           System.out.println("You're officialy a fossil"); 
        }else{
            System.out.println("You should be dust by now");
        }
        System.out.println("You have " + yearsOld + " years before you're 100 years old");
    }
}
