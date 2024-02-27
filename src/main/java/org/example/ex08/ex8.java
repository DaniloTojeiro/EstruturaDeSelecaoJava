package org.example.ex08;

//O cardápio de uma lanchonete é o seguinte:
//
//Especificação - Código - Preço
//Cachorro quente - 100   - 1,20
//Bauru simples   - 101   - 1,30
//Bauru com ovo   - 102   - 1,50
//Hamburger       - 103   - 1,20
//Cheeseburger    - 104   - 1,30
//Refrigerante    -105    - 1,00
//
//Escrever um algortimo que leia o código do item pedido, a quantidade e calcule
//o valor a ser pago por aquele lanche. Considere que a cada execução somente
//será calculado um item.

import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        int [] codigos = {100,101,102,103,104,105};
        double [] precos = {1.20,1.30,1.50,1.20,1.30,1.00};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código do item pedido: ");
        int codigoPedido = scanner.nextInt();
        System.out.println("Digite a quantidade do item pedido: ");
        int quantidade = scanner.nextInt();

        int indice = -1;
        for (int i = 0; i < codigos.length; i++){
            if (codigos[i] == codigoPedido){
                indice = i;
                break;
            }
        }
        if (indice != -1){
            double valorTotal = precos[indice] * quantidade;
            System.out.println("Valor a ser pago: R$" + valorTotal);
        }else {
            System.out.println("Código do item inválido");
        }
        scanner.close();
    }
}
