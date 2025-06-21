import java.time.OffsetDateTime;
import java.util.Arrays;

public class FindHasDuplicantsBySorting {
    public static void main(String[] args) {
        boolean solution = hasDuplicants(new int[] {1, 2, 2, 4, 5, 6});
        System.out.println(solution);
    }

    public static boolean hasDuplicants(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
