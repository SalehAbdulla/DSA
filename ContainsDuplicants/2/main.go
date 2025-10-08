package main

func hasDuplicate(nums []int) bool {
    used := make(map[int]bool)
    for _, num := range nums {
        if used[num] {return true}
        used[num] = true
    }
    return false
}
