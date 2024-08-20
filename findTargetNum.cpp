#include <iostream>
#include <vector>

using namespace std;

bool foundTargetSum(const vector<int> &arr, int sum)
{
    int left = 0;
    int right = arr.size() - 1;

    while (left < right)
    {
        int runningSum = arr[left] + arr[right];
        if (runningSum < sum)
        {
            left++;
        }
        else if (runningSum > sum)
        {
            right--;
        }
        else if (runningSum == sum)
        {
            return true;
        }
    }

    return false;
}


int main()
{
    vector<int> vec = {2, 3, 5, 6, 9, 10};
    int sum = 17;
    cout << boolalpha;
    cout << foundTargetSum(vec, sum) << endl;
}
/*
Example 2: Given a sorted array of unique integers and a target integer, return true if there 
exists a pair of numbers that sum to target, false otherwise. This problem is similar to Two Sum. 
(In Two Sum, the input is not sorted).

For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, return true because 4 + 9 = 13.
*/