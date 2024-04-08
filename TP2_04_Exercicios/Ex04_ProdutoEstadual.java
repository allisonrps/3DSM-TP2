/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allis
 */
public class Ex04_ProdutoEstadual extends Ex04_Produtos{
    public Ex04_ProdutoEstadual(String descricao, double valor) {
        super(descricao, valor);
        this.imposto = 0.10;
    }

    @Override
    public void relatorio() {
        double valorFinal = valor + (valor * imposto);
        System.out.println("Produto Estadual: " + descricao + ", Valor: R$" + valor + ", Imposto: " + (imposto * 100) + "%, Valor Final: R$" + valorFinal);
    }
}
