package br.nom.penha.bruno.resources.acesso;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/acesso")
public class AcessoResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public String acesso(){
        return "";
    }
}
