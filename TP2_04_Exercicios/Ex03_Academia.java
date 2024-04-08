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
public class Ex03_Academia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Ex03_AlunoAcademia> alunos = new ArrayList<>();
        int opcao;
        // SISTEMA MENU DA ACADEMIA
        do {
            System.out.println("MENU");
            System.out.println("1 – Cadastrar Aluno");
            System.out.println("2 – Listar Alunos (somente nome)");
            System.out.println("3 – Relatório Geral (exibe todas as informações)");
            System.out.println("9 – Sair");
            System.out.print("Escolha uma opção: ");
            
 //LER OPÇÃO
opcao = scanner.nextInt();
switch (opcao) {
                case 1:
                    // CADASTRO
                    System.out.print("Número de Identificação: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    System.out.print("Peso: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Altura: ");
                    double altura = scanner.nextDouble();

                    Ex03_AlunoAcademia aluno = new Ex03_AlunoAcademia(id, nome, idade, peso, altura);
                    alunos.add(aluno);
                    System.out.println("Aluno cadastrado!");
                    break;
                    
      // LISTAR TODOS OS ALUNOS
case 2:
     System.out.println("Todos os Alunos:");
                    for (Ex03_AlunoAcademia a : alunos) {
                        System.out.println(a.getNome());
                    }
                    break;
                    
     //RELATÓRIO GERAL
case 3:
     for (Ex03_AlunoAcademia a : alunos) {
                        a.exibir();
                        System.out.println("IMC: " + a.calcularIMC());
                    }
                    break;
                    
       // SAIR DA APLICAÇÃO
 case 9:
      // Sair
                    System.out.println("FINALIZANDO...");
                    break;
                    
default:
      // OPÇÃO NÃO ENCONTRADA:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 9);

        scanner.close();
    }
}
