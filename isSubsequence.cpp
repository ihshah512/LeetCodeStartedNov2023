#include <iostream>
#include <string>

using namespace std;


bool isSubSeq(const string &bigStr, const string &smallStr)
{

    int leftBigStr = 0;
    int rightBigStr = bigStr.length();
    int leftSmallStr = 0;
    int rightSmallStr = smallStr.length();

    while (leftBigStr < rightBigStr && leftSmallStr < rightSmallStr)
    {
        if (smallStr.at(leftSmallStr) == bigStr.at(leftBigStr))
        {
            leftSmallStr++;
        }
        else
        {
            leftBigStr++;
        }
    }

    return leftSmallStr == rightSmallStr;
}


int main()
{

    string str1 = "imranhussainshah";
    string str2 = "hussshahz";

    cout << boolalpha;
    cout << isSubSeq(str1, str2);
    return 0;
}


/*
Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
e.g. ace is subsequece of abcde
*/