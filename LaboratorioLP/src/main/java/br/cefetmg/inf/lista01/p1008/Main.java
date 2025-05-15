package br.cefetmg.inf.lista01.p1008;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n_funcionario;
        int n_horas;
        double salario_hora; 
        double salario;  

        Scanner input = new Scanner(System.in);

        n_funcionario= input.nextInt();
        n_horas = input.nextInt();
        salario_hora = input.nextDouble();
        

       salario = n_horas*salario_hora; 

        System.out.println("NUMBER = " + n_funcionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }

}