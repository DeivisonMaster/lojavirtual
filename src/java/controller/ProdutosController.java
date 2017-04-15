/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.ValidationMessage;
import static br.com.caelum.vraptor.view.Results.json;
import dao.ProdutoDAO;
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
    private final Validator     validator;
    
    
    

    public ProdutosController(ProdutoDAO dao, Result result, Validator validator) {
        this.pdao       = dao;
        this.produto    = new Produto();
        this.result     = result;
        this.validator  = validator;
    }
    
    public void adiciona(Produto produto){
        if(produto.getNome() == null || produto.getNome().length() < 3){
            validator.add(new ValidationMessage("Nome é obrigatório e precisar"
                    + " ter mais de 3 caracteres", "produto.nome"));
            validator.onErrorUsePageOf(this).formulario();
        }
        if(produto.getDescricao() == null || produto.getDescricao().length() < 10){
            validator.add(new ValidationMessage("Descrição é obrigatória e"
                    + " não pode ter menos que 40 letras", "produto.descricao"));
            validator.onErrorUsePageOf(this).formulario();
        }
        if(produto.getPreco() == null || produto.getPreco() <= 0.0){
            validator.add(new ValidationMessage(""
                    + "O campo Preço é obrigatorio e precisa ser positivo","produto.preco"));
            validator.onErrorUsePageOf(this).formulario();
        }
        pdao.salvar(produto);
        result.redirectTo(this).lista();
    }
    
    //@Path("/produto/{id}/edita")
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
    
    
    //@Path("/produtos")
    public List<Produto>  lista(){
        return pdao.listarProdutos();
    }
    
    public void formulario(){
    }
    
    
    public List<Produto>  busca(String nome){
        result.include("nome", nome);
        return pdao.buscaProdutos(nome);
    }

//    @Get("/produtos/busca.json")
//    public void buscaJson(String q){
//        result.use(json()).withoutRoot()
//                .from(pdao.buscaProdutos(q))
//                .exclude("id","descricao")
//                .serialize();
//    }
    
    
    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
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
