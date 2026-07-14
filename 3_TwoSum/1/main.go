package main

func twoSum(nums []int, target int) []int {
    complements := make(map[int]int)
    for i, num := range nums {
        if complemetIndex, exists := complements[num]; exists {
            return []int{complemetIndex, i}
        }
        complements[target-num] = i
    }
    return nums
}
