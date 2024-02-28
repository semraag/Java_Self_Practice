package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 7));
        ArrayList<Integer> count = new ArrayList<>();

        for (int i = 0;  i < list.size()  ; i++) {


            if (!count.contains(list.get(i))){

                count.add(list.get(i));
            }
        }
        System.out.println(count);
    }

    }

