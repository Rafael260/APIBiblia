/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import javax.ejb.Stateless;
import modelo.Livro;

/**
 *
 * @author rafao
 */
@Stateless
public class LivroDAO extends AbstractDAO<Livro>{
    
    public LivroDAO() {
        super(Livro.class);
    }
    
    public Livro encontrarLivroPorNome(String nome){
        return null;
    }
}
