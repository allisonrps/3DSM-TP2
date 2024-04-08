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
public class Ex06_DesvioPadrao {

    public static void main(String... strings) {
        // Gerando os valores aleatórios para o vetor
        double[] vetor = gerarValoresAleatorios(10);

        // Calculando a média dos elementos do vetor
        double media = calcularMedia(vetor);

        // Calculando o desvio padrão
        double desvioPadrao = calcularDesvioPadrao(vetor, media);

        // Imprimindo os valores do vetor
        System.out.println("Valores do vetor:");
        for (double num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Imprimindo a média e o desvio padrão
        System.out.println("Média: " + media);
        System.out.println("Desvio padrão: " + desvioPadrao);
    }

    // Método para gerar valores aleatórios para o vetor
    public static double[] gerarValoresAleatorios(int tamanho) {
        Random random = new Random();
        double[] vetor = new double[tamanho];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextDouble() * 100; // Números aleatórios entre 0 e 100
        }
        return vetor;
    }

    // Método para calcular a média de um vetor de números
    public static double calcularMedia(double[] vetor) {
        double soma = 0.0;
        for (double num : vetor) {
            soma += num;
        }
        return soma / vetor.length;
    }

    // Método para calcular o desvio padrão de um vetor de números
    public static double calcularDesvioPadrao(double[] vetor, double media) {
        double somaDiferencasQuadrado = 0.0;
        for (double num : vetor) {
            somaDiferencasQuadrado += Math.pow(num - media, 2);
        }
        double variancia = somaDiferencasQuadrado / vetor.length;
        return Math.sqrt(variancia);
    }
}

