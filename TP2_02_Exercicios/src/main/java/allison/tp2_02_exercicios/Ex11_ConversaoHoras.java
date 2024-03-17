/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;

public class Ex11_ConversaoHoras {
    public static void main(String[] args) {
        int horas = 2;
        int minutos = 30;
        int segundos = 45;

        int totalSegundos = converterParaSegundos(horas, minutos, segundos);

        System.out.println("Total de segundos: " + totalSegundos);
    }

    private static int converterParaSegundos(int horas, int minutos, int segundos) {
        return horas * 3600 + minutos * 60 + segundos;
    }
}

