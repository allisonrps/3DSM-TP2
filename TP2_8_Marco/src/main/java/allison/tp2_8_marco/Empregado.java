/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_8_marco;

/**
 *
 * @author allis
 */
public class Empregado extends Pessoa {
    // acessando variavel nome da classe pai
    //explicitar com supper, pra saber que é da classe pai
    private String nome;
    
    // public void teste(){
    // herança
    
    // super nome = "Maria";
    
    // só dele
    // this.nome = "Mariazinha";
    
    //construtor explicito
    public Empregado() {
        super(); //ocorre automaticamente
        System.out.println("Classe Empregado instanciada");
    }
}