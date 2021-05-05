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
        AlcoholDTO cdto1 = new AlcoholDTO("Tuborg classic","øl",25,"4,7% dåse");
        AlcoholDTO cdto2 = new AlcoholDTO("Realzin Zinfandel Salento","rødvin",70,"13% 75 CL.");
        AlcoholDTO cdto3 = new AlcoholDTO("Carlsberg Pilsner","øs",30,"4,6% dåse");
        AlcoholDTO cdto4 = new AlcoholDTO("Breezer Lemon Lite","cider",40,"4% flaske");
        AlcoholFacade facade=AlcoholFacade.getCourseFacade(EMF);
        facade.createAlcohol(cdto1);
        facade.createAlcohol(cdto2);
        facade.createAlcohol(cdto3);
        facade.createAlcohol(cdto4);
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
