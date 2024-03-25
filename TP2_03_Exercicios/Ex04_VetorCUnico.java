/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_03_exercicios;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author allis
 */
public class Ex04_VetorCUnico {

    public static void main(String[] args) {
        Random random = new Random();

        // Definindo vetores A e B com 20 posições
        int[] vetorA = new int[20];
        int[] vetorB = new int[20];

        // Preenchendo os vetores A e B com números aleatórios entre 0 e 50
        for (int i = 0; i < 20; i++) {
            vetorA[i] = random.nextInt(51); // Números aleatórios de 0 a 50
            vetorB[i] = random.nextInt(51); // Números aleatórios de 0 a 50
        }
        
               // Exibindo os valores preenchidos aleatorios em cada vetor
        System.out.print("Vetor A: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------------");

        // Criando o vetor C para armazenar os elementos únicos
        int[] vetorC = new int[40]; // Começando com tamanho 40
        int tamanhoC = 0; // Variável tamonho do C

        // Adicionando elementos únicos do vetor A ao vetor C
        for (int i = 0; i < 20; i++) {
            if (!contemElemento(vetorC, tamanhoC, vetorA[i])) {
                vetorC[tamanhoC++] = vetorA[i];
            }
        }

        // Adicionando elementos únicos do vetor B ao vetor C
        for (int i = 0; i < 20; i++) {
            if (!contemElemento(vetorC, tamanhoC, vetorB[i])) {
                vetorC[tamanhoC++] = vetorB[i];
            }
        }

        // Ordenando o vetor C em ordem crescente
        Arrays.sort(vetorC, 0, tamanhoC);

        // Exibindo o vetor C ordenado
        System.out.println("Vetor C (elementos únicos e ordenados):");
        for (int i = 0; i < tamanhoC; i++) {
            System.out.print(vetorC[i] + " ");
        }
    }

    // Função para verificar se um elemento existente
    private static boolean contemElemento(int[] vetor, int tamanho, int elemento) {
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == elemento) {
                return true;
            }
        }
        return false;
    }
}
