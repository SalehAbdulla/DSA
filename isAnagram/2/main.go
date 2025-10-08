package main
func isAnagram(s string, t string) bool {
    if len(s) != len(t) {return false}
    sFreq := GetFreq(s)
    tFreq := GetFreq(t)
    for i := 0; i < len(sFreq); i++ {
        if sFreq[i] != tFreq[i] {return false}
    }
    return true
}

func GetFreq(s string) []int {
    tape := make([]int, 26)
    for _, char := range s {tape[char - 'a']++}
    return tape
}
