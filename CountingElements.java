package Hashsing;
import java.util.*;

public class CountingElements {

    public static int countElements(int[] arr) {
        int counter = 0;

        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        for (int num : arr) {
            if (set.contains(num + 1)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int re = countElements(arr);
        System.out.println(re); // Output: 2
    }
}
