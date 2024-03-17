/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_8_marco;

/**
 *
 * @author allis
 */
public class HerancaExtends {
    //não permite herança multipla
    //protected = protegido, só a classe filho acessa, permite acesso na herança e no pacote
    //protected =
    //super = usando atributo da classe do pai
    //this = usa o seu atributo
    //construtor = new
    
    protected String nome;
    protected Integer idade;
    
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
