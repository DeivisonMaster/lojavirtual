/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.ProdutoDAO;
import java.util.List;
import model.Produto;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FabricaSessoes;

/**
 *
 * @author DeivisondeOliveira
 */
public class Testes {
    public static void main(String[] args) {
        Produto   produto = new Produto();
        Session     sessao  = FabricaSessoes.getSession();
        
        Transaction tx;
        tx  = sessao.beginTransaction();
        produto.setNome("sabonete");
        produto.setDescricao("para acne");
        produto.setPreco(2.50);
        sessao.save(produto);
        System.out.println("Produto salvo");
        tx.commit();
        
        
//        ProdutoDAO      dao = new ProdutoDAO();
//        ProdutosController  pc  = new ProdutosController(dao);
//        
//        List<Produto>   lista   = pc.lista();
//        for(Produto produtos : lista){
//            System.out.println("nome " + produtos.getNome());
//            System.out.println("nome " + produtos.getDescricao());
//            System.out.println("nome " + produtos.getPreco());
//        }
    }
}
