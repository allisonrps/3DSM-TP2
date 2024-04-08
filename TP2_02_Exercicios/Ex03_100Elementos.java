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
public class Ex03_100Elementos {

    public static void main(String[] args) {
        final int tamanhoVetor = 100;
        int[] vetor = new int[tamanhoVetor];

        // Gerando números aleatórios para o vetor
        Random random = new Random();
        for (int i = 0; i < tamanhoVetor; i++) {
            vetor[i] = random.nextInt(1000); // Gera números aleatórios entre 0 e 999
        }

        // Encontrando o maior e o menor número no vetor
        // Setando valores iniciais
        int maior = vetor[0];
        int menor = vetor[0];
        double soma = 0;
        int pares = 0;
        
        for (int num : vetor) {
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma += num;
            if (num % 2 == 0) {
                pares++;
            }
        }
        double media = soma / tamanhoVetor;
        double percentualPares = (double) pares / tamanhoVetor * 100;

        // Exibindo os resultados
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Percentual de números pares: " + percentualPares + "%");
        System.out.println("Média dos elementos do vetor: " + media);
    }
}

