import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Please enter year");
     int leapYear = scanner.nextInt();

     if(leapYear % 4 == 0){
        System.out.println(leapYear +" is a leap year");
     }else{
        System.out.println(leapYear + " is not a leap year");
     }

     
    
    }
}
