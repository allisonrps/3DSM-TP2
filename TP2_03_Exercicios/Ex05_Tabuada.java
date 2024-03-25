/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_03_exercicios;
import java.util.Scanner;
/**
 *
 * @author allis
 */
public class Ex05_Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número da tabuada
        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();

        // Exibir a tabuada de Soma
        System.out.println("Tabuada do " + numero + " (Soma):");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " + " + i + " = " + (numero + i));
        }

        // Exibir a tabuada de Multiplicação
        System.out.println("Tabuada do " + numero + " (Multiplicação):");
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}
