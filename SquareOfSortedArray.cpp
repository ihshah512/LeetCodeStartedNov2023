#include <iostream>
#include <vector>
using namespace std;

vector<int> returnSortedAsecding(vector<int> &vec)
{
    vector<int> reVec;
    auto left = vec.begin();
    auto right = vec.end() - 1;
    //int firstSquare = (*left) * (*left);
    //reVec.push_back(firstSquare);
    //left++;
    while (left <= right)
    {
        int Square = *left * *left;

        reVec.push_back(Square);


        left++;
    }
    
    auto leftRe = reVec.begin();
    auto rightRe = reVec.end() - 1;
    auto firstEle = *leftRe;
    while (leftRe < rightRe)
    {
        int temp = *(leftRe + 1);
        if (firstEle < temp)
        {
            reVec.push_back(firstEle);
        }
        else
        {
            reVec.push_back(temp);
        }
leftRe++;
        
    }

    return reVec;
}

int main()
{

    vector<int> ve = {-4, -1, 0, 3, 10};

    vector<int> re = returnSortedAsecding(ve);


    for (int i : re)
    {
        cout << i << " ,";
    }
}

/*
Given an integer array nums sorted in 
non-decreasing order, return an array of the squares of each
number sorted in non-decreasing order.


*/