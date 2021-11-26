package Loops.com;

import java.util.Scanner;

/*
Desenvolva um gereaor tabuada de números interiros de 1 a 10.
O usuario de informor o numera que deja ver a tabuada e a saida,
 deve ser como exemplo.
 5 x 1 = 5
 5 x 2 = 10
 */
public class loopsFor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tabuada:");

        int tabuada  = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);
        for (int i = 1 ; i <= 10 ;i++ ){
            System.out.println(tabuada  + " x " +  i  + " = "  + (tabuada*i)) ;
        }
    }
}
