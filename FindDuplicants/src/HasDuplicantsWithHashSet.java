import java.util.HashSet;
import java.util.Set;

public class HasDuplicantsWithHashSet {
    public static void main(String[] args) {
        boolean solution = hasDuplicants(new int[] {1, 2, 2, 4, 5, 6});
        System.out.println(solution);
    }

    public static boolean hasDuplicants(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num: nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}
