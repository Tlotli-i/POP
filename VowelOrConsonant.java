import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter character");
       char ch = scanner.next().charAt(0);
      
       if("AEIOUaeiou".indexOf(ch) != -1){
        System.out.println(ch + " is vowel");
       }else{
        System.out.println(ch + " is a consonant");
       }
    }
}
