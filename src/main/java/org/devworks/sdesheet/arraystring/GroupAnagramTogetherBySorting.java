package org.devworks.sdesheet.arraystring;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupAnagramTogetherBySorting {

    private String sort(String s){
       char[] chars = s.toCharArray();
        for(int i =0; i<chars.length;i++){
            char c =
            for(int j=i+1; j<chars.length; j++){
                if
            }
        }
    }

    static void groupAnagramCategorizedBySorting(String [] strs){
        //if(strs == null || strs.length==0) return new ArrayList<>();



        List<String> sortedStrings = Arrays.stream(strs).sorted().collect(Collectors.toList());

        System.out.println("Sorted String");
        sortedStrings.forEach(System.out::println);

        HashMap<String, List<String>> sortedStringHashMap = new HashMap<>();

        for(String s:sortedStrings){
            if(sortedStrings.contains(s)){
                sortedStringHashMap.put(s,sortedStrings);
            }else{
                //create a new list
                List<String> stringList = new ArrayList<>();
                stringList.add(s);
                sortedStringHashMap.put(s,stringList);
            }
        }

        for(Map.Entry<String,List<String>> entry: sortedStringHashMap.entrySet()){
            System.out.println(entry.getKey() +"->"+ entry.getValue());
        }
    }

    public static void main(String[] args) {
        String[] strs = {"act", "god", "cat", "dog", "tac"};
         groupAnagramCategorizedBySorting(strs);
         }
}
