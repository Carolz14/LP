package br.cefetmg.inf.lista01.p1001;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A;
        int B;

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();

        int  X = A + B;

        System.out.println("X = " + X + "\n");
    }

}
