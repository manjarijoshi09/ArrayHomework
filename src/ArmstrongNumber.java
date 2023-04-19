import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the number of digits in the given number
        int temp = number;
        int numberOfDigits = 0;
        while (temp > 0) {
            numberOfDigits++;
            temp /= 10;
        }

        // Calculate the sum of the cubes of each digit
        int sum = 0;
        temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        // Check if the number is an Armstrong number or not
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}