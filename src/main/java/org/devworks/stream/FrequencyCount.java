package org.devworks.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
    public static void main(String[] args) {
        String input = "Hello world !!";

        Map<Character,Long> charCount = input.chars().mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.print(charCount);
    }
}
