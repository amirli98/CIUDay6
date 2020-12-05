package com.company.overview;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void selectionSort(int[] array)
    {
        int n = array.length;
        int minIndex;
        for (int i = 0; i < n-1; i++) {
            minIndex = i;
            for (int j = i+1; j <n ; j++) {
                if(array[j]<=array[minIndex])
                {
                    minIndex = j;
                    int temp = array[i];
                    array[i] = array[minIndex];
                    array[minIndex] = temp;
                }
            }
        }
        System.out.println("Before selection sort : the array is");
        for (int a:array) {
            System.out.print(a+" ");
        }
        System.out.println("After is :");
    }


    public static void main(String[] args) {


    }
}
