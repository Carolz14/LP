package br.cefetmg.inf.lista01.p1007;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D; 

        Scanner input = new Scanner(System.in);

        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        int DIFERENCA = (A*B - C*D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }

}