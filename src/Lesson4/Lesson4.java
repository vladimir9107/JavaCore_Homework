package Lesson4;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lesson4 {
        public static void main(String[] args) {
            String[] words = {"dog", "cat", "pet", "lock", "mock", "lock", "fork", "mock", "golf", "lock"};

            Map<String, Integer> map = new HashMap<>();
            for (String word : words) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
            System.out.println(map);
            System.out.println("");

            // subtask 1.b.
            Set<String> uniq =  newHashSet<>(Arrays.asList(words));
            System.out.println(uniq);
            System.out.println("");

            // subtask 2
            Phonebook pb = new Phonebook();

            pb.add("Ivanov", "123");
            pb.add("Petrov", "456");
            pb.add("Petrov", "789");

            System.out.println(pb.get("Petrov"));
        }
    }

