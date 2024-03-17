/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package allison.tp2_09_marco_imposto;

/**
 *
 * @author allis
 */
public class TP2_09_Marco_Imposto {

    public static void main(String[] args) {
       
    Imposto imposto = new Imposto();
    System.out.println(imposto.calcularImposto(200.00));
            
    Imposto ImpostoMG = new ImpostoMG();
    System.out.println(ImpostoMG.calcularImposto(200.00));
    
    Imposto ImpostoBA = new ImpostoBA();
        System.out.println(ImpostoBA.calcularImposto(2500.00));
    }
}

