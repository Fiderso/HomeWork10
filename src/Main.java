import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] firstArray = new int[]{1, 2, 3}; // Задача 1
        double[] secondArray = {1.57, 7.654, 9.986};
        int[] thirdArray = {10, 20, 30, 40, 50};

        System.out.println();

        for (int i = 0; i < firstArray.length; i++) { // Задача 2
            System.out.print(firstArray[i]);
            if (i < firstArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if (i < secondArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i < thirdArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println();

        for (int i = firstArray.length - 1; i >= 0; i--) { // Задача 3
            System.out.print(firstArray[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = thirdArray.length - 1; i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println();

        for (int i = 0; i < firstArray.length; i++) { // Задача 4
            if (firstArray[i] % 2 != 0) {
                firstArray[i] += 1;
            }
        }

        System.out.println(Arrays.toString(firstArray));
    }
}