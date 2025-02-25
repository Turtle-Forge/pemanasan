public class _12_SwitchCase {
    public static void main(String[] args) {
        // Switch Case
        // Switch case digunakan untuk membandingkan nilai dari sebuah variabel dengan
        // beberapa nilai yang mungkin.
        // Jika nilai dari variabel sama dengan salah satu nilai yang mungkin, maka
        // blok kode yang sesuai akan dijalankan.
        // Jika tidak ada nilai yang cocok, maka blok kode default akan dijalankan.
        // Switch case hanya bisa membandingkan tipe data:
        // - byte
        // - short
        // - int
        // - char
        // - String
        // - enum
        // - Tipe data wrapper: Byte, Short, Integer, Character, String
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Hari ke-" + day + " adalah hari Minggu");
                break;
            case 2:
                System.out.println("Hari ke-" + day + " adalah hari Senin");
                break;
            case 3:
                System.out.println("Hari ke-" + day + " adalah hari Selasa");
                break;
            case 4:
                System.out.println("Hari ke-" + day + " adalah hari Rabu");
                break;
            case 5:
                System.out.println("Hari ke-" + day + " adalah hari Kamis");
                break;
            case 6:
                System.out.println("Hari ke-" + day + " adalah hari Jumat");
                break;
            case 7:
                System.out.println("Hari ke-" + day + " adalah hari Sabtu");
                break;
            default:
                System.out.println("Hari ke-" + day + " tidak valid");
                break;
        }

        // Switch case dengan String
        String color = "merah";
        switch (color) {
            case "merah":
                System.out.println("Warna " + color + " adalah warna merah");
                break;
            case "kuning":
                System.out.println("Warna " + color + " adalah warna kuning");
                break;
            case "hijau":
                System.out.println("Warna " + color + " adalah warna hijau");
                break;
            default:
                System.out.println("Warna " + color + " tidak valid");
                break;
        }
    }
}
