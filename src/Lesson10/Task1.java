package Lesson10;

import java.util.*;


public class Task1 {
    public static void main(String[] args) {

        String[] arr = new String[]{"Мурзик", "Тузик", "Мурзик", "Тима", "Луна", "Луна", "1", "2", "3", "4", "3", "4", "7"};
        List<String> list = new ArrayList<>(List.of(arr));
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            if (Collections.frequency(list, list.get(i)) <= 1) {
            }
            else
            {
                Integer j = map.get(list.get(i));
                map.put(list.get(i), (j == null) ? 1 : j + 1);
            }
        }
        System.out.println(list);
        System.out.println(map);
    }
    }