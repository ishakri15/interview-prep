package org.ishacode.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagrams {
    public static boolean areAnagrams(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);
        return Arrays.equals(s1Arr,s2Arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(areAnagrams(s1,s2));
    }
}
