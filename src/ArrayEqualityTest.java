import java.util.Arrays;

    public class ArrayEqualityTest {

        public static void main(String[] args) {
            int[] array1 = {1, 2, 3};
            int[] array2 = {1, 2, 3};

            boolean isEqual = Arrays.equals(array1, array2);
            if(isEqual){
                System.out.println("The arrays are equal");
            }
            else{
                System.out.println("The arrays are not equal");
            }
        }
    }

