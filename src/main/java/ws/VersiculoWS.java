/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import dados.VersiculoDAO;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Versiculo;

/**
 *
 * @author rafao
 */
@Stateless
@Path("versiculo")
public class VersiculoWS{

    @Inject VersiculoDAO versiculoDAO;
    
    public VersiculoWS() {
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Versiculo find(@PathParam("id") Long id) {
        return versiculoDAO.encontrar(id);
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Versiculo> findAll() {
        return versiculoDAO.listar();
    }
}
