import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int tmp, length = array.length;
        boolean swapped;
        for (int i = 0; i < length - 1; i++) {
            swapped = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap left and right
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            System.out.println(Arrays.toString(array));
            System.out.println();
            if (!swapped)
                break;
        }
    }

    private static void swap(int[] array, int startIndex, int endIndex) {
        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
    }
}
