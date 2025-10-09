package main

func groupAnagrams(strs []string) [][]string {
    hashMap := make(map[[26]int][]string)
    for _, str := range strs {
        hashMap[getFreq(str)] = append(hashMap[getFreq(str)], str)
    }
    var result [][]string
    for _, v := range hashMap {
        result = append(result, v)
    }
    return result
}


func getFreq(s string) [26]int {
    var tape [26]int
    for _, char := range s {
        tape[char-'a']++
    }
    return tape
}
