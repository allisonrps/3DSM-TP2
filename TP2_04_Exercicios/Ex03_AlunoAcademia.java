/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allis
 */
public class Ex03_AlunoAcademia {
    private int identificador;
    private String nome;
    private int idade;
    private double peso;
    private double altura;
    
    //CONSTRUTORES
    // Sem parâmetros
    public Ex03_AlunoAcademia() {
    }
    // Com parâmetros
    public Ex03_AlunoAcademia (int identificador, String nome, int idade, double peso, double altura) {
        this.identificador = identificador;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }
  // GETTERS AND SETTERS
    public int getIdentificador() {
        return identificador;
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    // MÉTODO PARA EXIBIR OS DADOS
    public void exibir() {
        System.out.println("Identificador: " + identificador + ", Nome: " + nome + ", Idade: " + idade + ", Peso: " + peso + ", Altura: " + altura);
    }
    // Calculando IMC
    public float calcularIMC() {
        return (float) (peso / (altura * altura));
    }
}

