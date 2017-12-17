/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dados.LivroDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Livro;

/**
 *
 * @author rafao
 */
@Stateless
@Path("livro")
public class LivroWS{

    @Inject LivroDAO livroDAO;

    public LivroWS() {
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Livro find(@PathParam("id") Long id) {
        return livroDAO.encontrar(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Livro> findAll() {
        return livroDAO.listar();
    }
}
