package hei.tp06.web.controller;


import entity.Evenement;
import org.slf4j.LoggerFactory;
import service.EvenementService;


import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Named
@Path("/tp06-web")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)

public class RestController {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RestController.class);

    @Inject
    private EvenementService evenementService;

    @GET
    @Path("/tp06-web/api/evenements/{id}")
    public List<Evenement> getEvenenement(@PathParam("id") Long id){
        logger.info("Liste des évenements retournée");
        return evenementService.findById(id);
    }

    @GET
    @Path("/tp06-web/api/evenements/")
    public List<Evenement> getEvenenement2(){
        logger.info("Liste des évenements retournée");
        return evenementService.findAll();
    }

    @POST
    @Path("/tp06-web/api/evenements/")
    public void postEvenement(Evenement evenement) {
        logger.info("Nouveau évenement");
        evenementService.saveEvenement(evenement);

    }


}
