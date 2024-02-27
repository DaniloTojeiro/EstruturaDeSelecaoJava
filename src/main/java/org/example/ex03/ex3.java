package org.example.ex03;

//Escrever um programa para ler um número inteiro e informar se ele é divisível por 5.

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 5 ==0){
            System.out.println(numero + " é divisível por 5.");
        } else {
            System.out.println(numero + " não é divisível por 5.");
        }
        scanner.close();
    }
}
