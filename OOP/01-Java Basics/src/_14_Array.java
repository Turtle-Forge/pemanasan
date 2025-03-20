public class _14_Array {
    public static void main(String[] args) {
        // Array
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);
        System.out.println(cars[3]);

        // Change an Array Element
        cars[0] = "Opel";
        System.out.println(cars[0]);

        // Array Length
        System.out.println(cars.length);

        // Loop Through an Array
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        // Loop Through an Array with For-Each
        for (String car : cars) {
            System.out.println(car);
        }

        // Multidimensional Arrays
        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        int x = myNumbers[1][2];
        System.out.println(x);

        // Loop Through a Multidimensional Array
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }

        // Loop Through a Multidimensional Array with For-Each
        for (int[] number : myNumbers) {
            for (int num : number) {
                System.out.println(num);
            }
        }
    }
}
