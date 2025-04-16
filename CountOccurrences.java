import java.util.*;

public class CountOccurrences {
    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 5, 2, 6};
        int target = 2;
        System.out.println("Output: " + countOccurrences(arr, target));
    }
}
