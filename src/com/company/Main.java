package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        int[] cloneArray = intArray.clone();
        intArray[3] = 45;
        System.out.println(Arrays.toString(intArray));
        System.out.println(" ");
        System.out.println(Arrays.toString(cloneArray));
        //cloneArray de bir sey degismiyor
    }
}
