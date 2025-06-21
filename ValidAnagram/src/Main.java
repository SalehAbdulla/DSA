import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        String wordOne = "jar";
        String wordTwo = "jar";
        boolean solution = isValidAnagram(wordOne, wordTwo);
        System.out.println(solution);
    }

    public static boolean isValidAnagram(String s,  String t) {
        char[] sToArray = new char[s.length()];
        char[] tToArray = new char[t.length()];

        for (int i = 0; i < s.length(); i++) {
            sToArray[i] = s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) {
            tToArray[i] = t.charAt(i);
        }

        Arrays.sort(sToArray);
        Arrays.sort(tToArray);

        return Arrays.equals(sToArray, tToArray);
    }
}