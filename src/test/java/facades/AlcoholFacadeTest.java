/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtos.AlcoholDTO;
import entities.Alcohol;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import utils.EMF_Creator;
import entities.AlcoholRepository;

/**
 *
 * @author RasmusDH
 */
public class AlcoholFacadeTest {
    
    private static EntityManagerFactory emf;
    private static AlcoholRepository facade;
    public static Alcohol course1, course2;

    public AlcoholFacadeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
       emf = EMF_Creator.createEntityManagerFactoryForTest();
       facade = AlcoholFacade.getCourseFacade(emf);
    }

   @BeforeEach
    public void setUp() {
        EntityManager em = emf.createEntityManager();
        course1 = new Alcohol("Tuborg classic","øl",25,"4,7% dåse");
        course2 = new Alcohol("Breezer Lemon Lite","cider",40,"4% flaske");
        try {
            em.getTransaction().begin();
            em.createNamedQuery("Alcohol.deleteAllRows").executeUpdate();
            em.persist(course1);
            em.persist(course2);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
     @Test
    void createCourse() {
        AlcoholDTO expected = new AlcoholDTO("name", "type",4,"des");
        AlcoholDTO actual = facade.createAlcohol(expected);
        assertEquals(expected.getName(), actual.getName());
        assertNotNull(actual.getId());
    }
     @Test
    void getAll() {
        List<AlcoholDTO> expected = new ArrayList<>();
        expected.add(new AlcoholDTO(course1));
        expected.add(new AlcoholDTO(course2));

        List<AlcoholDTO> actual = facade.getAll();
        assertEquals(expected.size(), actual.size());
    }
}
