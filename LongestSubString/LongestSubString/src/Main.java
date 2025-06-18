public class Main {
    public static void main(String[] args) {
        int solution = getMaxSubString("abcabcbb");
        System.out.println(solution); // Output: 3
    }

    public static int getMaxSubString(String s) {
        int max = 0;
        int leftSlide = 0;

        for (int rightSlide = 0; rightSlide < s.length(); rightSlide++) {
            char currentChar = s.charAt(rightSlide);

            // Check if current character exists in the window
            int index = s.substring(leftSlide, rightSlide).indexOf(currentChar);

            if (index != -1) {
                // Move leftSlide just after the repeated character
                leftSlide = leftSlide + index + 1;
            }

            // Update the max length
            max = Math.max(max, rightSlide - leftSlide + 1);
        }

        return max;
    }
}
