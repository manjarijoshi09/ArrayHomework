public class DivisibleByThreeAndFive {

    public static void main(String[] args) {

        // Print the numbers between 1 and 100 that are divisible by 3
        System.out.println("Numbers between 1 and 100 divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        // Print the numbers between 1 and 100 that are divisible by 5
        System.out.println("\nNumbers between 1 and 100 divisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}