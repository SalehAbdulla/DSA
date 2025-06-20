import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double solutionOfMergedArrays = medianOfTwoArrays(new int[] {1, 3}, new int[] {2});
        System.out.println(solutionOfMergedArrays);
    }

    public static double medianOfTwoArrays(int[] nums1, int[] nums2) {
        int[] mergedArrays = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArrays[k] = nums1[i];
                i++;
            } else {
                mergedArrays[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < nums1.length) {
            mergedArrays[k] = nums1[i];
            k++;
            i++;
        }

        while (j < nums2.length) {
            mergedArrays[k] = nums2[j];
            k++;
            j++;
        }


        if (mergedArrays.length %2 == 1) {
            return mergedArrays[mergedArrays.length / 2];
        } else {
            return (double) (mergedArrays[mergedArrays.length / 2] + mergedArrays[(mergedArrays.length / 2) - 1]) / 2;
        }

    }

}

//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.