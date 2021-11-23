package Loops.com;

import java.util.Scanner;

/*
Faça un programa que moster uma nota de 0 a 10.
Moster essa nota até que o valor seja invalido,
e continue  pedindo até que valoe informamado seja invalido
*/
public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;
        System.out.println("nota:");
        nota = scan.nextInt();
        while ( nota < 0 || nota >10){
            System.out.println("Nota invalida! digite novamente");
            nota = scan.nextInt();
        }
    }

}
