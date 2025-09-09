package org.ishacode.arrays;

public class ValidSubarrayOfSize3 {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,2,5,2};
        int count = 0;
        for(int i=0; i<arr.length-2;i++){
            if(arr[i]+arr[i+2]==arr[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
