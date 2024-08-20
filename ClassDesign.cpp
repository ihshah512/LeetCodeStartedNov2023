#include <iostream>
using namespace std;
/*Design a class which does following:
1. Inserting a value (no duplicates)
2. Removing a value
3. GetRandom a value that is already insert (with equal probality)
They are integers
*/


class DesignClass
{

    int val;

    explicit DesignClass(int val)
    {
        this->val = val;
    }
};

int main()
{

    int *array = new int[50];
    int **a2d = new int *[50];

    for (int i = 0; i < 50; i++)
        a2d[i] = new int[50];


    //cin.get();
}
