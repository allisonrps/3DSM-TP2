/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author allis
 */
public class Ex04_ProdutosSistema {
    
private static final ArrayList<Ex04_Produtos> produtosEstaduais = new ArrayList<>(); 
private static final ArrayList<Ex04_Produtos> produtosNacionais = new ArrayList<>();
private static final ArrayList<Ex04_Produtos> produtosImportados = new ArrayList<>();
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            System.out.println("\nMENU");
            System.out.println("1 – Cadastrar Produto Estadual");
            System.out.println("2 – Cadastrar Produto Nacional");
            System.out.println("3 – Cadastrar Produto Importado");
            System.out.println("4 – Exibir Produtos Estaduais");
            System.out.println("5 – Exibir Produtos Nacionais");
            System.out.println("6 – Exibir Produtos Importados");
            System.out.println("7 – Exibir Todos Produtos");
            System.out.println("9 – SAIR");
            System.out.print("Escolha a opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> cadastrarProdutoEstadual();
                case 2 -> cadastrarProdutoNacional();
                case 3 -> cadastrarProdutoImportado();
                case 4 -> exibirProdutosEstaduais();
                case 5 -> exibirProdutosNacionais();
                case 6 -> exibirProdutosImportados();
                case 7 -> exibirTodosProdutos();
                case 9 -> System.out.println("FINALIZANDO...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 9);
    }

    private static void cadastrarProdutoEstadual() {
        scanner.nextLine(); 
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        Ex04_ProdutoEstadual produto = new Ex04_ProdutoEstadual(descricao, valor);
        produtosEstaduais.add(produto);
        System.out.println("Produto estadual cadastrado!");
    }

    private static void cadastrarProdutoNacional() {
        scanner.nextLine(); 
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        Ex04_ProdutoNacional produto = new Ex04_ProdutoNacional(descricao, valor);
        produtosNacionais.add(produto);
        System.out.println("Produto nacional cadastrado!");
    }

    private static void cadastrarProdutoImportado() {
        scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        Ex04_ProdutoImportado produto = new Ex04_ProdutoImportado(descricao, valor);
        produtosImportados.add(produto);
        System.out.println("Produto importado cadastrado!");
    }

    private static void exibirProdutosEstaduais() {
        if (produtosEstaduais.isEmpty()) {
            System.out.println("Não há produtos estaduais cadastrados.");
        } else {
            for (Ex04_Produtos produto : produtosEstaduais) {
                produto.relatorio();
            }
        }
    }

    private static void exibirProdutosNacionais() {
        if (produtosNacionais.isEmpty()) {
            System.out.println("Não há produtos nacionais cadastrados.");
        } else {
            for (Ex04_Produtos produto : produtosNacionais) {
                produto.relatorio();
            }
        }
    }

    private static void exibirProdutosImportados() {
        if (produtosImportados.isEmpty()) {
            System.out.println("Não há produtos importados cadastrados.");
        } else {
            for (Ex04_Produtos produto : produtosImportados) {
                produto.relatorio();
            }
        }
    }

    private static void exibirTodosProdutos() {
        System.out.println("Produtos Estaduais:");
        exibirProdutosEstaduais();
        System.out.println("\nProdutos Nacionais:");
        exibirProdutosNacionais();
        System.out.println("\nProdutos Importados:");
        exibirProdutosImportados();
    }
}


