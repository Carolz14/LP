package br.cefetmg.inf.lista01.p1052;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}; 
        Scanner input = new Scanner(System.in);

        int n_mes= input.nextInt();
       
        for (int i = 0; i < meses.length; i++) {
            if (i == n_mes-1) {
                System.out.println(meses[i]);
            }
        }
    }

}
