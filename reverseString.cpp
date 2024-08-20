#include <iostream>
#include <vector>
using namespace std;
void reverseString(vector<char> &s)
{
    auto left = s.begin();
    auto right = s.end()-1;
   // int right = s.size() - 1;

    while (left < right)
    {
        char temp = *left;


        *left = *right;
        *right = temp;
        //s.erase(s[left]);
        left++;
        right--;
    }
}


int main()
{
    vector<char> r = {'i', 'm', 'r', 'a', 'n'};

    reverseString(r);

    for (char c : r)
    {
        cout << c << " ,";
    }
}