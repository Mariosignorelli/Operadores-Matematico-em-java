package Loops;

import java.util.Scanner;

/*
       Faça um programa que leia um conjunto de dois valores,
       o primeiro reperesente o nome do aluno e suegundo idade
       (pare o programa inserindo 0 no campo nome
       */
public class loops_arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  nome;
        int idade;
        while (true){

            System.out.println("nome");
            nome =scan.next();
            if (nome.equals("0")) break;
            System.out.println("idade");
            idade = scan.nextInt();
        }
        System.out.println("continui aqui.....");
    }

}
