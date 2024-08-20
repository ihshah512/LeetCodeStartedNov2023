#include <iostream>
#include <string>


bool isPalindrome(const std::string& s)
{
    int left = 0;
    int right = s.size() - 1; // Corrected to s.size() - 1

    while (left < right)
    {
        if (s[left] == s[right])
        {
            left++;
            right--;
        }
        else
        {
            return false;
        }
    }

    return true;
}

int main()
{
    bool re = isPalindrome("racecar");

   std::cout << std::boolalpha; // Use boolalpha to print true/false
    std::cout << "return: " << re << std::endl;

    return 0;
}
