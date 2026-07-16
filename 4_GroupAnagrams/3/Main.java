import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    
        String[] strs = {"act", "pots", "tops", "cat", "stop", "hat"};
        List<List<String>> solution = groupAnagrams(strs);
    
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String key = String.valueOf(getFrequency(strs[i]));
            hashMap.computeIfAbsent(key, k -> new ArrayList<>()).add(strs[i]);
        }
        return new ArrayList<>(hashMap.values());
    }

    public static int[] getFrequency(String word) {
        int[] res = new int[26];

        for (int i = 0; i < word.length(); i++) {
            res[word.charAt(i)]++;
        }

        return res;
    }
}