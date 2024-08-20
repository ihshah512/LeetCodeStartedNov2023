#include <iostream>
#include <cstring>
#include <cstdlib>
#include <vector>
using namespace std;

//how to deal with 2D OR 3D arrays in c++

void print(const std::vector<std::vector<int>> &vec)
{
    for (const auto& row : vec)
    {
        for (int val : row)
        {
            cout << val << endl;
        }
    }
}

int main()
{

    int rows = 3; int cols = 4;
    vector<vector<int>> given(rows, vector<int>(cols));

    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < cols; j++)
        {
            given[i][j]= i *cols + j;
        }
    }
print(given);
}