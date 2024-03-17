/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package allison.tp2_16_marco;
import java.util.List;

public class Pedido {
 private Integer codigo;    
 private String cliente;
 private TipoVendaEnum tipoVenda;
 private List<ItemPedido> items;
 
// Encapsular para conseguir acessar de fora, tem q ser public
public Integer getCodigo() {
    return this.codigo;
 }   

public void setCodigo(Integer codigo) {
    this.codigo = codigo;
 }

public String getCliente() {
    return this.cliente;
 }   

public void setCliente(String cliente) {
    this.cliente = cliente;
 }

public TipoVendaEnum getTipoVenda() {
    return tipoVenda;
}

public void setTipoVenda(TipoVendaEnum tipoVenda) {
    this.tipoVenda = tipoVenda;
}

public List<ItemPedido> getItems() {
        return items;
    }

public void setItems(List<ItemPedido> items) {
        this.items = items;
    }

}
