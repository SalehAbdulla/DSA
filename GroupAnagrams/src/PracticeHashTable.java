import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PracticeHashTable {
    public static void main(String[] args) {

    }


    public static List<List<String>> groupAnagram3(String[] strs) {
        // HashMap
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String s : strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            hashMap.putIfAbsent(sortedS, new ArrayList<>());
            hashMap.get(sortedS).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
