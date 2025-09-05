package main
func main(){}

func longestConsecutive(nums []int) int {
    hashMap := make(map[int]bool)
    for _, num := range nums {hashMap[num] = true}

    max := 0
    for _, num := range nums {
        isNumBeforeIt := hashMap[num-1]
        if !isNumBeforeIt {
            subMax := 1
            for hashMap[num + 1] {
                subMax++
                num = num + 1
            }
            if subMax > max {max = subMax}
        }
    }
    return max
}
