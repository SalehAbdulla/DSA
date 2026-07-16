import java.util.*;

public class Practice1 {
    public static void main(String[] args) {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        System.out.println(groupAnagram(strs));
    }

    public static List<List<String>> groupAnagram(String[] strs) {
        HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

        for (String s: strs) {
            char[] sToChar = s.toCharArray();
            Arrays.sort(sToChar);
            String sortedString = new String(sToChar);

            hashMap.putIfAbsent(sortedString, new ArrayList<String>());
            hashMap.get(sortedString).add(s);
        }

        return new ArrayList<>(hashMap.values());

    }


}
