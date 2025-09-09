package org.ishacode.arrays;

import java.lang.reflect.Array;

public class TwoSum {
    public static void twoSum(int arr[],int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6};
        int target = 10;
        twoSum(arr, target);
    }
}
