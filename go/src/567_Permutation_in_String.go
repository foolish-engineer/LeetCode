package src

func compareMaps(m1 map[int]int, m2 map[int]int) bool {
	if len(m1) != len(m2) {
		return false
	}
	for char, count := range m1 {
		if m2[char] != count {
			return false
		}
	}
	return true
}

func checkInclusion(s1 string, s2 string) bool {
	s1counts := make(map[int]int)
	s2counts := make(map[int]int)
	s1len := len(s1)

	for _, val := range s1 {
		s1counts[int(val)] += 1
	}

	for i, val := range s2 {
		s2counts[int(val)] += 1
		if i >= s1len-1 {
			if compareMaps(s1counts, s2counts) {
				return true
			}
			indexToRemove := s2[i-s1len+1]
			s2counts[int(indexToRemove)] -= 1
			if s2counts[int(indexToRemove)] == 0 {
				delete(s2counts, int(indexToRemove))
			}
		}
	}
	return false
}

func checkInclusion2(s1 string, s2 string) bool {
	var s1counts [26]int
	var s2counts [26]int
	s1len := len(s1)

	for _, val := range s1 {
		s1counts[val-'a'] += 1
	}

	for i, val := range s2 {
		s2counts[val-'a'] += 1
		if i >= s1len-1 {
			if s1counts == s2counts {
				return true
			}
			indexToRemove := s2[i-s1len+1]
			s2counts[indexToRemove-'a'] -= 1
		}
	}
	return false
}
