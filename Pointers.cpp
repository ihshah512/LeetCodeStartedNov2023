#include <cstdlib>
#include <cstring>
#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
using namespace std;

void printCharArray(char *C)
{

    while (*C != '\0')
    {
        printf("%c", *C);
        C++; //AS WE KNOW WHEN WE INCREMENT THE POINTER IT INCREMENTS BY THE SIZE OF DATA TYPE TO WHICH POINTER IS POINTIG TO
    }
}


void incrementWithPointerAutoCasting(unsigned int *a) //PASS BY VALUE
{

    *a = *a + 1;
}
void incrementWithPointer(int *a) //PASS BY VALUE
{

    *a = *a + 1;
}

void incrementWIthoutA(unsigned int a) //PASS BY VALUE
{

    a = a + 1;
}


void increment(int &a) //PASS BY ADDRESS/REFERENCE
{

    a = a + 1;
}

int sumofEle(int A[], int size)
{
    int i, sum = 0;
    //int Asize = sizeof(A) / sizeof(A[0]);

    for (i = 0; i < size; i++)
    {
        sum += A[i];
    }
    return sum;
}

int sumofEleWithoutPassingSize(int A[])
{
    int i, sum = 0;
    //int Asize = sizeof(A) / sizeof(A[0]);
    cout << A << " A ;" << endl;
    //string *str = reinterpret_cast<string *>(&A);
    //cout << str << " str;" << endl;
    cout << A + 1 << " A ;" << endl;
    cout << sizeof((A + 1) - (A)) << " A +1 -A;" << endl;
    cout << A + 2 << " A ;" << endl;

    for (i = 0; A[i] != -1; i++)
    {
        sum += A[i];
    }
    return sum;
}

void writeYourOwnPrintCharFunc(char *D)
{
    // int i = 0; its redundant
    while (*D != '\0')
    {
        cout << *D << ", " << D << " ";
        D++; //this will increment ny the size of the data type we re dealing with in our case its char thus one byte would be incremented.
    }
    cout << "\n\n";
}

void writeYourOwnPrintCharFuncE(char *D)
{
    // int i = 0; its redundant
    while (*D != '\0')
    {
        cout << *D << ", " << D << " ";
        D++; //this will increment ny the size of the data type we re dealing with in our case its char thus one byte would be incremented.
    }
    *(D + 1) = 'm'; //could not do this code thrown an error that its const
    cout << "\n\n";
}

