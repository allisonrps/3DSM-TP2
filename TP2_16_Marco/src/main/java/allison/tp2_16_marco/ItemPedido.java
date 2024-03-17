/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_16_marco;

/**
 *
 * @author allis
 */
public class ItemPedido {
    
private Integer codigo;
private Integer quantidadeVendida;
private Produto produto;

public Integer getCodigo() {
        return codigo;
    }

public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

public Integer getQuantidadeVendida() {
        return quantidadeVendida;
    }

public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida = quantidadeVendida;
    }

public Produto getProduto() {
        return produto;
    }

public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
}
