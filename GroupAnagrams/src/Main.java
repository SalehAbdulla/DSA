import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String myName = "saleh";
        char[] myNameToArrayChar = myName.toCharArray();
        System.out.println(Arrays.toString(myNameToArrayChar));

        Arrays.sort(myNameToArrayChar);
        System.out.println(Arrays.toString(myNameToArrayChar));


    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        HashMap<Integer, String[]> result = new HashMap<>();

        int[] count = new int[26];

        for (String s: strings) {
            char[] charArray = s.toCharArray();

            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            System.out.println(charArray);
        }
        return null;
    }
}