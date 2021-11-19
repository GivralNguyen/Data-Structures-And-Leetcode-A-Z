using namespace std;
#include<vector>
#include<iostream>
bool isValidSubsequence(vector<int> array, vector<int> sequence) {
  // Write your code here.
	int arrayIndex = 0;
	int sequenceIndex = 0;
	while (arrayIndex < array.size() && sequenceIndex < sequence.size()){
		if (array[arrayIndex]==sequence[sequenceIndex]){
			sequenceIndex++;
		}
		arrayIndex++;
	}
  return sequenceIndex == sequence.size();
}

int main()
{
    vector<int> Array = {5, 1, 22, 25, 6, -1, 8, 10};
    vector<int> Sequence = {1, 6, -1, 10};
	bool result = isValidSubsequence(Array, Sequence);
    cout << result << endl;
	return 0;
}