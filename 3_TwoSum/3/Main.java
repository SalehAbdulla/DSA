import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

    }

    public static int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> complements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (complements.get(nums[i]) != null) {
                return new int[]{complements.get(nums[i]), i};
            }

            complements.put(target - nums[i], i);
        }



        return nums;
    }
    
}
