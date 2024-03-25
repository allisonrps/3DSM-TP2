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
public class Ex07_DesvioPadrao {
    public static void main(String[] args) {
        // Objeto Random
        Random random = new Random();

        // Definindo vetor J com 100 espaços
        double[] vetorJ = new double[100];

        // Preenchendo o vetor de valores J aleatório usndo random
        for (int i = 0; i < 100; i++) {
            vetorJ[i] = random.nextDouble() * 100;
        }

        // Exibindo os valores preenchidos aleatorios J
        System.out.print("Vetor J: ");
        for (int i = 0; i < 100; i++) {
            System.out.print(vetorJ[i] + " - ");
        }
        System.out.println();
        
        // Calculando a média dos valores de J
        double mediaJ = calcularMedia(vetorJ);

        // Calculando o desvio padrão dos valores de J
        double desvioPadraoJ = calcularDesvioPadrao(vetorJ, mediaJ);

        // Exibindo o desvio padrão
        System.out.println("O desvio padrão dos valores de J é: " + desvioPadraoJ);
    }

    // Função Média do Vetor
    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double valor : vetor) {
            soma += valor;
        }
        return soma / vetor.length;
    }

    // Função Desvio Padrão do Vetor
    public static double calcularDesvioPadrao(double[] vetor, double media) {
        double somaDiferencasQuadrado = 0;
        for (double valor : vetor) {
            somaDiferencasQuadrado += Math.pow(valor - media, 2);
        }
        double variancia = somaDiferencasQuadrado / (vetor.length - 1);
        return Math.sqrt(variancia);
    }
}
