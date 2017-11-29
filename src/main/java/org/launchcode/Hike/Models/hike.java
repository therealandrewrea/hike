package org.launchcode.Hike.Models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class hike {

    @NotNull
    @Size(min=3, max=25)
    private String name;
    @NotNull
    private String description;
    @NotNull
    private String location;
    private int hikeId;
    private static int nextId = 1;

//  just including text added fields for now, location may ultimately be coordinates //
//  tags may be included in this class/object as well, need to see what works best //


    public hike(String name, String description, String location) {
        this();
        this.name = name;
        this.description = description;
        this.location = location;
    }
    public hike() {
        hikeId = nextId;
        nextId++;
    }

    public int getHikeId() {
        return hikeId;
    }

    public void setHikeId(int hikeId) {
        this.hikeId = hikeId;
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
}
