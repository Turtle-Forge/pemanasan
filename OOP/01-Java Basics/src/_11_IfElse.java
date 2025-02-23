// import java.util.Scanner;

public class _11_IfElse {

    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Masukkan angka: ");
        // int number = input.nextInt();

        int number = 5;

        if (number % 2 == 0) {
            System.out.println(number + " adalah bilangan genap");
        } else {
            System.out.println(number + " adalah bilangan ganjil");
        }

        if (20 > 10) {
            System.out.println("20 lebih besar dari 20");
        }

        if ("hello" == "hello") { // operator == untuk membandingkan reference
            System.out.println("hello sama dengan hello");
        }

        if ("hello".equals("Hello")) { // method equals() untuk membandingkan isi dari string
            System.out.println("hello sama dengan Hello");
        } else {
            System.out.println("hello tidak sama dengan Hello");
        }

        // ========
        int time = 20;
        if (time >= 00 && time < 12) {
            System.out.println("Selamat pagi");
        } else if (time >= 12 && time < 15) {
            System.out.println("Selamat siang");
        } else if (time >= 15 && time < 18) {
            System.out.println("Selamat sore");
        } else {
            System.out.println("Selamat malam");
        }

        int angka = 6;
        String isEven = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println(isEven);
        System.out.println((angka % 2 == 0) ? "genap" : "ganjil");

        // input.close();
    }
}