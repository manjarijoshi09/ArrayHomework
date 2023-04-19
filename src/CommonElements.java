import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {

    public static void main(String[] args) {

        // Initialize two string arrays
        String[] arr1 = {"apple", "banana", "orange", "pear", "peach"};
        String[] arr2 = {"kiwi", "peach", "orange", "grape", "pear"};

        // Convert the arrays to ArrayLists
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(arr1));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(arr2));

        // Find the common elements between the two ArrayLists
        list1.retainAll(list2);

        // Convert the ArrayList back to an array
        String[] commonElements = new String[list1.size()];
        commonElements = list1.toArray(commonElements);

        // Print the common elements to the console
        System.out.println("The common elements between the two arrays are:");
        for (String element : commonElements) {
            System.out.print(element + " ");
        }
    }
}