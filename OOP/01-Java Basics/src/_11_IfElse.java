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
        // input.close();
    }
}