import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice1 {
    public static void main(String[] args) {
        int[] arrayForTest = {1, 3, 4, 5};
        int[] arrayForTest2 = {1, 3, 4, 5, 3};
        System.out.println(solutionOne(arrayForTest));
        System.out.println(solutionOne(arrayForTest2));

        System.out.println("-".repeat(30));


        System.out.println(solutionTwo(arrayForTest));
        System.out.println(solutionTwo(arrayForTest2));

        System.out.println("-".repeat(30));


        System.out.println(solutionThree(arrayForTest));
        System.out.println(solutionThree(arrayForTest2));



    }

    // Time complexity O(n^2)
    public static boolean solutionOne(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }

        return false;
    }

    // O(n log n) -> grows proportionally with input multiply by log n
    public static boolean solutionTwo(int[] array) {
        Arrays.sort(array); // returns void
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] == array[i + 1]) {
                return true;
            }
        }
        return false;
    }

    // O(n) -> Linear Time
    public static boolean solutionThree(int[] array) {
        Set<Integer> seen = new HashSet<>();

        for (int element : array) {
            if (seen.contains(element)) {
                return true;
            }
            seen.add(element);
        }

        return false;

    }




}


// Given an integer array nums,
// return true if any value appears more than once in the array, otherwise return false.

//Input: nums = [1, 2, 3, 3]
//Output: true