package org.ishacode.arrays;

import static java.lang.Math.max;

public class MaxSumSubarray {

    public static int maxSum(int arr[],int n){
        int currSum=0, maxSum=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            maxSum = max(maxSum,currSum);
            if(currSum<0){
                currSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;
        System.out.println(maxSum(arr,n));
    }
}
