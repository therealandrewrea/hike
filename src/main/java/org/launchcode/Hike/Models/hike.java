package org.launchcode.Hike.Models;

import com.sun.javafx.beans.IDProperty;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class hike {

    @NotNull
    @Size(min=3, max=25, message="The hike name should be between 3 and 25 characters.")
    private String name;
    @NotNull
    @Size(min=15, message="Please provide a longer description - tell fellow hiker's what it's like!")
    private String description;
    @NotNull
    @Size(min=1, message="Let us know what park or area the hike is in.")
    private String location;

    @Id
    @GeneratedValue
    public int id;

    @ManyToMany
    private List<tags> tagsList;

//  just including text added fields for now, location may ultimately be coordinates //
//  tags may be included in this class/object as well, need to see what works best //

    public hike(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }
    public hike() {}

    public int getId() {
        return id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Tag management additions and methods //

    public List<tags> getTagsList() {
        return tagsList;
    }

    public void addTag (tags newTag) {tagsList.add(newTag);}
}
