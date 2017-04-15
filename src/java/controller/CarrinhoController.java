/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.ProdutoDAO;
import model.Carrinho;
import model.Item;

/**
 *
 * @author DeivisondeOliveira
 */

@Resource
public class CarrinhoController {
    private final   Carrinho    carrinho;
    private final   ProdutoDAO  dao;
    private final   Result      result;

    
    public CarrinhoController(Carrinho carrinho, ProdutoDAO dao, Result result) {
        this.carrinho = carrinho;
        this.dao      = dao;
        this.result   = result;
    }
    
    
    @Post @Path("/carrinho")
    public void adiciona(Item item){
        dao.recarrega(item.getProduto());  // busca informações no BD e atualiza o proprio objeto passado
        carrinho.adiciona(item);
        
        result.redirectTo(this).visualiza();
    }
    
    @Get  @Path("/carrinho")
    public void visualiza(){
    }
    
    
    
}
