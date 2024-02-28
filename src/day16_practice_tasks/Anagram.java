package day16_practice_tasks;

import java.util.Set;
import java.util.TreeSet;
public class Anagram {
    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "ccddabaa";
        System.out.println(isEquels(str1, str2));

        String str3 = "xyze";
        String str4 = "xyzd";
        System.out.println(isEquels(str3,str4));
    }
    public static boolean isEquels(String str1, String str2) {

        Set<Character> set1 = new TreeSet<>();
        for (Character eachStr1 : str1.toCharArray()) {
            set1.add(eachStr1);
        }
        Set<Character> set2 = new TreeSet<>();
        for (Character eachStr2 : str2.toCharArray()) {
            set2.add(eachStr2);
        }
          boolean result ;
        if (set1.equals(set2)) {
           result = true;
        }else {
            result = false;
        }
        return result;
    }

}
