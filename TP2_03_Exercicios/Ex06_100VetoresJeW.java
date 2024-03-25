/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_03_exercicios;
import java.util.Random;
/**
 *
 * @author allis
 */
public class Ex06_100VetoresJeW {

    public static void main(String[] args) {
        // Criando os vetores W e J com 100 posições
        int[] vetorW = new int[100];
        int[] vetorJ = new int[100];

        // Preenchendo os vetores W e J com valores aleatórios entre 0 e 100
        preencherVetorAleatorio(vetorW);
        preencherVetorAleatorio(vetorJ);

        // Calculando o resultado da expressão
        int maxW = encontrarMaximo(vetorW);
        int minJ = encontrarMinimo(vetorJ);
        int mediaW = calcularMedia(vetorW);
        int mediaJ = calcularMedia(vetorJ);
        int resultado = maxW * (minJ + 1) / (mediaW + mediaJ);

               // Exibindo os valores preenchidos em cada vetor
        System.out.print("Vetor J: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetorJ[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor W: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetorW[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        
        // Exibindo o resultado
        System.out.println("O resultado da expressão é: " + resultado);
    }

    // Função para preencher um vetor
    public static void preencherVetorAleatorio(int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(101); // números aleatórios de 0 a 100
        }
    }

    // Função Valor máximo
    public static int encontrarMaximo(int[] vetor) {
        int maximo = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maximo) {
                maximo = vetor[i];
            }
        }
        return maximo;
    }

    // Função Valor mínimo
    public static int encontrarMinimo(int[] vetor) {
        int minimo = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < minimo) {
                minimo = vetor[i];
            }
        }
        return minimo;
    }

    // Função Média
    public static int calcularMedia(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }
}
