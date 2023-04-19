import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Input a 5-digit number
        System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reverse = 0;
        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        // Print the reversed number
        System.out.println("The reversed number is: " + reverse);
    }
}