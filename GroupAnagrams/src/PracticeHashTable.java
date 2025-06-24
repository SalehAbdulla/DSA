import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PracticeHashTable {
    public static void main(String[] args) {

    }


    public static List<List<String>> groupAnagram(String[] strs) {
        // HashMap
        HashMap<int[], ArrayList<String>> hashMap = new HashMap<>();

        for (String word : strs) {
             int[] count =  new int[26];
             for (char c : word.toCharArray()) {
                 // make the frequency as a key
                 count[c - 'a']++;
             }

             hashMap.put(count, new ArrayList<>());
             hashMap.get(count).add(word);

        }

        return new ArrayList<>(hashMap.values());

    }
}
