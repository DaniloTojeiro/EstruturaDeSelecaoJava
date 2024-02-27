package org.example.ex01;

//Faça um algoritmo para ler dois números inteieros e informar se estes são iguais ou diferentes.

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        if (n1 == n2){
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");
        }
        scanner.close();
    }
}
