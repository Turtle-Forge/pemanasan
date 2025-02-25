public class _15_Fungsi {
    public static void main(String[] args) {
        // Fungsi
        int x = 10;
        int y = 20;
        int z = myFunction(x, y);
        System.out.println(z);

        // Method Overloading
        int a = 10;
        int b = 20;
        double c = 30.5;
        double d = 40.5;
        int e = myFunction(a, b);
        double f = myFunction(c, d);
        System.out.println(e);
        System.out.println(f);
    }

    static int myFunction(int a, int b) {
        return a + b;
    }

    static double myFunction(double a, double b) {
        return a + b;
    }
}
