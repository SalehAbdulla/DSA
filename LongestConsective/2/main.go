package main

func longestConsecutive(nums []int) int {
    // Creating a hashSet with struct takes 0 byte in memory
    numSet := make(map[int]struct{})
    // fill the numSet with numbers, (unique keys)
    for _, num := range nums {
        numSet[num] = struct{}{}
    }
    longest := 0 // This will be update inner loop

    for num, _ := range numSet {
        // Check if this number is the first number of a sequence
        // if doens't have a lef neighbor, the we will go to the next step to check the right neighbors
        if _, exists := numSet[num - 1]; !exists { 
            length := 1
            for {
                if _, exists := numSet[num + length]; exists {
                    length++
                } else {
                    break
                }
            }
            if length > longest {longest=length}
        }
    }
    return longest
}