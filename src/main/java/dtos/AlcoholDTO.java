package dtos;

import entities.Alcohol;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RasmusDH
 */
public class AlcoholDTO {
     private Integer id;
    private String name;
    private String type;
    private int price;
    private String description;

    public AlcoholDTO(String name, String type, int price, String description) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.description = description;
    }
    
    public AlcoholDTO (Alcohol c){
        this.id=c.getId();
        this.name = c.getName();
        this.type = c.getType();
        this.price = c.getPrice();
        this.description = c.getDescription();
    }
    
    public static List<AlcoholDTO> getDtos(List<Alcohol> cs){
        List<AlcoholDTO> cdtos = new ArrayList();
        cs.forEach(c->cdtos.add(new AlcoholDTO(c)));
        return cdtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
