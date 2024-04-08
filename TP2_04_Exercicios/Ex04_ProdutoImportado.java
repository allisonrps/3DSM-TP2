/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author allis
 */
public class Ex04_ProdutoImportado extends Ex04_ProdutoNacional {
    private final double taxaImportacao;
    
    public Ex04_ProdutoImportado(String descricao, double valor) {
        super(descricao, valor);
        this.taxaImportacao = 0.05;
    }

    @Override
    public void relatorio() {
        double valorFinal = valor + (valor * imposto) + (valor * taxa) + (valor * taxaImportacao);
        System.out.println("Produto Importado: " + descricao + ", R$" + valor + ", Imposto: " + (imposto * 100) + "% - Taxa: " + (taxa * 100) + "% - Taxa de Importação: " + (taxaImportacao * 100) + "% - Valor FINAL: R$" + valorFinal);
    }
}

