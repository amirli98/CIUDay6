package com.company.chapter6;
/**
 * in order to use binary search for searching your array must be in
 * right order
 * */



public class RecursiveBinarySearch {
    static long[] array;

    private static int recBinarySearch(long searchKey,int lowerBound,int upperBound)
    {
        int curIndex;

        curIndex = (lowerBound+upperBound)/2;
        if(array[curIndex] == searchKey)
            return curIndex;
        else
            if(lowerBound > upperBound)
            return -1;
        else
            {
                if(array[curIndex]<searchKey)
                    return recBinarySearch(searchKey,curIndex+1,upperBound);
                else
                    return recBinarySearch(searchKey,lowerBound,curIndex-1);
            }
    }


}
