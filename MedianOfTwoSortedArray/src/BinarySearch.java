import com.sun.source.util.SimpleDocTreeVisitor;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {5, 7, 9, 11, 13};
        int target = 11;

//        int result = linearSearch(nums, target);
        int result = binarySearch(nums, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

    }

    public static int linearSearch(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }


    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int midIndex = (right + left) / 2;

            if (nums[midIndex] == target) {
                return midIndex; // Here were we tight the array
            } else if (nums[midIndex] < target) {
                left = left + 1;
            } else {
                right = right - 1;
            }

        }

        return -1;
    }


}
