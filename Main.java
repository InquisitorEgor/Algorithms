package SecondHomework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        int arr1[] = new int[10000];
        int arr2[] = new int[10000];
        int arr3[] = new int[10000];
        int array[] = {4, 5, 35, 2, 55, 22, 32, 53, 25, 1, 67, 72};
        testArrayImpl(arr1, arr2, arr3, array);
    }

    private static void testArrayImpl(int arr1[], int arr2[], int arr3[], int array[]) {
        Array array0 = new ArrayImpl(array, 0);

        System.out.println("Array output:");
        array0.Input();
        array0.Output();
        System.out.println("Array output with added element:");
        array0.add(30);
        array0.Output();
        System.out.println("Is there this element - " + array0.indexOf(30));
        System.out.println("Deleting element -  " + array0.remove(30));
        array0.Output();
        System.out.println("-------------------------");

        InputForRandom(arr1, arr2, arr3);
        Array array1 = new ArrayImpl(arr1, 0);
        Array array2 = new ArrayImpl(arr2, 0);
        Array array3 = new ArrayImpl(arr3, 0);
        System.out.println("Arr1: ");
        array1.Input();
        //array1.Output();
        System.out.println("-------------------------");
        System.out.println("Arr2: ");
        array2.Input();
        //array2.Output();
        System.out.println("-------------------------");
        System.out.println("Arr3: ");
        array3.Input();
        //array3.Output();
        System.out.println("Bubble sort: ");
        long start1 = System.nanoTime();
        array1.sortBubble();
        long finish1 = System.nanoTime();
        //array1.Output();
        System.out.println("Time: "+TimeUnit.NANOSECONDS.toMillis(finish1 - start1));
        System.out.println("-------------------------");
        System.out.println("Selection sort: ");
        long start2 = System.nanoTime();
        array2.sortSelect();
        long finish2 = System.nanoTime();
        //array2.Output();
        System.out.println("Time: "+TimeUnit.NANOSECONDS.toMillis(finish2 - start2));
        System.out.println("-------------------------");
        System.out.println("Insertion sort: ");
        long start3 = System.nanoTime();
        array3.sortInsert();
        long finish3 = System.nanoTime();
        //array3.Output();
        System.out.println("Time: "+TimeUnit.NANOSECONDS.toMillis(finish3 - start3));


    }

    private static void InputForRandom(int arr1[], int arr2[], int arr3[]) {
        for (int i = 0; i < arr1.length; i++) {
            Random rand = new Random();
            int r = rand.nextInt(100);
            arr1[i] = r;
            arr2[i] = r;
            arr3[i] = r;

        }
    }
}
