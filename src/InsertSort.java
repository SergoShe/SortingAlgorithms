import java.util.Arrays;

public class InsertSort {

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int element = array[i];
            System.out.println("Current elem: " + element);
            int j = i - 1;
            while (j >= 0 && element < array[j]) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = element;
            System.out.println(Arrays.toString(array));
            System.out.println();
        }
    }
}