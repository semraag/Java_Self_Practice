package day16_practice_tasks;
import java.util.*;
 import java.util.Arrays;
  import java.util.Set;

    public class DifferenceBetweenTwoSets {
    public static void main(String[] args) {

        Set<Integer> set1 = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 5));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(2, 3, 4));

       set1.removeAll(set2);
        System.out.println(set1);
    }
}
