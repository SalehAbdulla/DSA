package main

import (
	"fmt"
	"strconv"
)

type Solution struct{}

func (s *Solution) Encode(strs []string) string {
	var result string
	for _, str := range strs {
		result += strconv.Itoa(len(str)) + "#" + str
	}
	return result
}


func (s *Solution) Decode(str string) []string {
	var result []string
	i := 0
	for i < len(str) {
		j := i
		for str[j] != '#' {j++}
		getWordLength, _ := strconv.Atoi(str[i:j])
		i = j + 1
		result = append(result, str[i:i+getWordLength])
		i += getWordLength
	}
	return result
}

func main(){
	solution := &Solution{}
	input := []string{"neet", "code", "Loves", "Me"}
	encode := solution.Encode(input)
	decode := solution.Decode(encode)
	fmt.Println(decode)
}