package br.cefetmg.inf.lista01.p1010;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int codigo1= input.nextInt();
        int quantidade1= input.nextInt();
        double preco1 = input.nextDouble(); 
        
        int codigo2= input.nextInt();
        int quantidade2= input.nextInt();
        double preco2 = input.nextDouble(); 
        double preco_final; 
     
        preco_final = quantidade1*preco1 + quantidade2*preco2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", preco_final);
    

    }

}
