package org.example.ex02;

//Uma loja fornece 10% de desconto para funcionários e 5% de desconto para clientes vips.
//Faça um programa que calcule o valor total a ser pago por uma pessoa.
//O programa deverá ler o valor total da compra efetuada e um código que identifique
//se o comprador é um cliente comum (1), funcionário(2) ou vip (3).

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        System.out.println("Digite o código do cliente (1 para comum, 2 para funcionário, 3 para VIP): ");
        int codigoCliente = scanner.nextInt();

        double valorPago = calcularValorPago(valorCompra, codigoCliente);

        System.out.println("O valor pago é: R$" + valorPago);

        scanner.close();
    }
    public static double calcularValorPago(double valorCompra, int codigoCliente) {
        double desconto = 0;

        if (codigoCliente == 2){
            desconto = 0.10;
        } else if (codigoCliente == 3) {
            desconto = 0.05;
        }
        double valorDesconto = valorCompra * desconto;
        double valorFinal = valorCompra - valorDesconto;

        return valorFinal;
    }
}
