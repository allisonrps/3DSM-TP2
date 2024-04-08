/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;
import java.util.Random;
/**
 *
 * @author allis
 */
public class Ex07_Matriz10por10 {

    public static void main(String[] args) {
        final int tamanhoMatriz = 10;
        int[][] matriz = new int[tamanhoMatriz][tamanhoMatriz];

        // Gerando a matriz com números aleatórios
        gerarMatrizAleatoria(matriz);

        // Calculando e mostrando a soma dos elementos da diagonal principal
        int somaDiagonalPrincipal = calcularSomaDiagonalPrincipal(matriz);
        System.out.println("Soma dos elementos da diagonal principal: " + somaDiagonalPrincipal);
    }

    private static void gerarMatrizAleatoria(int[][] matriz) {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100); // Números aleatórios entre 0 e 99
            }
        }
    }

    private static int calcularSomaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i]; // A diagonal principal tem índices [i][i]
        }
        return soma;
    }
}