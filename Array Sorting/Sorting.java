import java.util.*;

/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 10/16/2019
 * Time: 12:34 PM
 */
public class Sorting <T> {

    /**
     * Selection Sort
     */
    public static <T extends Comparable<T>>
    void SelectionSort (T[] array) {
        int min;
        for (int index = 0; index < array.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < array.length; scan++)
                if (array[scan].compareTo(array[min]) < 0)
                    min = scan;
            swap(array, min, index);
        }
    }

    /**
     * Bubble Sort
     */
    public static <T extends Comparable<T>>
    void BubbleSort (T[] array) {
        for(int end = array.length - 1; end > 0; end--)
            for (int index = 0; index < end; index++)
                if (array[index].compareTo(array[index + 1]) > 0)
                    swap(array, index, index + 1);
    }

    /**
     * Quick Sort (recursive)
     */
    public static <T extends Comparable<T>>
    void QuickSort (T [] array, int start, int end) {
        int pIndex = 0;
        if(start < end) {
            pIndex = Partition(array, start, end);
            QuickSort(array, start, pIndex - 1);
            QuickSort(array, pIndex + 1, end);
        }
    }

    public static <T extends Comparable<T>>
    int Partition (T [] array, int start, int end) {
        T pivot = array[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if (array[i].compareTo(pivot) <= 0) {
                swap(array, i, index);
                index++;
            }
        }
        swap(array, index, end);
        return index;
    }

    /**
     * Insertion Sort
     */

    public static <T extends Comparable<T>>
    void InsertionSort(T[] array)
    {
        for (int index = 1; index < array.length; index++) {
            T key = array[index];
            int position = index; // shift larger values to the right
            while (position > 0 && array[position-1].compareTo(key) > 0) {
                array[position] = array[position-1];
                position--;
            }
            array[position] = key;
        }
    }

    /**
     * Merge Sort (recursive)
     */
    public static <T extends Comparable<T>>
    void MergeSort(T[] array, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            MergeSort(array, start, mid);
            MergeSort(array, mid+1, end);
            merge(array, start, mid, end);
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Comparable<T>>
    void merge(T[] array, int start, int mid, int end) {
        T[] temp = (T[])(new Comparable[array.length]);

        int start_l = start;    // start point of first/left subarray
        int end_l = mid;        // end point of first/left subarray
        int start_r = mid + 1;    // start point of second/right subarray
        int end_r = end;        // end point of second/right subarray
        int index = start_l;  // next index open in temp array

        //  Copy smaller item from each subarray into temp until one
        //  of the subarrays is exhausted
        while (start_l <= end_l && start_r <= end_r) {
            if (array[start_l].compareTo(array[start_r]) < 0) {
                temp[index] = array[start_l];
                start_l++;
            }
            else {
                temp[index] = array[start_r];
                start_r++;
            }
            index++;
        }

        //  Copy remaining elements from first/left subarray, if any
        while (start_l <= end_l) {
            temp[index] = array[start_l];
            start_l++;
            index++;
        }

        //  Copy remaining elements from second/right subarray, if any
        while (start_r <= end_r) {
            temp[index] = array[start_r];
            start_r++;
            index++;
        }

        //  Copy merged data into original array
        for (index = start; index <= end; index++)
            array[index] = temp[index];
    }


    /**
             * Radix Sort (translated form C++)
             */
    public static <Integer extends Comparable<Integer>>
    void RadixSort(Integer [] array) {
        // Create an array with 10 queues.
        Queue[] quarr = new Queue[10];
        for (int i = 0; i < quarr.length; i++) {
            quarr[i] = new LinkedList<java.lang.Integer>();
        }

        // Find the longest number in the unsorted array.
        int length = 0;
        for (int index = 0; index < array.length; index++) {
            int n = (int) (Math.log10((java.lang.Integer)array[index]) + 1);
            if (n > length) {
                length = n;
            }
        }

        int m = 10; // The number to use modulo on
        int n = 1; // The number for rounding division.
        // Repeats as long as the highest number in the array.
        for (int index = 0; index < length; index++) {

            // Perform calculation and enqueue element in correct queue.
            for (int arrindex = 0; arrindex < array.length; arrindex++) {
                int quindex = ((java.lang.Integer)array[arrindex] % m) / n;
                quarr[quindex].add(array[arrindex]);
            }

            // Now dequeue the numbers and put them in a new array.
            int i = 0;
            for (int quindex = 0; quindex < quarr.length; quindex++) {
                while (!quarr[quindex].isEmpty()) {
                    array[i] = (Integer) quarr[quindex].remove();
                    i++;
                }
            }
            m *= 10;
            n *= 10;
        }
    }



    public static <T extends Comparable<T>>
    void traverse(T[] a) {
        String result = "";
        for(int i = 0; i < a.length; i++)
            result += a[i] + " ";
        System.out.println(result);
    }

    private static <T extends Comparable<T>>
    void swap(T[] a, int x, int y)
    {
        T temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
