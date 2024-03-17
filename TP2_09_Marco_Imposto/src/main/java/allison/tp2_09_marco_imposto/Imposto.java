/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_09_marco_imposto;

/**
 *
 * @author allis
 */

public class Imposto {
    
public Double calcularImposto(Double valor) {
    return (valor *0.15);
}

//overloading
public Double calcularImposto(Double valor, String tipo){
    return null;
}

}
