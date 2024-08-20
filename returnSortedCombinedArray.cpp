#include <cstdlib>
#include <iostream>
#include <vector>


using namespace std;


vector<int> combineArray(const vector<int> &vecOne, const vector<int> &vecTwo)
{
    vector<int> returnVec;
    int leftOne = 0;
    int leftTwo = 0;
    int rightOne = vecOne.size();
    int rightTwo = vecTwo.size();

    while (leftOne < rightOne && leftTwo < rightTwo)
    {
        int firstVecOne = vecOne[leftOne];
        int firstVecTwo = vecTwo[leftTwo];
        if (firstVecOne < firstVecTwo)
        {
            returnVec.push_back(firstVecOne);
            leftOne++;
        }
        else
        {
            returnVec.push_back(firstVecTwo);
            leftTwo++;
        }
    }

    while (leftOne < rightOne)//make sure to use while loop here
    {
        returnVec.push_back(vecOne[leftOne]);
        leftOne++;
    }
    while (leftTwo < rightTwo)
    {
        returnVec.push_back(vecTwo[leftTwo]);
        leftTwo++;
    }

    return returnVec;
}

int main()
{
    vector<int> vec1 = {2, 4, 6, 8, 10, 12};
    vector<int> vec2 = {1, 3, 9, 11, 12, 13, 14, 15, 16};

    vector<int> re = combineArray(vec1, vec2);

    for (int i : re)
    {
        cout << i << " ,";
    }
}
/*
Example 3: Given two sorted integer arrays arr1 and arr2,
return a new array that combines both of them and is also sorted.
// cout << "RIght of vec one :" << rightOne << endl;
    //cout << "RIght of vec two :" << rightTwo << endl;

    /*Logic building:

    vector<int> vec1 = {2, 4, 6, 8, 10, 12};
    vector<int> vec2 = {1, 3, 9, 11, 12, 13};
    while(leftOne <= rightOne && leftTwo <= rightTwo){
if vec1 ele is less than vec two ele than push vec1 ele in return arr and increment leftone ++
else push vec1 element in return arr and increment ledfTwoo ++
get out of while loop and push the rest of leftover elements of that array which is not fully exaustive yet
for that if(leftone <= rightONe) push the element in return arry and increment leftone
if (leftTwo <=)


}


*/