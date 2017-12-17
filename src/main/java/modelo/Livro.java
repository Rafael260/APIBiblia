/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author rafao
 */
@Entity
@Table(name = "books")
@AttributeOverride(name = "id", column = @Column(name = "id",  
        nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class Livro extends AbstractModel implements Serializable{
    
    @Column(name = "name")
    private String nome;
    
    @Column(name="abbrev")
    private String abreviacao;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

}
