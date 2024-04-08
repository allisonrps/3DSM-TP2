/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allis
 */
public class Ex04_ProdutoNacional extends Ex04_Produtos {
        double taxa;

    public Ex04_ProdutoNacional(String descricao, double valor) {
        super(descricao, valor);
        this.imposto = 0.10;
        this.taxa = 0.05; 
    }

    @Override
    public void relatorio() {
        double valorFinal = valor + (valor * imposto) + (valor * taxa);
        System.out.println("Produto Nacional: " + descricao + ", Valor: R$" + valor + ", Imposto: " + (imposto * 100) + "%, Taxa: " + (taxa * 100) + "%, Valor Final: R$" + valorFinal);
    }
}
