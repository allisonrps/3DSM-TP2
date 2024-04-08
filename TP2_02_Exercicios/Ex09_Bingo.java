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
public class Ex09_Bingo {

    public static void main(String[] args) {
        final int tamanhoCartela = 5;
        int[][] cartela = new int[tamanhoCartela][tamanhoCartela];

        // Gerando a cartela de bingo
        gerarCartelaBingo(cartela);

        // Exibindo a cartela gerada
        exibirCartelaBingo(cartela);
    }

    private static void gerarCartelaBingo(int[][] cartela) {
        Random random = new Random();
        for (int i = 0; i < cartela.length; i++) {
            int[] numerosUtilizados = new int[100]; // Vetor para marcar os números já utilizados
            for (int j = 0; j < cartela[i].length; j++) {
                int numero;
                do {
                    numero = random.nextInt(100); // Gera números aleatórios entre 0 e 99
                } while (numerosUtilizados[numero] == 1); // Verifica se o número já foi utilizado
                cartela[i][j] = numero;
                numerosUtilizados[numero] = 1; // Marca o número como utilizado
            }
        }
    }

    private static void exibirCartelaBingo(int[][] cartela) {
        System.out.println("Cartela de Bingo:");
        for (int i = 0; i < cartela.length; i++) {
            for (int j = 0; j < cartela[i].length; j++) {
                System.out.printf("%2d ", cartela[i][j]); // Formata o número para ocupar 2 espaços
            }
            System.out.println();
        }
    }
}
