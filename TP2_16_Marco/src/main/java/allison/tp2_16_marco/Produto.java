/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_16_marco;
import java.util.Random;
/***/
public class Produto {
  private Integer codigo;
  private String descricao;
  private Double valorUnitario;

public static Produto gerarDadosProduto() {
    Random randon = new Random();
    Produto novoProduto = new Produto();
    novoProduto.setCodigo(randon.nextInt());
    novoProduto.setValorUnitario(randon.nextDouble());
    novoProduto.setDescricao("Produto " + randon.nextInt());
    
    return novoProduto;
}
  
    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(Double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
  
}
