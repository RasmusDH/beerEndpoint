/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import facades.MenuFacade;
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
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import javax.persistence.EntityManagerFactory;
import static rest.provider.Provider.EMF;
import utils.EMF_Creator;
/**
 * REST Web Service
 *
 * @author RasmusDH
 */
@Path("menu")
public class MenuResource {
 Gson gson = new Gson();
  EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory();
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of MenuResource
     */
    public MenuResource() {
    }

    /**
     * Retrieves representation of an instance of rest.MenuResource
     * @return an instance of java.lang.String
     */
    


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getAll() {
        MenuFacade mf=MenuFacade.getMenuFacade(EMF);
       return (gson.toJson(mf.getMenu()));
    }

    
    /* RenameMeDTO dto = null;
        try {
            String JsonResponse = HttpUtil.fetchData("www.google.com");
            dto = gson.fromJson(JsonResponse, RenameMeDTO.class);
        } catch (Exception e) {
        }
        return gson.toJson(dto);*/
  

  
}
