public class _08_Operators {
    public static void main(String[] args) {
        // operator aritmatika(+*/-%++)
        int tambah = 1 + 1;
        System.out.println(tambah); // Output: 2
        int kurang = 2 - 1;
        System.out.println(kurang); // Output: 1
        int kali = 2 * 2;
        System.out.println(kali); // Output: 4
        int bagi = 4 / 2;
        System.out.println(bagi); // Output: 2
        int modulus = 5 % 2;
        System.out.println(modulus); // Output: 1
        int increment = 1;
        increment++;
        System.out.println(increment); // Output: 2
        int decrement = 2;
        decrement--;
        System.out.println(decrement); // Output: 1

        System.out.println("\n=====================================");
        // operator pembanding(==, !=, >, <, >=, <=)
        int a = 5;
        int b = 3;
        System.out.println(a == b); // Output: false
        System.out.println(a != b); // Output: true
        System.out.println(a > b); // Output: true
        System.out.println(a < b); // Output: false
        System.out.println(a >= b); // Output: true
        System.out.println(a <= b); // Output: false

        System.out.println("\n=====================================");
        // operator logika(&&, ||, !)
        boolean c = true;
        boolean d = false;
        System.out.println(c && d); // Output: false
        System.out.println(c || d); // Output: true
        System.out.println(!c); // Output: false
        System.out.println(!d); // Output: true

        System.out.println("\n=====================================");
        // operator assignment(=, +=, -=, *=, /=, %=)
        int e = 5;
        e += 3;
        System.out.println(e); // Output: 8
        int f = 5;
        f -= 3;
        System.out.println(f); // Output: 2
        int g = 5;
        g *= 3;
        System.out.println(g); // Output: 15
        int h = 6;
        h /= 3;
        System.out.println(h); // Output: 2
        int i = 5;
        i %= 3;
        System.out.println(i); // Output: 2

    }

}
