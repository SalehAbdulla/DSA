package main

func topKFrequent(nums []int, k int) []int {
	hashMap := make(map[int]int)
	for _, n := range nums {
		hashMap[n]++
	}

	BucketSort := make([][]int, len(nums)+1)
	for key, value := range hashMap {
		BucketSort[value] = append(BucketSort[value], key)
	}

	var result []int
	for i := len(BucketSort) - 1; i >= 0; i-- {
		for _, val := range BucketSort[i] {
			if len(result) == k {
				break
			}
			result = append(result, val)
		}
	}

	return result
}