import java.util.Scanner;

public class AscendingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Enter the elements of the array
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array in ascending order using bubble sort
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("The sorted array in ascending order is:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}