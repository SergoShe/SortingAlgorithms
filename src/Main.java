import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Init array:");
        int[] arr = randomArray(5, -5000, 5000);
        int[] checkArray = new int[arr.length];
        checkArray = arr.clone();
        Arrays.sort(checkArray);
        System.out.println(Arrays.toString(arr));
        System.out.println("***");
        long startTime = System.nanoTime();
        //Пузырьковая сортировка
        //BubbleSort.bubbleSort(arr);
        //Сортировка вставками
        //InsertSort.insertSort(arr);
        //Сортировка слиянием
        //MergeSort.mergeSort(arr);
        //Быстрая сортировка
        //QuickSort.quickSort(arr);
        //Пирамидальная сортировка
        //HeapSort.heapSort(arr);
        //Бесполезная сортировка
        BogoSort.bogoSort(arr);
        long endTime = System.nanoTime();
        System.out.println(Arrays.toString(arr));
        System.out.println("Is Correct? - " + Arrays.equals(arr, checkArray));
        System.out.println("time: " + ((endTime - startTime))/1000 + "us");
    }

    private static int[] randomArray(int n, int min, int max) {
        int[] arr = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(max - min) + min;
        }
        return arr;
    }
}