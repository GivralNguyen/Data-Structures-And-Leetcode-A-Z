#include <vector>
#include <unordered_set>
#include <iostream>
#include <string>
using namespace std;

vector <int> twoNumberSum(vector<int> array, int targetSum){
    unordered_set<int> hashTable;
    for (int num : array) {
        int remainder = targetSum - num;
        if(hashTable.find(remainder) != hashTable.end()){
            return vector <int>{remainder,num};
        }
        else{
            hashTable.insert(num);
        }
    }
    return {};
};

int main()
{
    vector<int> Array ={3, 5, -4, 8, 11, 1, -1, 6};
    int targetSum =10;
    vector<int> result = twoNumberSum(Array, targetSum);
    for (auto i: result) {
    std::cout << i << ' '; // will print: "a b c"
    }
    return 0;
}
