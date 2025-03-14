package src

func containsDuplicate(nums []int) bool {
	m := make(map[int]int)
	for i := 0; i < len(nums); i++ {
		if m[nums[i]] != 0 {
			return true
		}
		m[nums[i]] = 1
	}
	return false
}

func containsDuplicate2(nums []int) bool {
	m := make(map[int]int)
	for i := range nums {
		if m[nums[i]] != 0 {
			return true
		}
		m[nums[i]] = 1
	}
	return false
}

func containsDuplicate3(nums []int) bool {
	m := make(map[int]int)
	for _, val := range nums {
		if m[val] != 0 {
			return true
		}
		m[val] = 1
	}
	return false
}
