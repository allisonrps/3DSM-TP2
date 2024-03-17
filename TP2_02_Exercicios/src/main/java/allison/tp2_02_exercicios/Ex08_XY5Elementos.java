/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;
import java.util.Scanner;
/**
 *
 * @author allis
 */
public class Ex08_XY5Elementos {


    public static void main(String[] args) {
        final int tamanhoVetor = 5;
        int[] vetorX = new int[tamanhoVetor];
        int[] vetorY = new int[tamanhoVetor];

        // Lendo os vetores de inteiros
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 5 números inteiros do vetor X:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorX[i] = scanner.nextInt();
        }

        System.out.println("Digite os 5 números inteiros do vetor Y:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetorY[i] = scanner.nextInt();
        }

        // Calculando e mostrando os resultados
        System.out.println("\nSoma entre X e Y:");
        mostrarVetor(somaEntreVetores(vetorX, vetorY));

        System.out.println("\nProduto entre X e Y:");
        mostrarVetor(produtoEntreVetores(vetorX, vetorY));

        System.out.println("\nDiferença entre X e Y:");
        mostrarVetor(diferencaEntreVetores(vetorX, vetorY));

        System.out.println("\nIntersecção entre X e Y:");
        mostrarVetor(interseccaoEntreVetores(vetorX, vetorY));

        System.out.println("\nUnião entre X e Y:");
        mostrarVetor(uniaoEntreVetores(vetorX, vetorY));

        scanner.close();
    }

    private static int[] somaEntreVetores(int[] vetorX, int[] vetorY) {
        int[] resultado = new int[vetorX.length];
        for (int i = 0; i < vetorX.length; i++) {
            resultado[i] = vetorX[i] + vetorY[i];
        }
        return resultado;
    }

    private static int[] produtoEntreVetores(int[] vetorX, int[] vetorY) {
        int[] resultado = new int[vetorX.length];
        for (int i = 0; i < vetorX.length; i++) {
            resultado[i] = vetorX[i] * vetorY[i];
        }
        return resultado;
    }

    private static int[] diferencaEntreVetores(int[] vetorX, int[] vetorY) {
        int[] resultado = new int[vetorX.length];
        for (int i = 0; i < vetorX.length; i++) {
            resultado[i] = vetorX[i] - vetorY[i];
        }
        return resultado;
    }

    private static int[] interseccaoEntreVetores(int[] vetorX, int[] vetorY) {
        int[] resultado = new int[vetorX.length];
        for (int i = 0; i < vetorX.length; i++) {
            if (vetorX[i] == vetorY[i]) {
                resultado[i] = vetorX[i];
            }
        }
        return resultado;
    }

    private static int[] uniaoEntreVetores(int[] vetorX, int[] vetorY) {
        int[] resultado = new int[vetorX.length + vetorY.length];
        for (int i = 0; i < vetorX.length; i++) {
            resultado[i] = vetorX[i];
        }
        int index = vetorX.length;
        for (int i = 0; i < vetorY.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vetorX.length; j++) {
                if (vetorY[i] == vetorX[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                resultado[index++] = vetorY[i];
            }
        }
        int[] resultadoFinal = new int[index];
        System.arraycopy(resultado, 0, resultadoFinal, 0, index);
        return resultadoFinal;
    }

    private static void mostrarVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
