package main

func groupAnagrams(strs []string) (result [][]string) {
    hashMap := make(map[[26]int][]string)
    for _, str := range strs {
        hashMap[getFreq(str)] = append(hashMap[getFreq(str)], str)
    }
    for _, value := range hashMap {
        result = append(result, value)
    }
    return
}

func getFreq(s string) (result [26]int) {
    for _, char := range s {
        getIndex := char - 'a'
        result[getIndex]++
    }
    return
}