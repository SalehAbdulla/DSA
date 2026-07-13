import java.util.HashSet;

public class main {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3};
        String res = containsDuplicant(nums) ? "contains duplicant" : "does not contains duplicant";
        System.out.println(res);

    }

    public static boolean containsDuplicant(int[] nums) {
        HashSet<Integer> isSeen = new HashSet<>();
        for (int num: nums) {
            if (isSeen.contains(num))
                return true;
            isSeen.add(num);
        }
        return false;
    }
}
