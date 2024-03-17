/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_8_marco;

/**
 *
 * @author allis
 */
public class Pessoa {
    protected String nome;
    protected Integer cpf;
    //nivel de acesso, permite o filho acessar
    
    //construtor explicito
    public Pessoa() {
        System.out.println("Classe pessoa instanciada");
    }
    
    public void quemSouEu(){
       System.out.println ("Pessoa");
    }
    
    //Aqui dentro todo mundo acessa todo mundo
    
    // Encapsular para conseguir acessar de fora, tem q ser public
public String getNome() {
    return this.nome;
}   

public void setNome(String nome) {
    this.nome = nome;
//referindo a variavel nome que está nessa classe
}

public Integer getIdade() {
    return this.idade;
}

public void setIdade(Integer idade) {
    this.idade = idade;
}
}








        
