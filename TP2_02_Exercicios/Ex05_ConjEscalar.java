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
public class Ex05_ConjEscalar {

    public static void main(String[] args) {
        final int tamanhoConjunto = 5;
        double[] conjunto1 = new double[tamanhoConjunto];
        double[] conjunto2 = new double[tamanhoConjunto];

        // Lendo os dois conjuntos de números reais
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 5 números reais do primeiro conjunto:");
        for (int i = 0; i < tamanhoConjunto; i++) {
            conjunto1[i] = scanner.nextDouble();
        }

        System.out.println("Digite os 5 números reais do segundo conjunto:");
        for (int i = 0; i < tamanhoConjunto; i++) {
            conjunto2[i] = scanner.nextDouble();
        }

        // Calculando o produto escalar
        double produtoEscalar = 0;
        for (int i = 0; i < tamanhoConjunto; i++) {
            produtoEscalar += conjunto1[i] * conjunto2[i];
        }

        // Imprimindo os conjuntos e o produto escalar
        System.out.println("\nPrimeiro conjunto:");
        imprimirConjunto(conjunto1);
        System.out.println("Segundo conjunto:");
        imprimirConjunto(conjunto2);
        System.out.println("Produto escalar: " + produtoEscalar);

        scanner.close();
    }

    private static void imprimirConjunto(double[] conjunto) {
        for (double num : conjunto) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
