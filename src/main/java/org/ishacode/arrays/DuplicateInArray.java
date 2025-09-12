package org.ishacode.arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4,4,5};
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i])){
                System.out.println(arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
    }
}
