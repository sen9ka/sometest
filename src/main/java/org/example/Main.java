package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 1, 5, 4);
        Map<Integer, Integer> countMap = countElements(numbers);
        System.out.println(countMap);

    }
    
    public static Map<Integer, Integer> countElements(List<Integer> list) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (Integer element : list) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }
        return countMap;
    }

}