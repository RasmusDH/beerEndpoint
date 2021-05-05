/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.AlcoholDTO;
import entities.Alcohol;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.WebApplicationException;
import entities.AlcoholRepository;

/**
 *
 * @author RasmusDH
 */
public class AlcoholFacade implements AlcoholRepository{

    
    private static AlcoholFacade instance;
    private static EntityManagerFactory emf;
    
    public static AlcoholFacade getCourseFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new AlcoholFacade();
        }
        return instance;
    }
    
    @Override
    public AlcoholDTO getById(int id) throws WebApplicationException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AlcoholDTO> getAll() throws WebApplicationException {
      EntityManager em = emf.createEntityManager();
       List<Alcohol> courses = em.createQuery("SELECT a FROM Alcohol a", Alcohol.class).getResultList();
       return AlcoholDTO.getDtos(courses);
    }

    @Override
    public AlcoholDTO createAlcohol(AlcoholDTO courseDTO) throws WebApplicationException {
       EntityManager em = emf.createEntityManager();
       Alcohol c=new Alcohol(courseDTO);
       try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
       return new AlcoholDTO(c);
    }
    
}
