package FOR_e_DoWhile;

import java.util.Scanner;

public class EX26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = 5;

        int n = base / 2;

        for (int i = 0; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i + 1); k++) {
                System.out.print(i + 1);
            }
            System.out.println();
        }
    }
}