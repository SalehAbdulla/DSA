package main

func twoSum(nums []int, target int) []int {
    complements := make(map[int]int) // complement num -> index
    for i, n := range nums {
        if compVal, ok :=  complements[n]; ok {
            return []int {compVal, i}
        }
        complements[target - n] = i
    }
    return nil
}
