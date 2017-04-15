/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DeivisondeOliveira
 */

@Component
@SessionScoped
public class Carrinho {
    private List<Item>  itens;
    private Double      total = 0.0;

    public Carrinho() {
        this.itens  = new ArrayList<>();
    }
    
    
    public void adiciona(Item item){
        this.itens.add(item);
        this.total += item.getProduto().getPreco() * item.getQuantidade();
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    // retorna o total de itens
    public Integer  getTotalDeItens(){
        return itens.size();
    }
}
