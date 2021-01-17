package quicksort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {

        int x[] = {1,0,9,8,6,3,3,5,6};
        System.out.println("Массив до сортировки х = " + Arrays.toString(x));

        int low = 0;
        int high = x.length - 1;

        quickSort(x, low, high);
        System.out.println("Массив после сортировки х = " + Arrays.toString(x));
    }

    public static void quickSort (int array[], int low, int high) {

        if (array.length == 0)
            return;

        if (low >= high)
            return;

        int middle = low + (high - low)/2;
        int support = array[middle];

        int i = low, j = high;

        while (i < j) {

            while (array[i] < support) {
                i++;
            }

            while (array[j] > support) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array,low,j);
        }

        if (high > i) {
            quickSort(array,i,high);
        }
    }
}
