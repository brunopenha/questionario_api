package br.nom.penha.bruno.filtros;

import io.vertx.core.http.HttpServerRequest;
import org.jboss.logging.Logger;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.ext.Provider;
import java.io.IOException;

@Provider
public class FiltroRegistroAcesso implements ContainerRequestFilter {

    private static final Logger LOG = Logger.getLogger(FiltroRegistroAcesso.class);

    @Context
    UriInfo info;

    @Context
    HttpServerRequest requisicao;

    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
        final String metodo = containerRequestContext.getMethod();
        final String path = info.getPath();
        final String endereco = requisicao.remoteAddress().toString();

        LOG.infof("Requisicao feita para %s %s do IP %s", metodo, path, endereco);
    }
}
