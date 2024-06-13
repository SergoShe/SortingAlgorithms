public class QuickSort {

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex)
            return;

        int lowPos = startIndex;
        int highPos = endIndex;
        int pivot = array[(endIndex + startIndex) / 2];
        do {
            while (array[lowPos] < pivot)
                lowPos++;
            while (array[highPos] > pivot)
                highPos--;
            if (lowPos <= highPos) {
                if (lowPos < highPos)
                    swap(array, lowPos, highPos);
                lowPos++;
                highPos--;
            }
        } while (lowPos <= highPos);
        quickSort(array, startIndex, highPos);
        quickSort(array, lowPos, endIndex);
    }

    private static void swap(int[] array, int startIndex, int endIndex) {
        int temp = array[startIndex];
        array[startIndex] = array[endIndex];
        array[endIndex] = temp;
    }
}