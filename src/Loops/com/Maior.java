package Loops.com;
/*
Faça um um progra que lei a5 numeros e informe o maior
 */

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero;
        int maior = 0;
        int soma =0;
        int count = 0;
       do {
           System.out.println("Digite um número:");
           numero = scan.nextInt();

           soma = soma + numero;

           if (numero > maior ) maior = numero;

            count = count +1;
        System.out.println("Maior :" + maior);
        System.out.println("Média  :" + (soma/5));
       }while (count < 5);
    }
}
