/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.util.List;
import javax.ejb.Stateless;
import modelo.Livro;
import modelo.Versiculo;

/**
 *
 * @author rafao
 */
@Stateless
public class VersiculoDAO extends AbstractDAO<Versiculo>{
    
    public VersiculoDAO(){
        super(Versiculo.class);
    }
    
    public List<Versiculo> encontrarVersiculosPorTexto(String texto){
        List<Versiculo> versiculos = null;
        
        return versiculos;
    }
    
    public Versiculo encontrarVersiculoPorLivroCapituloEVersiculo(Livro livro, Integer capitulo, Integer versiculo){
        return null;
    }
}
