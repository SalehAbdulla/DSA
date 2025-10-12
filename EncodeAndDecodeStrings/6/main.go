package main

import (
	"fmt"
	"strconv"
)

func main() {
	texts := []string{"neet", "code", "love", "you"}
	s := Solution{}
	fmt.Println(s.Encoded(texts))
	fmt.Println(s.Decoded(s.Encoded(texts)))

}

type Solution struct{}

func (s *Solution) Encoded(strs []string) (result string) {
	for _, str := range strs {
		result += strconv.Itoa(len(str)) + "#" + str
	}
	return
}

func (s *Solution) Decoded(encoded string) (result []string) {
	i := 0
	for i < len(encoded) {
		j := i
		for encoded[j] != '#' {j++}
		getLength, _ := strconv.Atoi(encoded[i:j])
		i = j + 1
		result = append(result, encoded[i:i+getLength])
		i += getLength
	}
	return
}
