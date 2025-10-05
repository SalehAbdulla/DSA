package main

import "fmt"

func main() {

	nums := []int{1, 2}
	k := 2
	result := topKFrequent(nums, k)
	fmt.Println(result)
}

func topKFrequent(nums []int, k int) []int {
	// num -> freq
	hashMap := make(map[int]int)
	for _, n := range nums {
		hashMap[n]++
	}
	fmt.Println(hashMap)
	////----------
	// num, occur
	// [{1, 1},{2, 2},{3, 3}]
	result := make([][]int, len(nums)+1)
	//  0I,   1, 2,  3, 4
	// [{0}, {}, {}, {}, {}]
	for k, v := range hashMap {
		result[v] = append(result[v], k)
	}
	var buffer []int

	for i := len(result) - 1; i >= 0; i-- {
		for j := 0; j < len(result[i]); j++ {
			if len(buffer) == k {break}
			if len(result) == 0 {continue}
			buffer = append(buffer, result[i][j])
		}
		
	}

	return buffer
}