int main()
{
    /*Memory allocation: stack contain local and function variables. Global goes in global mem. Stake frame contain function mem location. Main func is also
lying in stack. 
4104696490+70377771010+alecity solutions 18778283276+2069F779F
*/

    char CC[20] = "Hello";
    printCharArray(CC);
    cout << "\n\n";
    cout << "*********how to use char[] or strings in C++***** \n\n";

    char C[10]; //IN THIS CASE THE SIZE OF CHAR ARRAY SHOULD BE GREATER OR EQUAL TO
    //THE NUMBER OF CHARS IN THE ARRAY
    C[0] = 'j';
    C[1] = '1';
    C[2] = 'o';
    C[3] = 'n';
    C[4] = '\0';       //IN THIS CASE WHERE WE ARE ASSIGNING VALUES SINGLY; WE HAVE TO
                       // PUT NULL CHARACTER '\0' OTHER WISE WE WOULD GET GARBABE VALUES
                       // FOR REST OF THE ARRAY SIZE
    char D[] = "JOHN"; //IN THIS CASE NULL TERMINATOR WILL COME WITH THIS ARR
    writeYourOwnPrintCharFunc(D);
    int len = strlen(D);
    cout << "length is : " << len << "and size is :" << sizeof(D) << endl;
    printf(D, "\n\n"); //IN THIS CASE WE DONT NEED TO SPECIFY SIZE
    printf("\n\n");

    printf(C, "\n\n");
    printf("\n\n");

    const char *E = "IMRAN"; //storing string flike this would not allow us to change the characters. it would be consts
    //if we want to make string mutable means we can modify it then we have to dynamically allocate its memory
    char *dynamicAllocation = (char *)malloc(strlen(E + 20));
dynamicAllocation[strlen(E) + 2] = 'h';
    if (dynamicAllocation)
    {
        strcpy(dynamicAllocation, E);
        
        {
            cout << "dynamic array------------ " << dynamicAllocation << endl;
        }
        free(dynamicAllocation);
    }
    else
    {
        printf("memory allcoation failed");
    }

    //int arrB[] = {3, 4, 6, 8, 10, -1};
    int arrB[] = {3, 4, 5};
    int sizeArrB = sizeof(arrB) / sizeof(arrB[0]);
    cout << sizeof(arrB) << "  " << sizeof(arrB[0]) << endl;
    int re = sumofEle(arrB, sizeArrB);
    int reWithoutSize = sumofEleWithoutPassingSize(arrB);
    cout << "sum is : " << re << endl;
    cout << "sum without size is : " << reWithoutSize << endl;

    cout << "*********how to use pointers in function***** \n\n";
    int z = 1;
    int y = 1;
    int x = 1;
    int v = 1;
    incrementWithPointerAutoCasting(reinterpret_cast<unsigned int *>(&v));
    incrementWithPointer(&x);
    increment(z);
    incrementWIthoutA(y);
    cout << "PASSED WITH pointer casting :" << v << "\n\n";
    cout << "PASSED WITH & :" << z << "\n\n";
    cout << "PASSED WITHout & :" << y << "\n\n";
    cout << "PASSED WITH POINTER :" << x << "\n\n";
    cout << "*********Pointers and Arrays***** \n\n";
    int arr[] = {2, 4, 6, 8, 10, 11};
    int *p;
    p = &arr[0];
    for (int i = 0; i < 6; i++)
    {
        // p = p+i;
        cout << *(p + i) << endl; //here base address is stored in p
        //p=p + i;
        // i++;
    }
    for (int i = 0; i < 6; i++)
    {
        // p = p+i;
        cout << *(arr + i) << endl; //here arr gives by base address
        //p=p + i;
        // i++;
    }

    cout << "*********Arrays as function pointers***** \n\n";


    //or

    int a = 9;


    //cout << &a << endl; //to get address of a variable

    // int *b;
    int *b = &a;
    // a=5;
    //cout << b + 1 << "   sizeof: " << sizeof(b + 1) << endl;
    //how to create pointer to a pointer
    // int d = 10;
    //*b = &d;
    *b = 10;
    int **c = &b;

    int ***d = &c;

    // ***d = 1000;
    //a = 2000;
    // *b = a;
    // *b = a+1;
    // **c =a;
    cout << "To print the int value stored in ***d: " << ***d << endl << endl;
    cout << "To print the memory address of pointer c** :" << **d << endl << endl;
    cout << "To print the memory address of pointer b* :" << *d << endl << endl;

    cout << "To print the values stored at pointer c** :" << **c << endl << endl;
    cout << "To print the values stored  at pointer b* :" << *b << endl << endl;
    cout << "**c: " << **c << "*c: " << *c << " *b: " << *b << endl;
    cout << "c: " << c << " b: " << b << " a: " << a << " c - b = " << endl;
    cout << "&c: " << &c << " &b: " << &b << " &a: " << &a << " c - b = " << endl;

    cout << b << "   sizeof: " << sizeof(b + 1) << endl;

    string *str;
    cout << (b + 1) - b << endl;

    cout << "size_t : " << sizeof(size_t) << endl;
    cout << "unsigned short : " << sizeof(unsigned short) << endl;
    cout << "unsigned int : " << sizeof(unsigned int) << endl;
    cout << "long : " << sizeof(long) << endl;
    cout << "long long : " << sizeof(long long) << endl;
    cout << "double : " << sizeof(double) << endl;
    cout << "char : " << sizeof(char) << endl;
    cout << "string : " << sizeof(string) << endl;
    cout << "*b: " << sizeof(*b) << endl;
    cout << "__int128: " << sizeof(__int128) << endl;
    cout << "*str: " << sizeof(*str) << endl;

    // cout << &b<< endl;
}