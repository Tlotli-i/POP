public class MethodThatCalculatesTheGCDOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 56;
        int num2 = 98;
        int gcd = calculateGCD(num1, num2);
        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
