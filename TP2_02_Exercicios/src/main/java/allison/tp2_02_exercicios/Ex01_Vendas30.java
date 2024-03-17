/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;
import java.util.Scanner;

public class Ex01_Vendas30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ex01_Vendas30_Produto[] produtos = new Ex01_Vendas30_Produto[30];

        // Adicionando informações de produtos
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Produto " + (i + 1) + ":");
            System.out.print("Código: ");
            String codigo = scanner.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());
            System.out.print("Valor de compra: ");
            double valorCompra = Double.parseDouble(scanner.nextLine());
            System.out.print("Valor de venda: ");
            double valorVenda = Double.parseDouble(scanner.nextLine());

            produtos[i] = new Ex01_Vendas30_Produto(codigo, quantidade, valorCompra, valorVenda);
        }

        // Exibindo informações de produtos
        System.out.print("\nDigite o código do produto que deseja visualizar (ou deixe em branco para listar todos): ");
        String codigoDesejado = scanner.nextLine();
        if (codigoDesejado.isEmpty()) {
            for (Ex01_Vendas30_Produto produto : produtos) {
                System.out.println("\nCódigo: " + produto.getCodigo());
                System.out.println("Quantidade: " + produto.getQuantidade());
                System.out.println("Valor de compra: " + produto.getValorCompra());
                System.out.println("Valor de venda: " + produto.getValorVenda());
            }
        } else {
            boolean encontrado = false;
            for (Ex01_Vendas30_Produto produto : produtos) {
                if (produto.getCodigo().equals(codigoDesejado)) {
                    System.out.println("\nCódigo: " + produto.getCodigo());
                    System.out.println("Quantidade: " + produto.getQuantidade());
                    System.out.println("Valor de compra: " + produto.getValorCompra());
                    System.out.println("Valor de venda: " + produto.getValorVenda());
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Produto não encontrado.");
            }
        }

        scanner.close();
    }
}
