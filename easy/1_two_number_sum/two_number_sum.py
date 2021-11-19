# TS O(n)
def twoNumberSum(array, targetSum):
	hash_table = {} # hash table 
	for num in array: 
		remainder = targetSum - num 
		if remainder in hash_table:
			return [remainder,num]
		else: 
			hash_table[num]=True
	return []



if __name__ == "__main__":
    array = [3, 5, -4, 8, 11, 1, -1, 6]
    targetSum =10
    result = twoNumberSum(array, targetSum)
    print(result)