import java.util.Arrays;

public class CommonElement {

    public static void main(String[] args) {

        // Initialize two string arrays
        String[] arr1 = {"apple", "banana", "orange", "pear", "peach"};
        String[] arr2 = {"kiwi", "peach", "orange", "grape", "pear"};

        // Find the common elements between the two arrays
        String[] commonElements = new String[arr1.length];
        int count = 0;
        for (String element : arr1) {
            if (Arrays.asList(arr2).contains(element)) {
                commonElements[count] = element;
                count++;
            }
        }

        // Print the common elements to the console
        if (count > 0) {
            System.out.println("The common elements between the two arrays are:");
            for (int i = 0; i < count; i++) {
                System.out.print(commonElements[i] + " ");
            }
        } else {
            System.out.println("There are no common elements between the two arrays");
        }
    }
}