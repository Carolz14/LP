package br.cefetmg.inf.lista01.p1006;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double A;
        double B;
        double C;

        Scanner input = new Scanner(System.in);

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        double MEDIA = (A*2 + B*3 + C*5)/10;

        System.out.printf("MEDIA = %.1f\n", MEDIA );
    }

}