package org.example.ex09;

//

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        final int GERENTE = 101;
        final int ENGENHEIRO = 102;
        final int TECNICO = 103;

        final double AUMENTO_GERENTE = 0.10;
        final double AUMENTO_ENGENHEIRO = 0.20;
        final double AUMENTO_TECNICO = 0.30;
        final double AUMENTO_PADRAO = 0.40;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o código do cargo: ");
        int codigoCargo = scanner.nextInt();
        System.out.println("Digite o salário atual: ");
        int salarioAtual = scanner.nextInt();

        double novoSalario;

        switch(codigoCargo){
            case GERENTE:
                novoSalario = salarioAtual * (1 + AUMENTO_GERENTE);
                break;
            case ENGENHEIRO:
                novoSalario = salarioAtual * (1 + AUMENTO_ENGENHEIRO);
                break;
            case TECNICO:
                novoSalario = salarioAtual * (1 + AUMENTO_TECNICO);
                break;
            default:
                novoSalario = salarioAtual * (1 + AUMENTO_PADRAO);
                break;
        }

        double diferenca = novoSalario - salarioAtual;

        System.out.println("Salário antigo: R$" + salarioAtual);
        System.out.println("Novo salário: R$" + novoSalario);
        System.out.println("Diferença: R$" + diferenca);

        scanner.close();
    }
}
