public class Main {
    public static void main(String[] args) {
        
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int word1CharToAscii =  s.charAt(i) - 'a';
            int word2CharToAscii =  t.charAt(i) - 'a';
            freq[word1CharToAscii]++;
            freq[word2CharToAscii]--;
        }

        for (int f: freq) {
            if (f != 0) return false;
        }

        return true;
    }
}