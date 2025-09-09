package org.ishacode.arrays;

import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {2,4,7,38,9,46,78,33};
        int n = arr.length;
        Arrays.sort(arr);
        //Second Largest Element
        System.out.println(arr[n-2]);
        //Second Smallest Element
        System.out.println(arr[1]);
    }
}
