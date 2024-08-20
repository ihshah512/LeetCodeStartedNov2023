#include <iostream>
#include <vector>

using namespace std;


vector<int> givenArr(vector<int> &arr1, vector<int> &arr2)
{
    int leftOne = 0;
    int leftTwo = 0;
    int rightOne = arr1.size();
    int rightTwo = arr2.size();
    // int returnArrLen = rightOne + rightTwo;
    vector<int> returnArr;
    // int leftOfReturnArr = 0;

    while (leftOne < rightOne && leftTwo < rightTwo)
    {

        if (arr1[leftOne] < arr2[leftTwo])
        {
            returnArr.push_back(arr1[leftOne]);

            leftOne++;
            //// leftOfReturnArr++;
        }
        else
        {
            returnArr.push_back(arr2[leftTwo]);
            leftTwo++;
            //  leftOfReturnArr++;
        }
    }

    while (leftTwo < rightTwo)
    {
        returnArr.push_back(arr2[leftTwo]);
        leftTwo++;
        // leftOfReturnArr++;
    }

    while (leftOne < rightOne)
    {
        returnArr.push_back(arr1[leftOne]);
        leftOne++;
        // leftOfReturnArr++;
    }


    return returnArr;
}


int main()
{
    vector<int> arrA = {2, 5, 8, 11, 16, 17};
    vector<int> arrB = {1, 3, 6, 7, 9};

    vector<int> arr = givenArr(arrA, arrB);

    for (int i : arr)
    {

        cout << i << ", ";
    }
    return 0;
}


/*
Example 3: Given two sorted integer arrays arr1 and arr2, 
return a new array that combines both of them and is also sorted.
*/