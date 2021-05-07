package com.gaydash;

import java.util.Arrays;

/*
2*) Реализовать метод который сортирует массив целых чисел быстрой сортировкой
https://en.wikipedia.org/wiki/Quicksort
*/

public class Sort {

    public static void main(String[] args) {
        int[] array1 = new int[]{3, 2, 5, 1, 8, 16, 4, 6};
        int[] resultArray = quickSort(array1, 0, array1.length - 1);
        System.out.println("Result array: " + Arrays.toString(resultArray));
    }

    public static int[] quickSort(int[] source, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = source[(leftMarker + rightMarker) / 2];
        do {
            while (source[leftMarker] < pivot) {
                leftMarker++;
            }
            while (source[rightMarker] > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = source[leftMarker];
                    source[leftMarker] = source[rightMarker];
                    source[rightMarker] = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            quickSort(source, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            quickSort(source, leftBorder, rightMarker);
        }
        return source;
    }

}