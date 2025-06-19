import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int solution = getMaxSubStringLength("abcabcbb");
        System.out.println(solution);
    }

    public static int getMaxSubStringLength(String s) {
        int maxLength = 0;
        HashMap<Character, Integer> hashMap = new HashMap();

        for (int leftSlide = 0, rightSlide = 0; rightSlide < s.length(); rightSlide++) {

            int getLastEncounteredChar = hashMap.get(s.charAt(rightSlide));

            if (hashMap.containsKey(s.charAt(rightSlide)) && getLastEncounteredChar >= leftSlide) {
                leftSlide = getLastEncounteredChar + 1;
            }

            maxLength = Math.max(maxLength, rightSlide - leftSlide + 1);
            hashMap.put(s.charAt(rightSlide), rightSlide);
        }

        return maxLength;
    }
}