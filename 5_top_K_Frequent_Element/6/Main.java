import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        int[] sol = Solution.topKFrequent(new int[]{1,2,2,3,3,3}, 2);
        System.out.println(Arrays.toString(sol));
    }
     
}

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> numFreqMap = new HashMap<>();

        for (int num : nums) {
            numFreqMap.put(num, numFreqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num: numFreqMap.keySet())
        {
            int freq = numFreqMap.get(num);
            if (buckets[freq] == null) 
                buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        }
        //System.out.println(Arrays.toString(buckets));

        List<Integer> result = new ArrayList<>();

        for (int i = buckets.length - 1; i > 0; i--){
            List<Integer> bucket = buckets[i];
            if (bucket == null) continue;
            result.add(bucket.get(0));
            if (result.size() == k) break;
                    
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
