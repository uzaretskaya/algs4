import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class Exercises {

    public static void main(String[] args) {
        // 1.1
        System.out.println("1.1 -------------");
        System.out.println((0 + 15) / 2); // 7
        System.out.println(2.0e-6 * 100_000_000.1); // 200.0000002
        System.out.println(2.0e-6 == 0.000002); // true
        System.out.println(true && false || true && true); // true

        // 1.2
        System.out.println("1.2 -------------");
        System.out.println((1 + 2.236) / 2); // 1.618
        System.out.println(1 + 2 + 3 + 4.0); //10.0
        System.out.println(4.1 >= 4); // true
        System.out.println(1 + 2 + "3"); // 33

        // 1.3
        System.out.println("1.3 -------------");
        System.out.println(equals(1, 2, 2)); // not equals
        System.out.println(equals(3, 3, 3)); // equals

        // 1.4
        System.out.println("1.4 -------------");
        int a = 2, b = 1, c = 0;
        // if (a > b) then c = 0; // then
        // a > b { c = 0; }
        //(a > b) c = 0;
        //(a > b) c = 0 else b = 0;

        // 1.5
        System.out.println("1.5 -------------");
        double x = .5;
        double y = 1.2;
        double z = 0.8;
        System.out.println(betweenZeroAndOne(x, y)); // false
        System.out.println(betweenZeroAndOne(x, z)); // true

        // 1.6
        System.out.println("1.6 -------------");
        int f = 0, g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println("f = " + f + "; g = " + g);
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }

        // 1.7
        System.out.println("1.7 (a) -------------");
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            StdOut.println("t = " + t);
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.5f\n", t); // 3.00009

        System.out.println("1.7 (b) -------------");
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
        StdOut.println(sum); // 499500

        System.out.println("1.7 (c) -------------");
        int summ = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < i; j++) { // N??
                summ++;
            }
        }
        StdOut.println(summ); // 1023

        // 1.8
        System.out.println("1.8 -------------");
        System.out.println('b'); // b
        System.out.println('b' + 'c'); // 197
        System.out.println((char) ('a' + 4)); // e
        System.out.println((char) ('b' + 'c')); // Å

        // 1.9
        System.out.println("1.9 -------------");
        int N = 10;
        System.out.println(Integer.toBinaryString(N));
        System.out.println(toBinaryString(N));

        // 1.10
        System.out.println("1.10 -------------");
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i * i;
        }
        System.out.println(Arrays.toString(arr));

        // 1.11
        System.out.println("1.11 -------------");
        boolean[][] booleans = new boolean[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                booleans[i][j] = i == j;
            }
        }
        System.out.println(printBooleanArray(booleans));

        // 1.12
        System.out.println("1.12 -------------");
        int[] aa = new int[10];
        for (int i = 0; i < 10; i++)
            aa[i] = 9 - i;
        System.out.println(Arrays.toString(aa)); // [9, 8, 7, 6, 5, 4, 3, 2, 1, 0]
        for (int i = 0; i < 10; i++)
            aa[i] = aa[aa[i]];
        System.out.println(Arrays.toString(aa)); // [0, 1, 2, 3, 4, 4, 3, 2, 1, 0]

        // 1.13
        System.out.println("1.13 -------------");
        int[][] mn = new int[5][2];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                mn[i][j] = i + j;
            }
        }
        System.out.println(Arrays.deepToString(mn)); // [[0, 1], [1, 2], [2, 3], [3, 4], [4, 5]]

        int[][] nm = transposition(mn);
        System.out.println(Arrays.deepToString(nm)); // [[0, 1, 2, 3, 4], [1, 2, 3, 4, 5]]

        // 1.14
        System.out.println("1.14 -------------");
        int n = 2350;
        System.out.println(lg(n)); // 11
        System.out.println(lg2(n)); // 11
        System.out.println(log2(n)); // 11

        // 1.15
        System.out.println("1.15 -------------");

    }


    private static String equals(int a, int b, int c) {
        if (a == b && b == c) {
            return "equals";
        } else {
            return "not equals";
        }
    }

    private static boolean betweenZeroAndOne(double x, double y) {
        return x > 0 && x < 1 && y > 0 && y < 1;
    }

    private static String toBinaryString(int N) {
        StringBuilder s = new StringBuilder();
        for (int i = N; i > 0; i /= 2) {
            s.append((i % 2));
        }
        return s.reverse().toString();
    }

    private static String printBooleanArray(boolean[][] arr) {
        StringBuilder s = new StringBuilder();
        if (arr.length == 0) return s.toString();

        int y = arr[0].length;
        s.append("\t\t");
        for (int i = 0; i < y; i++) {
            s.append(i).append("\t");
        }
        s.append("\n");

        for (int i = 0; i < arr.length; i++) {
            s.append(i).append(" str: ");
            for (int j = 0; j < arr[i].length; j++) {
                s.append(arr[i][j] ? "*" : "-").append("\t");
            }
            s.append("\n");
        }
        return s.toString();
    }

    private static int[][] transposition(int[][] mn) {
        if (mn.length == 0) return mn;
        int x = mn.length;
        int y = mn[0].length;
        int[][] nm = new int[y][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                nm[j][i] = mn[i][j];
            }
        }
        return nm;
    }

    private static int lg2(int n) {
        int shift_right_count = 0;
        System.out.println("n = " + n);
        System.out.println("n (binary) = " + toBinaryString(n));

        do {
            n >>= 1;
            System.out.println("n = " + n);
            System.out.println("n (binary) = " + toBinaryString(n));
            shift_right_count++;

        } while (n != 0);

        shift_right_count--;

        return shift_right_count;
    }

    private static int lg(int n) {
        int shift_right_count = 0;

        while (n > 0) {
            n >>= 1;
            System.out.println("n = " + n);
            System.out.println("n (binary) = " + toBinaryString(n));
            shift_right_count++;
        }

        return --shift_right_count;
    }

    private static int log2(int n) {
        return (int) (Math.log(n) / Math.log(2));
    }


}
