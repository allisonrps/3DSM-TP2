/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_03_exercicios;
    import java.util.Arrays;
/**
 *
 * @author allis
 */
public class Ex08_DiscrepanciaVariancia {
    public static void main(String[] args) {
        // Vetores representando os dados da tabela
        String[] jogadores = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int[] acertos = {2, 1, 8, 24, 36, 41, 5, 9, 6, 7};

        // Calcular a média dos acertos
        double media = calcularMedia(acertos);

        // Calcular a discrepância e a variância
        double[] discrepancias = new double[acertos.length];
        double variancia = calcularVariancia(acertos, media, discrepancias);

        // Exibir os resultados em formato tabular
        System.out.println("Jogador | Acertos | Discrepância");
        for (int i = 0; i < jogadores.length; i++) {
            System.out.printf("%7s | %7d | %12.2f\n", jogadores[i], acertos[i], discrepancias[i]);
        }
        System.out.println("Variância: " + variancia);
    }

    // Função Médi Vetores Inteiros
    public static double calcularMedia(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return (double) soma / vetor.length;
    }

    // Função Variaância Vetores Inteiros
    public static double calcularVariancia(int[] vetor, double media, double[] discrepancias) {
        double somaQuadrados = 0;
        for (int i = 0; i < vetor.length; i++) {
            discrepancias[i] = vetor[i] - media;
            somaQuadrados += Math.pow(discrepancias[i], 2);
        }
        return somaQuadrados / vetor.length;
    }
}

