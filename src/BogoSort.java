public class BogoSort {

    public static void bogoSort(int[] arr) {
        while (isSorted(arr) == false) {
            shuffle(arr);
        }
    }

    private static void shuffle(int[] a) {
        for (int i = 0; i < a.length; i++)
            swap(a, i, (int) (Math.random() * i));
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    private static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] < a[i - 1])
                return false;
        return true;
    }
}