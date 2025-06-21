import javax.annotation.processing.SupportedSourceVersion;
import java.util.Arrays;
import java.util.HashMap;

public class PracticeOne {
    public static void main(String[] args) {

        String s = "racecar";
        String t = "carrace";

        System.out.println(solutionThree(s, t));

    }

    // 1.Sorting O(n log n)
    public static boolean solutionOne(String s, String t) {
        // Sort them
        char[] sortedS = s.toCharArray();
        char[] sortedT = t.toCharArray();

        Arrays.sort(sortedS);
        Arrays.sort(sortedT);
        return Arrays.equals(sortedS, sortedT);

    }

    // 2. HashMap
    public static boolean solutionTwo(String s, String t) {

        if (s.length() != t.length()) return false;

        HashMap<Character, Integer> hashMapS = new HashMap<>();
        HashMap<Character, Integer> hashMapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hashMapS.put(s.charAt(i), hashMapS.getOrDefault(s.charAt(i), 0) + 1);
            hashMapT.put(t.charAt(i), hashMapT.getOrDefault(t.charAt(i), 0) + 1);
        }

        return hashMapS.equals(hashMapT);

    }

    // 3. Hash Table

    public static boolean solutionThree(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            System.out.println(Arrays.toString(count));
            count[t.charAt(i) - 'a']--;
            System.out.println(Arrays.toString(count));

        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }


}


// Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
// An anagram is a string that contains the exact same characters as another string,
// but the order of the characters can be different.

//Input: s = "racecar", t = "carrace"
//Output: true



