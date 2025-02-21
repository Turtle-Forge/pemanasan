public class _06_StringType {
    public static void main(String[] args) {
        // String
        // Tipe data string adalah tipe data yang digunakan untuk menyimpan teks.
        // Tipe data string dideklarasikan dengan menggunakan tanda petik dua (").
        // Contoh:
        // String nama = "John Doe";
        // Pada contoh di atas, variabel nama dideklarasikan dengan tipe data string dan
        // diinisialisasi dengan teks "John Doe".
        String nama = "John Doe";
        System.out.println(nama);

        // Concatenation
        // Concatenation adalah proses menggabungkan dua atau lebih string.
        // Concatenation dilakukan dengan menggunakan operator +.
        // Contoh:
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println("Hello, " + fullName + "!");
        System.out.println("Hello, " + (firstName + " " + lastName) + "!");

        // String length
        // String length adalah jumlah karakter dalam string.
        // String length dilakukan dengan menggunakan method length().
        // Contoh:
        String text = "Hello, World!";
        System.out.println(text.length());

        // String methods
        // String methods adalah method yang digunakan untuk memanipulasi string.
        // Beberapa string methods yang sering digunakan adalah:
        // 1. length() : mengembalikan panjang string.
        // 2. toUpperCase() : mengubah string menjadi huruf besar.
        // 3. toLowerCase() : mengubah string menjadi huruf kecil.
        // 4. trim() : menghapus spasi di awal dan akhir string.
        // 5. indexOf() : mencari indeks karakter tertentu dalam string.
        // 6. charAt() : mengembalikan karakter pada indeks tertentu dalam string.
        // 7. substring() : mengembalikan substring dari string.
        // 8. replace() : mengganti karakter dalam string.
        // 9. split() : membagi string menjadi array substring.
        // 10. startsWith() : mengecek apakah string diawali dengan karakter tertentu.
        // 11. endsWith() : mengecek apakah string diakhiri dengan karakter tertentu.
        // 12. contains() : mengecek apakah string mengandung karakter tertentu.
        // 13. equals() : mengecek apakah dua string sama.
        // 14. equalsIgnoreCase() : mengecek apakah dua string sama tanpa memperhatikan
        // huruf besar dan kecil.
        // 15. compareTo() : membandingkan dua string.
        // 16. compareToIgnoreCase() : membandingkan dua string tanpa memperhatikan
        // huruf
        // besar dan kecil.
        // 17. isEmpty() : mengecek apakah string kosong.
        // 18. concat() : menggabungkan dua string.
        // 19. format() : memformat string.
        // 20. valueOf() : mengubah tipe data lain menjadi string.
        // 21. join() : menggabungkan string dengan delimiter.
        // 22. repeat() : mengulang string.
        // 23. strip() : menghapus spasi di awal dan akhir string.
        // 24. stripLeading() : menghapus spasi di awal string.
        // 25. stripTrailing() : menghapus spasi di akhir string.
        // 26. isBlank() : mengecek apakah string kosong atau hanya berisi spasi.
        // 27. lines() : membagi string menjadi stream string.
        // 28. codePoints() : membagi string menjadi stream kode titik.
        // 29. format() : memformat string.
        // 30. transform() : mengubah string dengan function.
        // 31. translateEscapes() : mengubah karakter escape dalam string.
        // 32. repeat() : mengulang string.
        // 33. indent() : menambahkan indentasi pada string.

        // Contoh string methods
        String text2 = "Hello, World!";
        System.out.println(text2.toUpperCase()); // output: HELLO, WORLD!
        System.out.println(text2.toLowerCase()); // output: hello, world!
        System.out.println(text2.trim()); // output: Hello, World!
        System.out.println(text2.indexOf("World")); // output: 7
        System.out.println(text2.charAt(7)); // output: W
        System.out.println(text2.substring(7)); // output: World!
        System.out.println(text2.replace("World", "Java"));
        System.out.println(text2.split(",")[0]);
        System.out.println(text2.startsWith("Hello"));
        System.out.println(text2.endsWith("World!"));
        System.out.println(text2.contains("World"));
        System.out.println(text2.equals("Hello, World!"));
        System.out.println(text2.equalsIgnoreCase("hello, world!"));
        System.out.println(text2.compareTo("Hello, World!"));
        System.out.println(text2.compareToIgnoreCase("hello, world!"));
        System.out.println(text2.isEmpty());
        System.out.println(text2.concat(" Java"));
        System.out.println(String.format("Hello, %s!", "Java"));
        System.out.println(String.join(" ", "Hello,", "World!"));
        System.out.println(text2.repeat(2));
        System.out.println(text2.strip());
        System.out.println(text2.stripLeading());
        System.out.println(text2.stripTrailing());
        System.out.println(text2.isBlank());
        System.out.println(text2.lines().count());
        System.out.println(text2.codePoints().count());
        System.out.println(text2.transform(ch -> ch + " Java"));
        System.out.println(text2.translateEscapes());
        System.out.println(text2.repeat(2));
        System.out.println(text2.indent(4));

    }
}
