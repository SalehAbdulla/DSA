package main

import (
	"fmt"
	"strconv"
)

type Solution struct{}

func (s *Solution) Encode(strs []string) (result string) {
	for _, str := range strs {
		result += strconv.Itoa(len(str)) + "#" + str
	}
	return
}

func (s *Solution) Decode(encoded string) (result []string) {
	i := 0 // Pointer i
	for i < len(encoded) {
		j := i // Pointer j
		for encoded[j] != '#' {j++} // I will move pointerJ to '#'
		length, _ := strconv.Atoi(encoded[i:j]) // takes the number only
		i = j + 1 // move i to be after # 
		result = append(result, encoded[i:i+length])
		i += length
	}
	return
}

func main(){
	s := &Solution{}
	encode := s.Encode([]string{"neet","code","love","you"})
	fmt.Println("encode", encode)
	decode := s.Decode(encode)
	fmt.Println("decode", decode)
}
