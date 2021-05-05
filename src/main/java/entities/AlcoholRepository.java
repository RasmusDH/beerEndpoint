/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import dtos.AlcoholDTO;
import java.util.List;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author RasmusDH
 */
public interface AlcoholRepository {

    public AlcoholDTO getById(int id) throws WebApplicationException;

    public List<AlcoholDTO> getAll() throws WebApplicationException;

    public AlcoholDTO createAlcohol(AlcoholDTO courseDTO) throws WebApplicationException;

}