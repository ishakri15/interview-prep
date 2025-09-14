package org.ishacode.string;

import java.util.HashMap;
import java.util.Map;

public class FreqOfChars {
    public static void main(String[] args) {
        String s = "aabbbbeeffffggg";
        Map<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
        for (Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.print(entry.getKey()+""+entry.getValue());
        }
    }
}
