import java.util.Scanner;
import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args){
        // test cases
        // int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // int[] arr = new int[]{1, 6, 9, 2, 4, 8, 2, 6, 2, 4, 6, 2, 9, 6, 8, 3};
        // int[] arr = new int[]{1, 2, 1, 2, 1, 2, 1, 2, 1};
        System.out.printf("og array: %s\n", Arrays.toString(arr));
        System.out.printf("sorted: %s\n", Arrays.toString(countingSort(arr)));
    }

    public static int[] countingSort(int[] arr){
        int[] minmax = minAndMax(arr);
        int[] buckets = bucketsFromArr(arr, minmax[0], minmax[1]);
        int[] sorted = sortedFromBuckets(buckets, arr.length, minmax[0]);

        return sorted;

    }
    public static int[] minAndMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
        }

        return new int[]{min, max};
    }
    public static int[] bucketsFromArr(int[] arr, int min, int max){
        int[] buckets = new int[max - min + 1];
        for (int i = 0; i < arr.length; i++){
            buckets[arr[i] - min]++;
        }

        return buckets;
    }
    public static int[] sortedFromBuckets(int[] buckets, int length, int min){
        int[] sorted = new int[length];
        int count = 0;
        for (int i = 0; i < buckets.length; i++){
            for (int j = 0; j < buckets[i]; j ++){
                sorted[count] = i + min;
                count++;
            }
        }

        return sorted;
    }
}