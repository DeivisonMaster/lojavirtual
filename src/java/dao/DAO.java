/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FabricaSessoes;

/**
 *
 * @author DeivisondeOliveira
 */
public class DAO<VO>{
    protected   Session session;
    protected   Transaction tx;

    public DAO() {
        this.session    = FabricaSessoes.getSession();
    }
    
    public void iniciarTransacao(){
        this.tx = this.session.beginTransaction();
    }
    
    public void confirmarTransacao(){
        this.tx.commit();
    }
    
    public void cancelarTransacao(){
        this.tx.rollback();
    }
    
    
    
    
    public void insert(VO vo){
        this.session.save(vo);
    }
    
    public void update(VO vo){
        this.session.update(vo);
    }
    
    public void delete(VO vo){
        this.session.delete(vo);
    }
    
}
