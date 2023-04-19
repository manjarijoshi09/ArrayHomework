import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Count the number of 'a' characters in the string
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        // Print the total number of 'a' characters in the string
        System.out.println("The total number of 'a' characters in the string is: " + count);
    }
}