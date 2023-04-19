public class MultiplicationTable {

    public static void main(String[] args) {

        int n = 3; // Size of the multiplication table
        int i = 1; // Starting number for multiplication
        int j;

        do {
            j = 1; // Starting number for multiplication
            do {
                System.out.print(i * j + " ");
                j++;
            } while (j <= n);

            System.out.println();
            i++;
        } while (i <= n);
    }
}