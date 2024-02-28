package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class abc {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak",
                "reviver", "racecar", "madam"));



          Stack<Character> characters = new Stack<>();
          String reverser = "";

        for (String each : list) {

            for (char c : each.toCharArray()) {
                characters.push(c);
            }
            while(!characters.isEmpty()){
                reverser += characters.pop();
            }
           if ( each.toLowerCase() == reverser.toLowerCase()){
             list.remove(each);
           }

        }
        System.out.println(list);
        }

    }
