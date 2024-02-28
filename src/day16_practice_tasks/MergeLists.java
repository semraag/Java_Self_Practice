package day16_practice_tasks;

import java.util.*;

public class MergeLists {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        list1.addAll(list2);
        System.out.println(list1);


        Set<Integer> list3 = new LinkedHashSet<>(list1);
        System.out.println(list3);




    }
}
