/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_09_marco_imposto;

/**
 *
 * @author allis
 */
public class ImpostoMG extends Imposto {
    
        @Override
    public Double calcularImposto( Double valor) {
        
        if (valor<100) {
                   return super.calcularImposto(valor);
             } else if (valor >=100 && valor <= 1000) {
                   return (valor *0.12);
             } else {
                   return (valor * 0.18);
             }  
    }
}