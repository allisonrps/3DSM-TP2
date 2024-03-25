/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_03_exercicios;

import java.util.Scanner;
import java.util.Random;

public class Ex01_ValorReferencia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Ler 10 números inteiros e armazená-los em um vetor.
        int[] vetor = new int[10];
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        // 2. Solicitar um valor de referência inteiro.
        System.out.println("Digite um valor de referência inteiro:");
        int valorReferencia = scanner.nextInt();

        // 3. Imprimir os números do vetor que são maiores que o valor de referência.
        System.out.println("Números do vetor maiores que o valor de referência:");
        for (int num : vetor) {
            if (num > valorReferencia) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // 4. Contar quantos números armazenados no vetor são menores que o valor de referência.
        int contadorMenores = 0;
        for (int num : vetor) {
            if (num < valorReferencia) {
                contadorMenores++;
            }
        }
        System.out.println("Quantidade de números menores que o valor de referência: " + contadorMenores);

        // 5. Contar quantas vezes o valor de referência aparece no vetor.
        int contadorReferencia = 0;
        for (int num : vetor) {
            if (num == valorReferencia) {
                contadorReferencia++;
            }
        }
        System.out.println("Quantidade de vezes que o valor de referência aparece no vetor: " + contadorReferencia);

        // 6. Gerar um segundo vetor com 50 posições.
        int[] segundoVetor = new int[50];

        // 7. Recolher 50 numeros do usuário.
        System.out.println("Digite 50 números inteiros: ");
        for (int i = 0; i < 50; i++) {
            segundoVetor[i] = scanner.nextInt();
        }

        int[] contagemNumeros = new int[10]; // Armazenar a contagem de cada número (0 a 9)
        for (int num : vetor) {
            contagemNumeros[num]++;
        }

        // 8. Calcular a porcentagem de números do vetor de 50 posições que constam no primeiro vetor.
        int contadorNumerosVetor50 = 0;
        for (int num : segundoVetor) {
            if (contagemNumeros[num] > 0) {
                contadorNumerosVetor50++;
            }
        }
        double porcentagem = (double) contadorNumerosVetor50 / 50 * 100;

        System.out.println("Porcentagem de números do vetor de 50 posições que constam no primeiro vetor: " + porcentagem + "%");

        scanner.close();
    }
}