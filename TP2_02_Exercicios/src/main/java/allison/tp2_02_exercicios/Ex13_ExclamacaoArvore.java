/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;

public class Ex13_ExclamacaoArvore {


    public static void main(String[] args) {
        int n = 5;
        imprimirLinhasExclamacao(n);
    }

    private static void imprimirLinhasExclamacao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("!");
            }
            System.out.println(); // Pula para a próxima linha após imprimir os pontos de exclamação
        }
    }
}


