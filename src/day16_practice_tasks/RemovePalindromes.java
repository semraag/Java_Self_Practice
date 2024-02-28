package day16_practice_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class RemovePalindromes {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "Python", "Cydeo", "Car",
                "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam"));

        ArrayList<String> reverseList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {

            Stack<Character> characters = new Stack<>();

            for (char c : list.get(i).toLowerCase().toCharArray()) {
                characters.push(c);
            }
            String reverser = "";

            while(!characters.isEmpty()){
                reverser += characters.pop();
            }
            reverseList.add(reverser);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < reverseList.size() ; j++) {
                if (list.get(i).equalsIgnoreCase(reverseList.get(j))) {
                    list.remove(list.get(i));  }    }    }

        System.out.println(list);
    }
}

      



