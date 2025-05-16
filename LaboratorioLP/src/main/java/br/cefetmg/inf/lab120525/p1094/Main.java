package br.cefetmg.inf.lab120525.p1094;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        int total = 0;
        int coelhos = 0, ratos = 0, sapos = 0;

        for (int i = 0; i < N; i++) {
            int quantia = input.nextInt();
            char tipo = input.next().charAt(0);

            total += quantia;

            switch (tipo) {
                case 'C':
                    coelhos += quantia;
                    break;
                case 'S':
                    sapos += quantia;
                    break;
                case 'R':
                    ratos += quantia;
                    break;
                default:
                    break;
            }

        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + coelhos);
        System.out.println("Total de ratos: " + ratos);
        System.out.println("Total de sapos: " + sapos);

        System.out.printf("Percentual de coelhos: %.2f %%\n", 100.0 * coelhos / total);
        System.out.printf("Percentual de ratos: %.2f %%\n", 100.0 * ratos / total);
        System.out.printf("Percentual de sapos: %.2f %%\n", 100.0 * sapos / total);
        input.close();
    }
}