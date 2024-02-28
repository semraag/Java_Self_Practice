package day17_practice_tasks;
import java.util.LinkedHashMap;
import java.util.Map;

public class MergeMaps {
    public static void main(String[] args) {

        Map<Character, Integer> map1 = new LinkedHashMap<>();
        map1.put('A', 10);
        map1.put('B', 20);
        Map<Character, Integer> map2 = new LinkedHashMap<>();
        map2.put('B', 30);
        map2.put('C', 40);

        for (Map.Entry<Character, Integer> map2Entry : map2.entrySet()) {

                if (map1.containsKey(map2Entry.getKey())) {
                    map1.put(map2Entry.getKey(),map1.get(map2Entry.getKey())+ map2Entry.getValue());
                }else{
                    map1.put(map2Entry.getKey(),map2Entry.getValue());
                }
            }
        System.out.println(map1);
        }

    }

/*  3. Create a class named MergeMaps and write a program that merge two given maps.
If a key is present in both maps, add their corresponding values together.

         Example:
               map1 = {'A'=10, 'B'=20}
               map2 = {'B'=30, 'C'=40}

         Output:
               {'A'=10, 'B'=50, 'C'=40}   */
