/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_03_exercicios;
import java.util.Scanner;

public class Ex02_10Pedidos {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo vetores para armazenar as informações dos pedidos
        int[] codigoProduto = new int[10];
        double[] valorUnitario = new double[10];
        int[] quantidadeVendida = new int[10];

        // Coletando as informações dos pedidos
        for (int i = 0; i < 10; i++) {
            System.out.println("Pedido " + (i + 1) + ":");
            System.out.print("Código do produto: ");
            codigoProduto[i] = scanner.nextInt();
            System.out.print("Valor unitário: ");
            valorUnitario[i] = scanner.nextDouble();
            System.out.print("Quantidade vendida: ");
            quantidadeVendida[i] = scanner.nextInt();
        }

        // Exibindo a listagem de produtos
        System.out.println("\nListagem de Produtos:");
        System.out.println("CODIGO  V.UNIT  QTD  TOTAL");
        for (int i = 0; i < 10; i++) {
            double totalItem = valorUnitario[i] * quantidadeVendida[i];
            System.out.printf("%5d  %.2f  %3d  %.2f\n", codigoProduto[i], valorUnitario[i], quantidadeVendida[i], totalItem);
        }

        // Calculando e exibindo as informações
        int totalItensVendidos = 0;
        double valorTotalVendido = 0;
        for (int i = 0; i < 10; i++) {
            totalItensVendidos += quantidadeVendida[i];
            valorTotalVendido += valorUnitario[i] * quantidadeVendida[i];
        }
        System.out.println("\nQuantidade total de itens vendidos: " + totalItensVendidos);
        System.out.println("Valor total vendido: " + valorTotalVendido);

        double mediaItensPorVenda = (double) totalItensVendidos / 10;
        System.out.println("Quantidade média de itens por venda: " + mediaItensPorVenda);

        double valorUnitarioMedio = valorTotalVendido / totalItensVendidos;
        System.out.println("Valor unitário médio: " + valorUnitarioMedio);

        double mediaValorTotalPorItem = valorTotalVendido / 10;
        System.out.println("Média do valor total por item: " + mediaValorTotalPorItem);

        // Solicitando ao usuário um código para consulta
        System.out.print("\nInforme um código para consultar um item vendido: ");
        int codigoConsulta = scanner.nextInt();
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (codigoProduto[i] == codigoConsulta) {
                System.out.println("Código: " + codigoProduto[i]);
                System.out.println("Valor unitário: " + valorUnitario[i]);
                System.out.println("Quantidade vendida: " + quantidadeVendida[i]);
                System.out.println("Total do item: " + (valorUnitario[i] * quantidadeVendida[i]));
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Item não encontrado.");
        }

        scanner.close();
    }
}