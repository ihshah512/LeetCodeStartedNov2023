#include <cstdlib> //for std::malloc and std::free
#include <cstring> //for std::strlen and strcpy
#include <iostream>

using namespace std;


enum class Names
{
    IMRAN,
    RIZWAN,
    AHTSHAM,
    AMBREEN,
    TASKEEN,
    NOUSHEEN

}; //CORRECT

char *getNames(Names name)
{
    char *result = nullptr;
    switch (name)
    {
    case Names::IMRAN:
    {
        size_t len1 = strlen("IMRAN") + 1;
        /*
Type Appropriateness: size_t is specifically designed for representing sizes and lengths. It is an unsigned integer type and is guaranteed to be able to represent the size of any object in memory (i.e., array sizes, lengths of strings, etc.).
Platform Independence: size_t adjusts to the architecture of the system. On a 32-bit system, it might be 4 bytes, and on a 64-bit system, it could be 8 bytes. This helps ensure that your code handles larger sizes correctly on different platforms.
Avoiding Negative Values: Since size_t is unsigned, it naturally avoids negative values, which don’t make sense for lengths or sizes.
Compatibility: Functions like strlen return size_t, so using size_t ensures compatibility and avoids potential issues with type mismatches.

*/
        result = (char *)malloc(len1);
        if (result)
        {
            strcpy(result, "Imran");
        };
        return result; break;
    }
    case Names::AHTSHAM:
    {
size_t len2 = strlen("AHTASHAM") + 1;
        result = (char*)malloc(len2);
        strcpy(result, "Ahtahsm");
        return result; break;
        
        }
        

    default:
        break;
    }
}

int main()
{
    char *re = getNames(Names::AHTSHAM);
    if (re)
    {
        std::cout << re << " is the eldest son " << std::endl;
        std::free(re);
    }
}