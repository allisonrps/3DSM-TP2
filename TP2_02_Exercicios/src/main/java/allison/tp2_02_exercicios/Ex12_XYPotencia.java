/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;

/**
 *
 * @author allis
 */
public class Ex12_XYPotencia {
    public static void main(String[] args) {
        int x = 2;
        int z = 5;

        long resultado = calcularPotencia(x, z);

        System.out.println(x + " elevado a " + z + " é: " + resultado);
    }

    private static long calcularPotencia(int x, int z) {
        long resultado = 1;
        for (int i = 1; i <= z; i++) {
            resultado *= x;
        }
        return resultado;
    }
}

