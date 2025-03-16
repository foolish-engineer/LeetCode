package src

func palindromePermutation(s string) bool {
	counts := make(map[int]int)
	for _, val := range s {
		counts[int(val)] += 1
	}

	oddCount := 0

	for _, val := range counts {
		if val%2 == 1 {
			oddCount += 1
		}
	}

	return oddCount <= 1
}
