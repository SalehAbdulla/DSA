package main

func isAnagram(s string, t string) bool {
    if len(s) != len(t) {return false}
    sToFreq := getFrequency(s)
    tToFreq := getFrequency(t)
    for _, n1 := range sToFreq {
        for _, n2 := range tToFreq {
            if n1 != n2 {
                return false
            }
        }
    }
    return true
}

func getFrequency(s string) [26]int {
    var result [26]int
    for _, char := range s {
        getIndex := char - 'a' // a -> 0 
        result[getIndex]++
    }
    return result
}