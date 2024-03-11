package com.iscram.adapter.rest.movie;

import com.iscram.domain.usecase.ReadMovieUsecase;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.util.List;

@Path("/movie")
public class MovieResource {
    private static final Logger LOG = Logger.getLogger(MovieResource.class);
    @Inject
    ReadMovieUsecase readMovieUsecase;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public List<MovieDto> listMovies() {
        LOG.info("Listing all Movies");
        return readMovieUsecase.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MovieDto movie(@QueryParam("name") String name) {
        LOG.info("Looking for "+name);
        return readMovieUsecase.getMovie(name);
    }
}
