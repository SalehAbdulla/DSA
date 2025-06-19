public class AnotherSolution {
    public static void main(String[] args) {
        int solution2 = getMaxSubStringLength("pwwkew");
        System.out.println(solution2);
    }

    public static int getMaxSubStringLength(String s) {

        int maxLength = 0;

        for (int leftSlide = 0 , rightSlide = 0; rightSlide < s.length(); rightSlide++) {

            int indexOfLastVisitedChar = s.indexOf(s.charAt(rightSlide), leftSlide);

            if (indexOfLastVisitedChar != rightSlide) {
                leftSlide = indexOfLastVisitedChar + 1;
            } else {
                maxLength = Math.max(maxLength, rightSlide - leftSlide + 1);
            }

        }

        return maxLength;
    }



}
