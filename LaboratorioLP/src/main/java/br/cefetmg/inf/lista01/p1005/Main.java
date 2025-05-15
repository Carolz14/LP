package br.cefetmg.inf.lista01.p1005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double A;
        double B;

        Scanner input = new Scanner(System.in);

        A = input.nextDouble();
        B = input.nextDouble();

        double MEDIA = (A*3.5 + B*7.5)/11;

        System.out.printf("MEDIA = %.5f \n", MEDIA );
    }

}