package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReversedArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 2, 0, 3, 0, 4, 0));
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> reversedlist = new ArrayList<>();
        for (int i = list.size() - 1, j = 0; i >= 0; i--, j++) {
             reversedlist .addAll(Arrays.asList(list.get(i)));


        }
        System.out.println(reversedlist);

    }
}
/*  Create a class called ReversedArrayList and write a program with the following specifications:
   5.1 Given an ArrayList, move all zeros to the last indexes of the ArrayList.

	            Example:
	                list: {1,0,2,0,3,0,4,0}

	            output:
	            */