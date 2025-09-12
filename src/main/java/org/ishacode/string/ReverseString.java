package org.ishacode.string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(revString(s));
    }

    private static String revString(String s) {
        String rev ="";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        return rev;
    }
}
