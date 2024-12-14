func containsDuplicate(nums []int) bool {
	record := make(map[int]int)

	for _, num := range nums {
		if _, ok := record[num]; !ok {
			record[num] = 1
		} else {
			return true
		}
	}
	return false
}