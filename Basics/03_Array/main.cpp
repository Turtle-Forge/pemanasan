#include <iostream>
using namespace std;

int main()
{
    int num_arr[] = {10, 20, 30, 40, 50};
    cout << num_arr[0] << endl;
    cout << num_arr[1] << endl;
    cout << num_arr[2] << endl;
    cout << num_arr[3] << endl;
    cout << num_arr[4] << endl;

    cout << endl;

    int ukuran_arr = sizeof(num_arr) / sizeof(num_arr[0]);

    for (int i = 0; i < ukuran_arr; i++)
    {
        cout << num_arr[i] << " ";
    }

    cout << endl;

    int total = 0;
    // jumlahkan semua elemen array
    for (int i = 0; i < ukuran_arr; i++)
    {
        total += num_arr[i];
    }
    cout << "Total array = " << total << endl;

    cout << endl;

    int avg;
    // hitung rata-rata array
    for (int i = 0; i < ukuran_arr; i++)
    {
        total += num_arr[i];
        avg = total / ukuran_arr;
    }
    cout << "Rata-rata array = " << avg << endl;

    return 0;
}