/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author DeivisondeOliveira
 */


/*
    HIBERNANTE VALIDATOR:

    @NotNull,           para campos obrigatórios
    @NotEmpty,          idem, mas também não aceita String vazia
    @Length,            para impor restrições sobre o tamanho (min e max)
    @Min e @Max,        para restringir o valor de números
    @Past e @Future,    para impor restrições temporais
    @Pattern,           para restringir valores usando uma expressão regular
    @Email,             conferir validade de e-mail
*/

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long    id;
    
    @Column(nullable = false)
    private String  nome;
    private String  descricao;
    private Double  preco;

    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    
}
