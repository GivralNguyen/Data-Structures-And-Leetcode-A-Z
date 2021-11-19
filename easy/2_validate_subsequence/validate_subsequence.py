def isValidSubsequence(array, sequence):
	array_pointer = 0
	sequence_pointer = 0
	while array_pointer < len(array) and sequence_pointer < len(sequence):
		if (array[array_pointer] == sequence[sequence_pointer]):
			sequence_pointer += 1
		array_pointer +=1
	return sequence_pointer == len(sequence)
		
		
array = [5, 1, 22, 25, 6, -1, 8, 10]
sequence = [25]

result = isValidSubsequence(array, sequence)

print(result)