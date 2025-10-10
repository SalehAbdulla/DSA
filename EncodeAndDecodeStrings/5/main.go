package main

import (
	"fmt"
	"strconv"
)

func main() {
	texts := []string{"neet", "code", "love", "you"}
	s := Solution{}
	encoded := s.Encoded(texts)
	fmt.Println(encoded)
	decoded := s.Deconded(encoded)
	fmt.Println(decoded)
}

type Solution struct{}

func (s *Solution) Encoded(strs []string) string {
	var res string
	for _, str := range strs {
		res += strconv.Itoa(len(str)) + "#" + str
	}
	return res
}


func (s *Solution) Deconded(encoded string) []string {
    var res []string
    i := 0
    for i < len(encoded){
        j := i
        for encoded[j] != '#' {j++}
        getLength, _ := strconv.Atoi(encoded[i:j])
        i = j + 1
        res = append(res, encoded[i:i+getLength])
        i += getLength
    }
    return res
}
