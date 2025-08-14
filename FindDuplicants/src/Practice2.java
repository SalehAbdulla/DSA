import java.util.HashSet;

public class Practice2 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 3};
        System.out.println(containsDuplicant2(nums));

    }

    public static boolean containsDuplicant(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicant2(int[] nums) {
        HashSet<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniqueNums.contains(nums[i])) {
                return true;
            }
            uniqueNums.add(nums[i]);
        }
        return false;
    }




}
