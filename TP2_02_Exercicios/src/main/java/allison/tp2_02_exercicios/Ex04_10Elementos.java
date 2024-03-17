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
public class Ex04_10Elementos {

    public static void main(String[] args) {
        final int tamanhoVetor = 10;
        int[] vetor = new int[tamanhoVetor];

        // Lendo os números e armazenando no vetor
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = scanner.nextInt();
        }

        // Solicitando o valor de referência
        System.out.print("Digite um valor de referência inteiro: ");
        int valorReferencia = scanner.nextInt();

        // a. Imprimindo os números do vetor maiores que o valor de referência
        System.out.println("\nNúmeros do vetor maiores que o valor de referência:");
        for (int num : vetor) {
            if (num > valorReferencia) {
                System.out.print(num + " ");
            }
        }

        // b. Contando quantos números no vetor são menores que o valor de referência
        int menoresQueReferencia = 0;
        for (int num : vetor) {
            if (num < valorReferencia) {
                menoresQueReferencia++;
            }
        }
        System.out.println("\nQuantidade de números no vetor menores que o valor de referência: " + menoresQueReferencia);

        // c. Contando quantas vezes o valor de referência aparece no vetor
        int vezesValorReferencia = 0;
        for (int num : vetor) {
            if (num == valorReferencia) {
                vezesValorReferencia++;
            }
        }
        System.out.println("Quantidade de vezes que o valor de referência aparece no vetor: " + vezesValorReferencia);

        scanner.close();
    }
}
