import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] digits = new int[3];
        digits[0] = 1;
        digits[1] = 2;
        digits[2] = 3;
        double[] fractionalDigits = {1.57, 7.654, 9.986};
        long[] freeArray = {1000, 2000, 3000, 4000, 5000};
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
            if (i < digits.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < fractionalDigits.length; i++) {
            System.out.print(fractionalDigits[i]);
            if (i < fractionalDigits.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < freeArray.length; i++) {
            System.out.print(freeArray[i]);
            if (i < freeArray.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = fractionalDigits.length - 1; i >= 0; i--) {
            System.out.print(fractionalDigits[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = freeArray.length - 1; i >= 0; i--) {
            System.out.print(freeArray[i]);
            if (i > 0) {
                System.out.print(",");
            }
        }

        int[] even = new int[3];
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] % 2 != 0) {
                even[i] = digits[i] += 1;

            }

            even[i] = digits[i];

        }
        System.out.println();
        String c = Arrays.toString(even);
        System.out.println(c);
    }
}









