package src

func minDistance(word1 string, word2 string) int {
	memo := make([][]int, len(word1))
	for i := range len(word1) {
		memo[i] = make([]int, len(word2))
	}
	return dfs(word1, word2, 0, 0, memo)
}

func dfs(word1 string, word2 string, i int, j int, memo [][]int) int {
	if i == len(word1) {
		return len(word2) - j
	} else if j == len(word2) {
		return len(word1) - i
	} else if memo[i][j] != 0 {
		return memo[i][j]
	}
	if word1[i] == word2[j] {
		return dfs(word1, word2, i+1, j+1, memo)
	} else {
		del := dfs(word1, word2, i+1, j, memo)
		replace := dfs(word1, word2, i+1, j+1, memo)
		insert := dfs(word1, word2, i, j+1, memo)
		memo[i][j] = 1 + min(del, replace, insert)
		return memo[i][j]
	}
}
