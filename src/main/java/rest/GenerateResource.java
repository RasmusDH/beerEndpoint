/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;


import dtos.AlcoholDTO;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import rest.provider.Provider;
import entities.Alcohol;
import facades.AlcoholFacade;
/**
 * REST Web Service
 *
 * @author RasmusDH
 */
@Path("generate")
public class GenerateResource extends Provider{

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenerateResource
     */
    public GenerateResource() {
    }

    /**
     * Retrieves representation of an instance of rest.GenerateResource
     * @return an instance of java.lang.String
     */
   
    @Override
    public Response getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response getAll() {
        AlcoholDTO alcoholdto1 = new AlcoholDTO("Tuborg classic","beer",2,"4,7% can");
        AlcoholDTO alcoholdto2 = new AlcoholDTO("Realzin Zinfandel Salento","redwine",20,"13% 75 CL.");
        AlcoholDTO alcoholdto3 = new AlcoholDTO("Carlsberg Pilsner","beer",2,"4,6% can");
        AlcoholDTO alcoholdto4 = new AlcoholDTO("Breezer Lemon Lite","cider",4,"4% bottle");
        AlcoholDTO alcoholdto5 = new AlcoholDTO("2020 Pinot Grigio Veneto Castel del Lago","whitewine",20,"13% 75 CL.");
        AlcoholDTO alcoholdto6 = new AlcoholDTO("2018 Borgo Al Passo Chianti Nuova Generazione","redwine",20,"13% 75 CL.");
        AlcoholDTO alcoholdto7 = new AlcoholDTO("2018 Château La Tonnelle Cru Bourgeois Haut-Médoc","redwine",20,"13% 75 CL.");
        AlcoholDTO alcoholdto8 = new AlcoholDTO("2016 Château La Tonnelle Cru Bourgeois Haut-Médoc","redwine",20,"13% 75 CL.");
        AlcoholFacade facade=AlcoholFacade.getCourseFacade(EMF);
        facade.createAlcohol(alcoholdto1);
        facade.createAlcohol(alcoholdto2);
        facade.createAlcohol(alcoholdto3);
        facade.createAlcohol(alcoholdto4);
        facade.createAlcohol(alcoholdto5);
        facade.createAlcohol(alcoholdto6);
        facade.createAlcohol(alcoholdto7);
        facade.createAlcohol(alcoholdto8);
        return Response.ok("Menu generated").build();
    }

    @Override
    public Response create(String jsonBody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response update(int id, String jsonBody) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Response delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
