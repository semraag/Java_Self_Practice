package day17_practice_tasks;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<Character, Integer> map = new LinkedHashMap<>();
        Map<Character, Integer> uniqChar = new LinkedHashMap<>();

        for (char eachChar : str.toCharArray()) {
            if (map.containsKey(eachChar)){
                map.put(eachChar,map.get(eachChar) + 1);
            }else {
                map.put(eachChar,1);
            }
        }
        for (Map.Entry<Character, Integer> eachMap : map.entrySet()) {
            if (eachMap.getValue() == 1){
                uniqChar.put(eachMap.getKey(),eachMap.getValue());
            }
        }
        System.out.println(uniqChar);

    }
}
/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}  */