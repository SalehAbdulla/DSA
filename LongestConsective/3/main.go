package main
func main(){}

func longestConsecutive(nums []int) int {
    if len(nums) == 0 {
        return 0
    }

    hashMap := make(map[int]bool)
    for _, num := range nums {
        hashMap[num] = true
    }

    maxLen := 0
    for _, n := range nums {
        // start only if it's the beginning of a sequence
        if !hashMap[n-1] {
            length := 1
            curr := n
            for hashMap[curr+1] {
                curr++
                length++
            }
            if length > maxLen {
                maxLen = length
            }
        }
    }
    return maxLen
}
