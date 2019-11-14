/**
 * Porof.: Abu-Samaha
 * Cource: CSC 130
 * Class: 86840
 * Section: 05
 * Created by: Russ Yatsenko
 * Date: 10/16/2019
 * Time: 12:32 PM
 */
public class Client {
    public static void main(String[] args) {

        Integer [] digits = new Integer [] {3, 1, 8, 2, 9};
        Integer [] digits2 = new Integer [] {7, 4, 6, 5, 0};
        Integer [] digits3 = new Integer [] {3, 7, 2, 8, 5};
        Integer [] digits4 = new Integer [] {6, 1, 4, 2, 3};
        Integer [] digits5 = new Integer [] {4, 8, 6, 1, 9};
        Integer [] digits6 = new Integer [] {784, 4568, 65, 786, 9987, 32, 2589, 6622, 1};

        Character [] chars = new Character [] {'c', 'k', 'd', 'i', 'w'};
        Character [] chars2 = new Character [] {'m', 'z', 't', 'o', 'a'};
        Character [] chars3 = new Character [] {'s', 'g', 'p', 'v', 'l'};
        Character [] chars4 = new Character [] {'h', 'd', 'n', 'y', 'j'};
        Character [] chars5 = new Character [] {'x', 'e', 'u', 't', 's'};

        String [] words = new String [] {"Mary", "Sam", "Glory", "Abe", "Josh"};
        String [] words2 = new String [] {"Axel", "Adam", "Amir", "Aaron", "Antonio"};
        String [] words3 = new String [] {"Sophia", "Aria", "Olivia", "Emilia", "Amelia"};
        String [] words4 = new String [] {"Wayne", "Tyler", "Daniel", "Fabian", "Harold"};
        String [] words5 = new String [] {"Emma", "Liam", "Noah", "Ava", "Mason"};

        Float [] floats = new Float [] {0.03f, 0.01f, 0.08f, 0.02f, 0.09f};
        Float [] floats2 = new Float [] {0.007f, 0.004f, 0.006f, 0.005f, 0.0000f};
        Float [] floats3 = new Float [] {0.0003f, 0.0007f, 0.0002f, 0.0008f, 0.0005f};
        Float [] floats4 = new Float [] {0.6f, 0.1f, 0.4f, 0.2f, 0.3f};
        Float [] floats5 = new Float [] {0.000004f, 0.000008f, 0.000006f, 0.00001f, 0.00009f};

        Double [] doubles = new Double [] {0.3, 0.1, 0.8, 0.2, 0.9};
        Double [] doubles2 = new Double [] {0.7, 0.4, 0.6, 0.5, 0.0};
        Double [] doubles3 = new Double [] {0.3, 0.7, 0.2, 0.8, 0.5};
        Double [] doubles4 = new Double [] {0.6, 0.1, 0.4, 0.2, 0.3};
        Double [] doubles5 = new Double [] {0.4, 0.8, 0.6, 0.1, 0.9};

        Sorting.SelectionSort(digits);
        Sorting.BubbleSort(digits2);
        Sorting.QuickSort(digits3, 0, digits3.length - 1);
        Sorting.InsertionSort(digits4);
        Sorting.MergeSort(digits5, 0, digits5.length - 1);
        Sorting.RadixSort(digits6);

        Sorting.SelectionSort(chars);
        Sorting.BubbleSort(chars2);
        Sorting.QuickSort(chars3, 0, chars3.length - 1);
        Sorting.InsertionSort(chars4);
        Sorting.MergeSort(chars5, 0, chars5.length - 1);

        Sorting.SelectionSort(words);
        Sorting.BubbleSort(words2);
        Sorting.QuickSort(words3, 0, words3.length - 1);
        Sorting.InsertionSort(words4);
        Sorting.MergeSort(words5, 0, words5.length - 1);

        Sorting.SelectionSort(floats);
        Sorting.BubbleSort(floats2);
        Sorting.QuickSort(floats3, 0, words3.length - 1);
        Sorting.InsertionSort(floats4);
        Sorting.MergeSort(floats5, 0, floats5.length - 1);

        Sorting.SelectionSort(doubles);
        Sorting.BubbleSort(doubles2);
        Sorting.QuickSort(doubles3, 0, words3.length - 1);
        Sorting.InsertionSort(doubles4);
        Sorting.MergeSort(doubles5, 0, doubles5.length - 1);

        System.out.println("===============================");
        System.out.println("         Selection Sort        ");
        System.out.println("===============================");
        Sorting.traverse(digits);
        Sorting.traverse(chars);
        Sorting.traverse(words);
        Sorting.traverse(floats);
        Sorting.traverse(doubles);

        System.out.println("===============================");
        System.out.println("          Bubble Sort          ");
        System.out.println("===============================");
        Sorting.traverse(digits2);
        Sorting.traverse(chars2);
        Sorting.traverse(words2);
        Sorting.traverse(floats2);
        Sorting.traverse(doubles2);

        System.out.println("===============================");
        System.out.println("           Quick Sort          ");
        System.out.println("===============================");
        Sorting.traverse(digits3);
        Sorting.traverse(chars3);
        Sorting.traverse(words3);
        Sorting.traverse(floats3);
        Sorting.traverse(doubles3);

        System.out.println("===============================");
        System.out.println("         Insertion Sort        ");
        System.out.println("===============================");
        Sorting.traverse(digits4);
        Sorting.traverse(chars4);
        Sorting.traverse(words4);
        Sorting.traverse(floats4);
        Sorting.traverse(doubles4);

        System.out.println("===============================");
        System.out.println("           Merge Sort          ");
        System.out.println("===============================");
        Sorting.traverse(digits5);
        Sorting.traverse(chars5);
        Sorting.traverse(words5);
        Sorting.traverse(floats5);
        Sorting.traverse(doubles5);

        System.out.println("===============================");
        System.out.println("           Radix Sort          ");
        System.out.println("===============================");
        Sorting.traverse(digits6);
    }
}
