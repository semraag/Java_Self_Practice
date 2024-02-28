package day17_practice_tasks;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

            String str = "bbcccaaaaa";

        Map<Character, Integer> map = new HashMap<>();

        for (char eachChar : str.toCharArray()) {
            if (map.containsKey(eachChar)){
                map.put(eachChar,map.get(eachChar) + 1);
            }else {
                map.put(eachChar,1);
            }


        }
    }
}
/*  4. Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
*/