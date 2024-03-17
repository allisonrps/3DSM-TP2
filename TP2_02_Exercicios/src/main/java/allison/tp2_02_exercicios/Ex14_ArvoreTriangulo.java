/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;


public class Ex14_ArvoreTriangulo {

    public static void main(String[] args) {
        int n = 6;
        gerarTriangulo(n);
    }

    private static void gerarTriangulo(int n) {
        for (int linha = 1; linha <= n; linha++) {
            // Imprime os espaços à esquerda
            for (int i = 1; i <= n - linha; i++) {
                System.out.print(" ");
            }
            // Imprime os asteriscos
            for (int i = 1; i <= 2 * linha - 1; i++) {
                System.out.print("X");
            }
            // Pula para a próxima linha
            System.out.println();
        }
    }
}

