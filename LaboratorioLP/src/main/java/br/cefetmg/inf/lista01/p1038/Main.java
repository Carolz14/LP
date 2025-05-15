package br.cefetmg.inf.lista01.p1038;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int codigo= input.nextInt();
        int quantidade= input.nextInt();
        double preco_final; 
     
        switch (codigo) {
        case 1:
            preco_final = quantidade*4.00;
            System.out.printf("Total: R$ %.2f\n", preco_final);
            break;
        case 2:
            preco_final = quantidade*4.50;
            System.out.printf("Total: R$ %.2f\n", preco_final);
            break;
        case 3:
            preco_final = quantidade*5.0;
            System.out.printf("Total: R$ %.2f\n", preco_final);
            break;
        case 4:
            preco_final = quantidade*2.0;
            System.out.printf("Total: R$ %.2f\n", preco_final);
            break;
        case 5:
            preco_final = quantidade*1.50;
            System.out.printf("Total: R$ %.2f\n", preco_final);
            break;
        default:
            break;
       }
    

    }

}
