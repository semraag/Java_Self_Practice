package day10_practice_task;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {

       String[] arr1 = {"A", "B", "C"};
       String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr1));

        list.addAll(Arrays.asList(arr2));

        System.out.print("list ==> "+ list);



        }


    }

/* Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}  */