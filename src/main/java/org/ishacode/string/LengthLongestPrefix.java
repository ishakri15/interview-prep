package org.ishacode.string;

import com.sun.javafx.binding.StringFormatter;

import java.util.Arrays;

public class LengthLongestPrefix {
    public static String longestPrefix(String[] strs){
        for(int i=0; i<strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j=1; j< strs.length; j++){
                if(i >= strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        System.out.println(longestPrefix(strs));
    }
}
