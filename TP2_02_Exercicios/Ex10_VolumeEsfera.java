/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;
import java.util.Scanner;

public class Ex10_VolumeEsfera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da esfera: ");
        double raio = scanner.nextDouble();

        double volume = calcularVolumeEsfera(raio);

        System.out.println("O volume da esfera com raio " + raio + " é: " + volume);

        scanner.close();
    }

    private static double calcularVolumeEsfera(double raio) {
        final double PI = 3.14159;
        return (4.0 / 3.0) * PI * Math.pow(raio, 3);
    }

}
