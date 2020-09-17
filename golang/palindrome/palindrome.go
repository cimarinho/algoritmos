package main

import (
	"fmt"
	"strings"
)

func main() {
	fmt.Println(isPalindrome("renner"))
	fmt.Println(isPalindrome("Go dog"))
	fmt.Println(isPalindrome("dog"))
}

func isPalindrome(word string) bool {
	result := ""
	for _, v := range word {
		result = string(v) + result
	}
	strings.
	return strings.EqualFold(compareRemoveSpace(result), compareRemoveSpace(word))
}

func compareRemoveSpace(word string) string {
	replace :=  strings.ReplaceAll(word, " ", "")
	return replace

}
