package day16_practice_tasks;

import java.util.Arrays;
import java.util.*;
public class CommonElements {
    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));

        Set<Integer> set3 = new LinkedHashSet<>();

        for (Integer eachSet1 : set1) {
            for (Integer eachSet2 : set2) {

                if ( eachSet1 == eachSet2){
                    set3.add(eachSet1);
                }
            }
        }
        System.out.println(set3);
    }
}
