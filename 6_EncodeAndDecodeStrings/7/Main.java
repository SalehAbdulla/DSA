import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> example = List.of("Hello", "World");
        System.out.println(Solution.encode(example));
    }
}

class Solution {

    public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < strs.size(); i++) 
        {
            String word = strs.get(i);
            result.append(word.length());
            result.append("#");
            result.append(word);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        return result;
    }
}
