public class _05_BooleansType {
    public static void main(String[] args) {
        // Tipe data boolean
        // Tipe data boolean adalah tipe data yang digunakan untuk menyimpan nilai
        // kebenaran.
        // Tipe data boolean terdiri dari dua nilai:
        // 1. true
        // 2. false

        // true
        // true digunakan untuk menyatakan nilai benar.
        boolean isJavaFun = true;
        System.out.println(isJavaFun); // output: true

        // false
        // false digunakan untuk menyatakan nilai salah.
        boolean isFishTasty = false;
        System.out.println(isFishTasty); // output: false

        // Tipe data boolean digunakan untuk membuat keputusan dalam program.
        // Contoh:
        // Jika nilai isJavaFun adalah true, maka cetak "Java is fun!".
        if (isJavaFun) {
            System.out.println("Java is fun!");
        } else {
            System.out.println("Java is not fun!");
        }
    }
}
