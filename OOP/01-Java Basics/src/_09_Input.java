import java.util.Scanner;

public class _09_Input {
    public static void main(String[] args) {
        System.out.print("Masukkan nama Anda: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.print("Masukkan umur Anda: ");
        int age = input.nextInt();
        System.out.print("Masukkan tinggi badan Anda: ");
        double height = input.nextDouble();

        System.out.println("\nData yang Anda masukkan:");
        System.out.println("Nama Anda: " + name);
        System.out.println("Umur Anda: " + age);
        System.out.println("Tinggi badan Anda: " + height);

        input.close();
    }
}
