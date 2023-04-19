import java.util.Arrays;

public class RemoveElementFromArray {

    public static void main(String[] args) {

        // Initialize an integer array
        int[] arr = {1, 2, 3, 4, 5};

        // Element to be removed from the array
        int elementToRemove = 3;

        // Find the index of the element to be removed
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elementToRemove) {
                index = i;
                break;
            }
        }

        // If the element is not found in the array, display an error message
        if (index == -1) {
            System.out.println("Element not found in the array");
        } else {
            // Create a new array with one less element
            int[] newArr = new int[arr.length - 1];

            // Copy all elements except the element to be removed to the new array
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == index) {
                    continue;
                }
                newArr[j++] = arr[i];
            }

            // Display the new array
            System.out.println("Array after removing the element: " + Arrays.toString(newArr));
        }
    }
}