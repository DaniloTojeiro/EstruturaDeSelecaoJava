package org.example.ex07;

//Elabore um algoritmo que dada a idade de um nadador classifica-o em uma das seguintes categorias:
//infantil A = 5 - 7 anos
//infantil B = 8 - 10 anos
//juvenil A = 11 - 13 anos
//juvenil B = 14 - 17 anos
//adulto = maiores de 18 anos.

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador: ");
        int idade = scanner.nextInt();

        String categoria = classificarNadador(idade);
        System.out.println("O nadador está na categoria " + categoria);
    }

    public static String classificarNadador(int idade){
        if (idade >= 5 && idade <= 7){
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        }else {
            return "Adulto";
        }
    }
}
