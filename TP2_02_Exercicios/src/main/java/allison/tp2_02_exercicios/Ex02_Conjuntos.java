/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;

import java.util.Scanner;

public class Ex02_Conjuntos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lendo o primeiro conjunto de números
        System.out.println("Digite os 10 elementos do primeiro conjunto:");
        int[] conjunto1 = lerConjunto(scanner);

        // Lendo o segundo conjunto de números
        System.out.println("Digite os 10 elementos do segundo conjunto:");
        int[] conjunto2 = lerConjunto(scanner);

        // Exibindo os elementos comuns
        System.out.println("\nElementos comuns nos conjuntos:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (conjunto1[i] == conjunto2[j]) {
                    System.out.println(conjunto1[i]);
                    break;
                }
            }
        }

        scanner.close();
    }

    private static int[] lerConjunto(Scanner scanner) {
        int[] conjunto = new int[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i + 1) + ": ");
            conjunto[i] = scanner.nextInt();
        }
        return conjunto;
    }
}
