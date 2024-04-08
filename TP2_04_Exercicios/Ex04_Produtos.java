/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allis
 */
public abstract class Ex04_Produtos {
    protected String descricao;
    protected double valor;
    protected double imposto;

    public Ex04_Produtos(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public abstract void relatorio();
}