/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_02_exercicios;

public class Ex01_Vendas30_Produto {
    
private String codigo;
private Integer quantidade;
private Double valorCompra;
private Double valorVenda;

public Ex01_Vendas30_Produto(String codigo, Integer quantidade, Double valorCompra, Double valorVenda) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

}
