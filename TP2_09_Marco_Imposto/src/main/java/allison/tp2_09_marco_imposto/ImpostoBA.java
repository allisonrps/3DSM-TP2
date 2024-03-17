/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_09_marco_imposto;

/**
 *
 * @author allis
 */
public class ImpostoBA extends Imposto {
    
        @Override
    public Double calcularImposto( Double valor) {
        
        if (valor<500) {
                   return super.calcularImposto(valor);
             } else if (valor >=500 && valor <= 50000) {
                   return (valor *0.11);
             } else {
                   return super.calcularImposto(valor) + 1.03;
             }
    }
}
