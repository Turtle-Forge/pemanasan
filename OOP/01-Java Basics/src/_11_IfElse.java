import java.util.Scanner;

public class _11_IfElse {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " adalah bilangan genap");
        } else {
            System.out.println(number + " adalah bilangan ganjil");
        }

        input.close();
    }
}