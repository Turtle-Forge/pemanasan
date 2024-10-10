#include <iostream>
using namespace std;
int main()
{
    for (int i = 1; i <= 5; i++)
    {
        cout << i << ". Hello World" << endl;
    }
    cout << endl;
    int i = 1;
    while (i <= 5)
    {
        cout << i << ". Hello World" << endl;
        i++;
    }
    cout << endl;
    int k = 1;
    do
    {
        cout << k << ". Hello World" << endl;
        k++;
    } while (k <= 5);
    return 0;
}