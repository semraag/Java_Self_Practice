package day16_practice_tasks;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        System.out.println(list);


        Set<Integer> set = new TreeSet<>();
        set.addAll(list);
        System.out.println(set);


    }
}