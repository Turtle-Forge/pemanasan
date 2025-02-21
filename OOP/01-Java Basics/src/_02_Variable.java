public class _02_Variable {
    public static void main(String[] args) {
        // Deklarasi variabel
        // Variabel adalah tempat untuk menyimpan data.
        // Variabel digunakan untuk menyimpan data sementara yang akan digunakan dalam
        // program.
        // Variabel dideklarasikan dengan menentukan tipe data dan nama variabel.
        // Contoh:
        // int number;
        // Pada contoh di atas, variabel number dideklarasikan dengan tipe data int.
        // Variabel number dapat digunakan untuk menyimpan bilangan bulat.
        int number; // Deklarasi variabel number dengan tipe data int
        number = 100; // Inisialisasi variabel number dengan nilai 100
        System.out.println(number); // Output: 100
        String name; // Deklarasi variabel name dengan tipe data String
        name = "John Doe"; // Inisialisasi variabel name dengan nilai "John Doe"
        System.out.println(name); // Output: John Doe
        boolean isJavaFun; // Deklarasi variabel isJavaFun dengan tipe data boolean
        isJavaFun = true; // Inisialisasi variabel isJavaFun dengan nilai true
        System.out.println(isJavaFun); // Output: true
        char letter; // Deklarasi variabel letter dengan tipe data char
        letter = 'A'; // Inisialisasi variabel letter dengan nilai 'A'
        System.out.println(letter); // Output: A
        double numberDouble; // Deklarasi variabel numberDouble dengan tipe data double
        numberDouble = 3.14; // Inisialisasi variabel numberDouble dengan nilai 3.14
        System.out.println(numberDouble); // Output: 3.14
        float numberFloat; // Deklarasi variabel numberFloat dengan tipe data float
        numberFloat = 3.14f; // Inisialisasi variabel numberFloat dengan nilai 3.14
        System.out.println(numberFloat); // Output: 3.14
        long numberLong; // Deklarasi variabel numberLong dengan tipe data long
        numberLong = 1000000000; // Inisialisasi variabel numberLong dengan nilai 1000000000
        System.out.println(numberLong); // Output: 1000000000

        // Mengganti nilai variabel
        // Nilai variabel dapat diubah setelah dideklarasikan.
        // Contoh:
        // int number = 100;
        // number = 200;
        // Pada contoh di atas, nilai variabel number diubah dari 100 menjadi 200.
        int number2 = 100; // Deklarasi variabel number2 dengan tipe data int dan nilai 100
        number2 = 200; // Mengganti nilai variabel number2 dari 100 menjadi 200
        System.out.println(number2); // Output: 200

        // Variabel konstanta
        // Variabel konstanta adalah variabel yang nilainya tidak dapat diubah setelah
        // dideklarasikan.
        // Variabel konstanta dideklarasikan dengan menggunakan kata kunci final.
        // Contoh:
        // final int number = 100;
        // Pada contoh di atas, variabel number dideklarasikan dengan tipe data int dan
        // nilai 100.
        // Nilai variabel number tidak dapat diubah setelah dideklarasikan.
        final int number3 = 100; // Deklarasi variabel number3 dengan tipe data int dan nilai 100
        // number3 = 200; // Error: cannot assign a value to final variable number3
        System.out.println(number3); // Output: 100

        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;
        String myText = "Hello";
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

        // Deklarasi variabel dengan nilai awal
        // Variabel dapat dideklarasikan dengan nilai awal.
        // Contoh:
        // int number = 100;
        // Pada contoh di atas, variabel number dideklarasikan dengan tipe data int dan
        // nilai 100.
        int number4 = 100; // Deklarasi variabel number4 dengan tipe data int dan nilai 100
        System.out.println(number4); // Output: 100

        // Multiple declaration
        // Variabel dapat dideklarasikan secara bersamaan dalam satu baris.
        // Contoh:
        // int number1, number2, number3;
        // Pada contoh di atas, variabel number1, number2, dan number3 dideklarasikan
        // dengan tipe data int.
        int number5, number6, number7; // Deklarasi variabel number5, number6, dan number7 dengan tipe data int
        number5 = 100; // Inisialisasi variabel number5 dengan nilai 100
        number6 = 200; // Inisialisasi variabel number6 dengan nilai 200
        number7 = 300; // Inisialisasi variabel number7 dengan nilai 300
        System.out.println(number5); // Output: 100
        System.out.println(number6); // Output: 200
        System.out.println(number7); // Output: 300

        // Multiple assignment
        // Variabel dapat diinisialisasi secara bersamaan dalam satu baris.
        // Contoh:
        // int number1 = 100, number2 = 200, number3 = 300;
        // Pada contoh di atas, variabel number1 diinisialisasi dengan nilai 100,
        // variabel
        // number2 diinisialisasi dengan nilai 200, dan variabel number3 diinisialisasi
        // dengan nilai 300.
        int number8 = 100, number9 = 200, number10 = 300; // Deklarasi variabel number8, number9, dan number10 dengan
                                                          // tipe data int dan nilai 100, 200, dan 300
        System.out.println(number8); // Output: 100
        System.out.println(number9); // Output: 200
        System.out.println(number10); // Output: 300

    }
}
