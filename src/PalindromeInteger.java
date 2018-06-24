import jdk.nashorn.internal.parser.Scanner;

public class PalindromeInteger {
    public static void main(String[] args) {
        int number;
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter number: ");
        number = scanner.nextInt();
        if (isPalindrome(number)) {
            System.out.println("The number is a Palindrome");
        } else System.out.println("The number is not a Palindrome");
    }

    public static int reverse (int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += (number % 10);
            number /= 10;
        }
        return reverse;
    }
    public static boolean isPalindrome (int number) {
        boolean isPalindrome = false;
        if (number == reverse(number)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
