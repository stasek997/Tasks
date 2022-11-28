package Lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        String[] text = new String[]{"тут", "какой", "то", "текст", "а", "тут", "уже", "не ", "текст", "но", "здесь", "ещё", "текст", "."};
        List <String> list = new ArrayList<>(List.of(text));
        Set<String> res = new HashSet<>(list);
        System.out.println(res);
    }


}
