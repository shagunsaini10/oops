public class FindMissingNumber {
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2;
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        return totalSum - arraySum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4};
        int n = 6; // since N = size of array + 1
        System.out.println("Output: " + findMissing(arr, n));
    }
}
