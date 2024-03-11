package com.iscram.adapter.rest.cast;

import com.iscram.adapter.rest.movie.MovieDto;
import com.iscram.domain.usecase.ReadMovieUsecase;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;
import org.jboss.logging.Logger;

import java.util.List;

@Path("/castMember")
public class CastMemberResource {
    private static final Logger LOG = Logger.getLogger(CastMemberResource.class);
    @Inject
    ReadMovieUsecase readMovieUsecase;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/all")
    public List<MovieDto> listCastMember() {
        LOG.info("Listing all Movies");
        return readMovieUsecase.listAll();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public MovieDto castMember(@QueryParam("name") String name) {
        LOG.info("Looking for "+name);
        return readMovieUsecase.getMovie(name);
    }
}
