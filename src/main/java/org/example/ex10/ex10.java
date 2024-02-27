package org.example.ex10;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o salário do funcionário: R$");
        double salario = scanner.nextDouble();
        System.out.println("Digite a categoria do funcionário (m para mensalista, h para horista): ");
        char categoria = scanner.next().charAt(0);

        if (categoria == 'm'){
            salario *= 1.10;
        } else if (categoria == 'h') {
            salario *= 1.20;
        } else {
            System.out.println("Categoria inválida.");
            return;
        }
        System.out.println("Nome " + nome);
        System.out.println("Novo salário: R$" + salario);
    }
}
