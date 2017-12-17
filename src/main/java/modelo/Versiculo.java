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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author rafao
 */
@Entity
@Table(name = "verses")
@AttributeOverride(name = "id", column = @Column(name = "id",  
        nullable = false, columnDefinition = "BIGINT UNSIGNED"))
public class Versiculo extends AbstractModel implements Serializable{
    
    @Column(name = "version")
    private String versao;
    
    @JoinColumn(name = "book")
    @ManyToOne
    private Livro livro;
    
    @Column(name = "chapter")
    private Integer capitulo;
    
    @Column(name = "verse")
    private Integer versiculo;
    
    @Column(name = "text")
    private String texto;

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Integer getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Integer capitulo) {
        this.capitulo = capitulo;
    }

    public Integer getVersiculo() {
        return versiculo;
    }

    public void setVersiculo(Integer versiculo) {
        this.versiculo = versiculo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
