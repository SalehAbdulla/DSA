import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        

    }

    public static List<List<String>> groupAnagrams(String[] strings) {
        HashMap<String, List<String>> hashMap = new HashMap<>();

        for (String s: strings) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedS = new String(charArray);

            hashMap.putIfAbsent(sortedS, new ArrayList<>());
            hashMap.get(sortedS).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }

}