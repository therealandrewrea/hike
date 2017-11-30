package org.launchcode.Hike.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class tags {

    @NotNull
    @Size(min=3, max=20, message = "Tags must be longer than 3 characters and shorter than 20")
    private String name;

    @Id
    @GeneratedValue
    private int id;

    public tags () {} //default constructor//

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
