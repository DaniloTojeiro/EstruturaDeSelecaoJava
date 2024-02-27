package org.example.ex04;

//A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatuários.
// O valor máximo da prestação não poderá ultrapassar 30% do salário bruto.
//Fazer um algoritmo que permita entrar com o salário bruto e o valor da prestação e informar se o empréstimo pode ou não ser concedido.

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        System.out.println("Digite o valor da prestação: ");
        double prestação = scanner.nextDouble();

        double limitePrestacao = salarioBruto * 0.3;

        if (prestação <= limitePrestacao){
            System.out.println("Empréstimo concedido: ");
        }else {
            System.out.println("Empréstimo não pode ser concedido. Valor da prestação excede 30% do salário bruto.");
        }
        scanner.close();
    }
}
