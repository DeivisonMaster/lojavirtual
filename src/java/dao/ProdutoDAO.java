/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.caelum.vraptor.ioc.Component;
import java.util.List;
import model.Produto;
import org.hibernate.LockOptions;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author DeivisondeOliveira
 */

@Component // @Component indica que esta classe é uma dependencia e pode ser instanciada pelo Vraptor
public class ProdutoDAO extends DAO<Produto>{
    
    public void salvar(Produto produto){
        try{
            iniciarTransacao();
            insert(produto);
            confirmarTransacao();
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Erro PRODUTO DAO " + ex.getMessage());
        }
    }
    
    
    public void atualizar(Produto produto){
        try{
            iniciarTransacao();
            update(produto);
            confirmarTransacao();
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Erro UPDATE PRODUTO DAO " + ex.getMessage());
        }
    }
    
    
    public Produto buscaId(Long id){
        try{
            return (Produto) this.session.load(Produto.class, id);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Erro BUSCA ID PRODUTO DAO " + ex.getMessage());
        }
        return null;
    }
    
    
    
    
    public void deletar(Produto produto){
        try{
            iniciarTransacao();
            delete(produto);
            confirmarTransacao();
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Erro DELETE PRODUTO DAO " + ex.getMessage());
        }
    }
    
    
    public List<Produto> listarProdutos(){
        try{
            return this.session.createCriteria(Produto.class).list();
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Erro Lista Produtos DAO " + ex.getMessage());
        }
        return null;
    }
    
    
    public List<Produto> buscaProdutos(String nome){
        try{
            return this.session.createCriteria(Produto.class)
                    .add(Restrictions.ilike("nome", nome, MatchMode.ANYWHERE)).list();
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("Erro BUSCA PRODUTOS DAO " + ex.getMessage());
        }
        return null;
    }
    
    
    public void recarrega(Produto produto){
        this.session.refresh(produto);
    }
    
}
