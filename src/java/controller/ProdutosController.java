/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author DeivisondeOliveira
 */

@Resource
public class ProdutosController {
    private Produto             produto;
    private List<Produto>       listaProdutos;
    private final ProdutoDAO    pdao;
    private final Result        result;
    
    

    public ProdutosController(ProdutoDAO dao, Result result) {
        this.pdao       = dao;
        this.produto    = new Produto();
        this.result     = result;
    }
    
    public void adiciona(Produto produto){
        pdao.salvar(produto);
        result.redirectTo(this).lista();
    }
    
    
    public Produto edita(Long id){
        return pdao.buscaId(id);
    }
    
    public void altera(Produto produto){
        pdao.atualizar(produto);
        result.redirectTo(this).lista();
    }
    
    public void remove(Long id){
        Produto pRemove = pdao.buscaId(id);
        pdao.deletar(pRemove);
        result.redirectTo(this).lista();
    }
    

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    //@Path("/")
    public List<Produto>  lista(){
        return pdao.listarProdutos();
    }
    
    public void formulario(){
        
    }

//    public List<ProdutoVO> getListaProdutos() {
//        if(this.listaProdutos == null){
//            this.listaProdutos = new ArrayList<>();
//            this.listaProdutos = pdao.listarProdutos();
//        }
//        return listaProdutos;
//    }
//
//    public void setListaProdutos(List<ProdutoVO> listaProdutos) {
//        this.listaProdutos = listaProdutos;
//    }
    
    
}
