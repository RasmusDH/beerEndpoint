/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author RasmusDH
 */
public class MenuDTO {
    private String name;
    private String description;
    private List<AlcoholDTO> courses;

    public MenuDTO(String name, String description, List<AlcoholDTO> courses) {
        this.name = name;
        this.description = description;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AlcoholDTO> getCourses() {
        return courses;
    }

    public void setCourses(List<AlcoholDTO> courses) {
        this.courses = courses;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.courses);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MenuDTO other = (MenuDTO) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.courses, other.courses)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MenuDTO{" + "name=" + name + ", description=" + description + ", courses=" + courses + '}';
    }

   
    
}
