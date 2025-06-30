import java.util.*;

public class SortingSolution {
    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        int[] solution = topKFrequentElements(nums, k);
        System.out.println(Arrays.toString(solution));
    }

    public static int[] topKFrequentElements(int[] nums, int k){
        //  number -> Occurrences
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
//        System.out.println(hashMap);

        // Convert HashMap into a nested Array
        // Because we can't sort the hashMap directly
        List<int[]> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a, b) -> b[0] - a[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr.get(i)[0];
        }

        return result;

    }
}



