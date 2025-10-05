package main

import "fmt"

func main() {
	s := "racecar"
	t := "carrace"

	solution := isAnagram(s, t)
	fmt.Println(solution)
}

func isAnagram(s string, t string) bool {
	sTape := getTape(s)
	tTape := getTape(t)
	for i := 0; i < len(s); i++ {
		if sTape[i] != tTape[i] {return false}
	}
	return true
}

func getTape(s string) []int {
	tape := make([]int, 26)
	for _, char := range s {
		// a -> 0
		getIdx := int(char - 'a')
		tape[getIdx]++
	}
	fmt.Println("%s: --> %v\n", s, tape)
	return tape
}
