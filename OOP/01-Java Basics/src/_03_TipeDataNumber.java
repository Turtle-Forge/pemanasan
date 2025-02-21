public class _02_TipeDataNumber {

    public static void main(String[] args) {
        // Tipe data number
        // Tipe data number adalah tipe data yang digunakan untuk menyimpan data
        // numerik.
        // Tipe data number terdiri dari:
        // 1. Integer
        // 2. Floating-point

        // Integer
        // Tipe data integer digunakan untuk menyimpan bilangan bulat.
        // Tipe data integer terdiri dari:
        // 1. byte
        // 2. short
        // 3. int
        // 4. long

        // byte
        // Tipe data byte digunakan untuk menyimpan bilangan bulat dengan rentang -128
        // sampai 127.
        byte numberByte = 100;
        System.out.println(numberByte);

        // short
        // Tipe data short digunakan untuk menyimpan bilangan bulat dengan rentang
        // -32,768 sampai 32,767.
        short numberShort = 1000;
        System.out.println(numberShort);

        // int
        // Tipe data int digunakan untuk menyimpan bilangan bulat dengan rentang
        // -2,147,483,648 sampai 2,147,483,647.
        int numberInt = 1000000;
        System.out.println(numberInt);

        // long
        // Tipe data long digunakan untuk menyimpan bilangan bulat dengan rentang
        // -9,223,372,036,854,775,808 sampai 9,223,372,036,854,775,807.
        long numberLong = 1000000000;
        System.out.println(numberLong);

        // Floating-point
        // Tipe data floating-point digunakan untuk menyimpan bilangan desimal.
        // Tipe data floating-point terdiri dari:
        // 1. float
        // 2. double

        // float
        // Tipe data float digunakan untuk menyimpan bilangan desimal dengan rentang
        // 3.4e-038 sampai 3.4e+038.
        float numberFloat = 3.14f;
        System.out.println(numberFloat);

        // double
        // Tipe data double digunakan untuk menyimpan bilangan desimal dengan rentang
        // 1.7e-308 sampai 1.7e+308.
        double numberDouble = 3.14;
        System.out.println(numberDouble);

        // Cara lain penulisan tipe data number
        // Tipe data number juga bisa ditulis dengan cara
        // menggunakan underscore (_) sebagai pemisah angka.
        int numberInt2 = 1_000_000;
        System.out.println(numberInt2);
        int numberInt3 = 10_000_000;
        System.out.println(numberInt3);
        System.out.println(numberInt2 + numberInt3);
    }
}