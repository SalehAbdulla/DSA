
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int solution = longestSubString("abcabcbb");
        System.out.println(solution);
    }

    public static int longestSubString(String s) {
        int maxSub = 0;
        Set<Character> sNoneDuplicants = new HashSet<>();

        for (int left = 0, right = 0; right < s.length(); right++) {

            boolean isExist = sNoneDuplicants.contains(s.charAt(right));
            if (isExist) {
                left++;
                sNoneDuplicants.clear();
            } else {
                maxSub = sNoneDuplicants.size() + 1;
            }
            sNoneDuplicants.add(s.charAt(right));
        }

        return maxSub;
    }
}


//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.

