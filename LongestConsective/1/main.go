package main

func longestConsecutive(nums []int) int {
    hashSet := make(map[int]struct{})
    for _, num := range nums {
        hashSet[num] = struct{}{}
    }
    maxLength := 0

    for num, _ := range hashSet {
        if _, exists := hashSet[num-1]; !exists {
            length := 1
            for {
                if _, exists := hashSet[num + length]; exists {
                    length++
                } else {
                    break
                }
            }
            if length > maxLength {maxLength = length}
        }
    }
    return maxLength
}