package org.example.ex05;

//Faça um programa que o usuário informe o salário recebido e o total gasto.
//Deverá ser exibido na tela "Gastos dentro do orçamento" caso o valor gasto não ultrapasse o valor do salário
//e "Orçamento estourado" se o valor gasto ultrapassar o valor do salário.

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Informe o total gasto: ");
        double gasto = scanner.nextDouble();

        if (gasto <= salario){
            System.out.println("Gastos dentro do orçamento");
        }else {
            System.out.println("Orçamento estourado.");
        }
        scanner.close();
    }
}
