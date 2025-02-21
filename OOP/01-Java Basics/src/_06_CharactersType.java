public class _06_CharactersType {
    public static void main(String[] args) {
        // Tipe data karakter
        // Tipe data karakter adalah tipe data yang digunakan untuk menyimpan satu
        // karakter.
        // Tipe data karakter dideklarasikan dengan menggunakan tanda petik satu (').
        // Contoh:
        // char huruf = 'A';
        // Pada contoh di atas, variabel huruf dideklarasikan dengan tipe data char dan
        // diinisialisasi dengan karakter 'A'.

        // Contoh tipe data karakter
        char huruf = 'A';
        System.out.println(huruf);

        // Karakter khusus
        // Tipe data karakter juga dapat menyimpan karakter khusus seperti karakter
        // newline (\n), tab (\t), backspace (\b), carriage return (\r), formfeed (\f),
        // dan backslash (\).
        char newline = '\n'; // untuk membuat baris baru
        char tab = '\t'; // untuk membuat tab
        char backspace = '\b'; // untuk menghapus karakter sebelumnya
        char carriageReturn = '\r'; // untuk mengembalikan kursor ke awal baris
        char formfeed = '\f'; // untuk membuat halaman baru
        char backslash = '\\'; // untuk menampilkan karakter backslash

        System.out.println("Hello" + newline + "World!");
        System.out.println("Hello" + tab + "World!");
        System.out.println("Hello" + backspace + "World!");
        System.out.println("Hello" + carriageReturn + "World!");
        System.out.println("Hello" + formfeed + "World!");
        System.out.println("Hello" + backslash + "World!");

        // Escape sequence
        // Karakter khusus yang dimulai dengan backslash (\) disebut escape sequence.
        // Escape sequence digunakan untuk menampilkan karakter khusus yang sulit
        // ditulis.
        // Contoh escape sequence:
        // 1. \n : newline
        // 2. \t : tab
        // 3. \b : backspace
        // 4. \r : carriage return
        // 5. \f : formfeed
        // 6. \\ : backslash
        // 7. \' : single quote
        // 8. \" : double quote
        // 9. \ : backslash
        System.out.println("Hello\nWorld!");
        System.out.println("Hello\tWorld!");
        System.out.println("Hello\bWorld!");
        System.out.println("Hello\rWorld!");
        System.out.println("Hello\fWorld!");
        System.out.println("Hello\\World!");
        System.out.println("Hello\'World!");
        System.out.println("Hello\"World!");
        System.out.println("Hello\\World!");

        // Unicode
        // Tipe data karakter juga dapat menyimpan karakter unicode.
        // Karakter unicode dideklarasikan dengan menggunakan tanda petik satu (') dan
        // diikuti dengan kode unicode.
        // Contoh:
        char unicode = '\u0041';
        // Pada contoh di atas, variabel unicode dideklarasikan dengan tipe data char
        // dan diinisialisasi dengan karakter unicode yang memiliki kode XXXX.
        System.out.println(unicode);

        // Menggunakan ASCII
        // Tipe data karakter juga dapat menyimpan karakter ASCII.
        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        // Karakter kosong
        // Tipe data karakter juga dapat menyimpan karakter kosong.
        // Karakter kosong dideklarasikan dengan menggunakan tanda petik satu (') dan
        // diikuti dengan spasi.
        // Contoh:
        char spasi = ' ';
        // Pada contoh di atas, variabel spasi dideklarasikan dengan tipe data char dan
        // diinisialisasi dengan karakter spasi.
        System.out.println(spasi);
    }
}
