import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        return Arrays.equals(sArr, tArr);
    }

    public static void main(String[] args) {
        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";
        System.out.println("Output 1: " + isAnagram(s1, t1));
        System.out.println("Output 2: " + isAnagram(s2, t2));
    }
}
