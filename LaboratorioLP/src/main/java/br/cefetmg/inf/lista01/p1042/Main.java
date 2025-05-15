package br.cefetmg.inf.lista01.p1042;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int aux;

        int original_A = A;
        int original_B = B;
        int original_C = C;

        if (A > B) {
            aux = A;
            A = B;
            B = aux;
        }

        if (B > C) {
            aux = B;
            B = C;
            C = aux;
        }
        if (C < A) {
            aux = C;
            C = A;
            A = aux;
        }
        if (B < A) {
            aux = B;
            B = A;
            A = aux;
        }

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.print("\n");
        System.out.println(original_A);
        System.out.println(original_B);
        System.out.println(original_C);
    }

}
