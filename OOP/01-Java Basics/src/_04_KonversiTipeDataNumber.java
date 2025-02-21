public class _04_KonversiTipeDataNumber {
    public static void main(String[] args) {
        // Konversi tipe data number
        // Konversi tipe data number adalah proses mengubah tipe data number ke tipe
        // data number lain.
        // Konversi tipe data number terdiri dari:
        // 1. Widening Casting
        // 2. Narrowing Casting

        // Widening Casting
        // Widening Casting adalah konversi tipe data number yang lebih kecil ke tipe
        // data number yang lebih besar.
        // Widening Casting tidak memerlukan syntax tambahan.
        // Widening Casting dilakukan secara otomatis oleh Java.
        // Widening Casting aman dilakukan karena rentang nilai tipe data number yang
        // lebih kecil akan selalu masuk ke rentang nilai tipe data number yang lebih
        // besar.
        // Widening Casting dilakukan secara otomatis oleh Java.
        byte numberByte = 100;
        short numberShort = numberByte;
        int numberInt = numberShort;
        long numberLong = numberInt;
        float numberFloat = numberLong;
        double numberDouble = numberFloat;

        System.out.println(numberByte);
        System.out.println(numberShort);
        System.out.println(numberInt);
        System.out.println(numberLong);
        System.out.println(numberFloat);
        System.out.println(numberDouble);

        // Mengecek rentang nilai tipe data number
        // Rentang nilai tipe data number dapat dilihat di dokumentasi resmi Java.
        System.out.println("Rentang nilai tipe data byte: " + Byte.MIN_VALUE + " sampai " + Byte.MAX_VALUE);
        System.out.println("Rentang nilai tipe data short: " + Short.MIN_VALUE + " sampai " + Short.MAX_VALUE);
        System.out.println("Rentang nilai tipe data int: " + Integer.MIN_VALUE + " sampai " + Integer.MAX_VALUE);
        System.out.println("Rentang nilai tipe data long: " + Long.MIN_VALUE + " sampai " + Long.MAX_VALUE);
        System.out.println("Rentang nilai tipe data float: " + Float.MIN_VALUE + " sampai " + Float.MAX_VALUE);
        System.out.println("Rentang nilai tipe data double: " + Double.MIN_VALUE + " sampai " + Double.MAX_VALUE);

        // // Narrowing Casting
        // // Narrowing Casting adalah konversi tipe data number yang lebih besar ke
        // tipe
        // // data number yang lebih kecil.
        // // Narrowing Casting memerlukan syntax tambahan.
        // // Narrowing Casting tidak dilakukan secara otomatis oleh Java.
        // // Narrowing Casting tidak aman dilakukan karena rentang nilai tipe data
        // number
        // // yang lebih besar tidak selalu masuk ke rentang nilai tipe data number yang
        // // lebih kecil.
        // // Narrowing Casting dilakukan secara manual oleh programmer.
        double numberDouble2 = 3.14;
        float numberFloat2 = (float) numberDouble2;
        long numberLong2 = (long) numberFloat2;
        int numberInt2 = (int) numberLong2;
        short numberShort2 = (short) numberInt2;
        byte numberByte2 = (byte) numberShort2;

        System.out.println(numberDouble2);
        System.out.println(numberFloat2);
        System.out.println(numberLong);
        System.out.println(numberInt2);
        System.out.println(numberShort2);
        System.out.println(numberByte2);
    }

}
