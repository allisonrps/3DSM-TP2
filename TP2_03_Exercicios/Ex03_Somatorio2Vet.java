/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_03_exercicios;
import java.util.Scanner;
/**
 *
 * @author allis
 */
public class Ex03_Somatorio2Vet {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo vetores de 10 posições
        int[] vetorW = new int[10];
        int[] vetorK = new int[10];

        // Preenchendo o vetor W
        System.out.println("Digite 10 elementos inteiro do Vetor W: ");
        for (int i = 0; i < 10; i++) {
            vetorW[i] = scanner.nextInt(); 
        }

        // Preenchendo o vetor K
        System.out.println("Digite 10 elementos inteiro do Vetor K: ");
        for (int i = 0; i < 10; i++) {
            vetorK[i] = scanner.nextInt(); 
        }
        
        // Exibindo os valores preenchidos em cada vetor
        System.out.print("Vetor K: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorK[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor W: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(vetorW[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        // Calculando a soma dos elementos dos vetores
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += vetorW[i] + vetorK[9 - i];
        }

        // Exibindo o resultado
        System.out.println("A soma dos elementos dos vetores é: " + soma);

        scanner.close();
    }
}

