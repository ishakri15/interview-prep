package org.ishacode.arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int arr1[] = {2,4,6,8,10};
        int arr2[] = {1,3,5,7,9};
        int n = arr1.length;
        int m = arr2.length;
        int result[] = new int[n+m];
        int resultIndex = 0;

        for(int i=0; i<n; i++){
            result[resultIndex++] = arr1[i];
        }
        for(int i=0; i<m; i++){
            result[resultIndex++] = arr2[i];
        }

        Arrays.sort(result);
        for(int i=0; i<n+m; i++){
            System.out.println(result[i]);
        }
    }
}
