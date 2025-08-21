import java.util.Scanner;

public class CharToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter character");
        char ch = scanner.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("ASCII Value:" + ch);
        System.out.println("ASCII Value:" + ascii);


    }
}
